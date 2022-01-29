public class Reptile extends Vertebrate {

    public String name;
    public String kind = "Reptile";
    public String getHair;
    public String getFeathers;
    public String getEggs;
    public String getMilk;
    public String getAirborne;
    public String getAquatic;
    public String getVenomous;
    public String getFins;
    public String getLegs;
    public String getTail;


    // Amphibian class constructor
    Reptile(String name, String hair, String feathers, String eggs, String milk, String airborne, String aquatic, String venomous, String fins, String legs, String tail, String class_type) {

        numberofLegs = Integer.parseInt(legs);
        this.name = name;
        if (hair.equals("1")) {
            hasHair = true;
            getHair = "It has hair. \n";
        } else getHair = "";
        if (feathers.equals("1")) {
            hasFeathers = true;
            getFeathers = "It has feathers. \n";
        } else getFeathers = "";
        if (eggs.equals("1")) {
            hasEggs = true;
            getEggs = "It lays eggs. \n";
        } else getEggs = "";
        if (milk.equals("1")) {
            hasMilk = true;
            getMilk = "It gives milk. \n";
        } else getMilk = "";
        if (airborne.equals("1")) {
            isAirborne = true;
            getAirborne = "It is airborne. \n";
        } else getAirborne = "";
        if (aquatic.equals("1")) {
            isAquatic = true;
            getAquatic = "It is aquatic. \n";
        } else getAquatic = "";
        if (venomous.equals("1")) {
            isVenomous = true;
            getVenomous = "Careful! It is venomous. \n";
        } else getVenomous = "";
        if (fins.equals("1")) {
            hasFins = true;
            getFins = "It has fins. \n";
        } else getFins = "";
        if (!legs.equals("0")) {
            getLegs = "It has " + numberofLegs + " legs. " + '\n';
        } else getLegs = "";
        if (tail.equals("1")) {
            hasTail = true;
            getTail = "It has a tail. \n";
        } else getTail = "";

    }

    public String speak() {
        return super.speak() + " Scaly legs.";
    }

    public String speak(String brrr) {
        return "The " + name + " says " + brrr;
    }

    // toString() method to display
    // the animal data
    public String toString() {
        return "The " + name + " is type " + kind + "\n" +
                getHair + getFeathers + getEggs + getMilk + getAirborne + getAquatic + getVenomous + getFins + getLegs + getTail;

    }
}
