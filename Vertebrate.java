public class Vertebrate extends Animal {

    boolean hasBackbone = true;

    public String speak() {
        if (numberofLegs == 4) {
            return "\t Quote: Four legs good.";
        } else if (numberofLegs == 2) {
            return "\t Quote: Two legs nice.";
        } else return "\t Quote: No legs sad.";
    }

}
