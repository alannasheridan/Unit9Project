class ChineseMoneyPlant extends Succulent {
    
    private String leafColor;
    private String stemColor;

    public ChineseMoneyPlant(){
        super(0, 0, true, 0, false);
        leafColor = null;
        stemColor = null;
    }
    
    public ChineseMoneyPlant(int h, int daysW, boolean dry, int daysT, boolean droop, String l, String  s){
        super(h, daysW, dry, daysT, droop);
        leafColor = l;
        stemColor = s;
    }

    public String getLeaf(){
        return leafColor;
    }

    public String getStem(){
        return stemColor;
    }

    public void setLeaf(String l){
        leafColor = l;
    }

    public void seetStem(String s){
        stemColor = s;
    }

    public String toString(){
        return super.toString() + ", Leaf color:" + leafColor + ", Stem color:" + stemColor;
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

    public String pluckLeaves(){
        if (leafColor.equalsIgnoreCase("yellow")){
            return "There are some yellow, dying leaves on this plant, caefully pluck yellow leaves to avoid further spreading.";
        }
        return "There are no dying leaves, but if you see dying yellow ones carefully pluck them.";
    }
}
