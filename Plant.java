class Plant {
    
    private int height;
    protected int daysSinceWatered;
    protected boolean drySoil;

    public Plant(){
        height = 5;
        daysSinceWatered = 7;
        drySoil = true;
    }

    public Plant(int h, int daysW, boolean dry){
        height = h;
        daysSinceWatered = daysW;
        drySoil = dry;
    }

    public int getHeight(){
        return height;
    }
    
    public int getDaysW(){
        return daysSinceWatered;
    }

    public boolean getDry(){
        return drySoil;
    }

    public void setHeight(int h){
        height = h;
    }

    public void setDaysW(int daysW){
        daysSinceWatered = daysW;
    }

    public void setDry(boolean d){
        drySoil = d;
    }

    public String toString(){
        return "Height:" + height + " inches, Days since last watered:" + daysSinceWatered + " days, Dry soil:" + drySoil;
    }

    public String waterPlant(){
        
        String message = "Try again.";
        if((daysSinceWatered >= 3) && (drySoil)){
            message = "Water the plant, it's been " + daysSinceWatered + " days and it has dry soil.";
        }
        if((daysSinceWatered < 3) && (drySoil)){
            message = "Water the plant. It hasn't been 3 days, but the soil is dry.";
        }
        if((daysSinceWatered >= 3) && (!drySoil)){
            message = "Even though its been " + daysSinceWatered + " days, don't water the plant since the soil is still damp.";
        }
            return message;
    }

    public String determineSize(){
        if (height < 6){
            return "This is a small sized plant.";
        }
        if ((height >= 6) && (height < 11)){
            return "This is a medium sized plant.";
        }
        return "this is a large plant";
    }
}
