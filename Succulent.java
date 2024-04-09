class Succulent extends Plant {
    
    private int daysSinceTurned;
    private boolean drooping;

    public Succulent(){
        super(11, 3,true);
        daysSinceTurned = 0;
        drooping = true;

    }
    public Succulent(int h, int daysW, boolean dry, int daysT, boolean d){
        super(h, daysW, dry);
        daysSinceTurned = daysT;
        drooping = d;
    }

    public int getDaysT(){
        return daysSinceTurned;
    }

    public void setDaysT(int daysT){
        daysSinceTurned = daysT;
    }

    public boolean getDrooping(){
        return drooping;
    }

    public void setDrooping(boolean d){
        drooping = d;
    }

    public String toString(){
        return super.toString() + ", Days since last turned:" + daysSinceTurned + " days, Drooping: " + drooping;
    }
    public String waterPlant(){
        
        String message = "Try again.";
        if((daysSinceWatered >= 7) && (drySoil)){
            message = "Water the plant";
        }
        if((daysSinceWatered < 7) && (drySoil)){
            int daysLeft = 7 - daysSinceWatered;
            message = "Wait " + daysLeft + " days to  water the plant, even though the soil is dry.";
        }
        if((daysSinceWatered >= 7) && (!drySoil)){
            message = "Wait until the soil is dry to water the plant, even though it's been at least a week.";
        }
            return message;
    }

    public String determineTurn(){
        if (daysSinceTurned >= 7){
            return "Turn the plant slightly";
        }
        int daysLeft = 7 - daysSinceTurned;
        return "Wait " + daysLeft + " days before turning the plant";

    }

    public String sunExposure(){
        if (drooping){
            return "This plant is drooping! This is from not getting enough sun exposure. Make sure you remeber to keep it by a window and turn it regularly. ";
        }
        return "This plant is getting good sun exposure";
    }

}
