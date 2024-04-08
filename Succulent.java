class Succulent extends Plant {
    
    private int daysSinceTurned;

    public Succulent(){
        super(0, 0,true);
        daysSinceTurned = 0;

    }
    public Succulent(int h, int daysW, boolean dry, int daysT){
        super(h, daysW, dry);
        daysSinceTurned = daysT;
    }

    public String toString(){
        super.toString();
        return ", Days since last turned:" + daysSinceTurned + "days";
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
            message = "Wait until the soil is dry to water the plant, even though it's been a week.";
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

}
