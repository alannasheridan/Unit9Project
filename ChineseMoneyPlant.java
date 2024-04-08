class ChineseMoneyPlant extends Succulent {
    
    private String leafColor;
    private String stemColor;

    public ChineseMoneyPlant(){
        super(0, 0, true, 0);
        leafColor = null;
        stemColor = null;
    }
    
    public ChineseMoneyPlant(int h, int daysW, boolean dry, int daysT, String l, String  s){
        super(h, daysW, dry, daysT);
        leafColor = l;
        stemColor = s;
    }

    public String toString(){
        super.toString();
        return ", Leaf color:" + leafColor + ", Stem color:" + stemColor;
    }

    public String waterPlant(){
        super.waterPlant();
        //System.out.println("If the chinese money plant has root rot, it may be from over watering. Make sure the soil is dry before watering it.");
        return "If the chinese money plant has root rot, it may be from over watering. Make sure the soil is dry before watering it.";
    }

    public String determineRot(){
        //boolean rootRot = false;
        if ((leafColor.equalsIgnoreCase("yellow") && (stemColor.equalsIgnoreCase("black")))){
            //rootRot = true;
            return "This chinese money plant has root rot! Try repotting it.";
        }
        if ((leafColor.equalsIgnoreCase("yellow") || (stemColor.equalsIgnoreCase("black")))){
            return "This chinese money plant shows signs of root rot, watch it closely.";
        }
        return "This chinese money plant seems healthy, but watch out for yellow leaves and black stems.";
    } 
}
