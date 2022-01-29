import java.io.*;
import java.util.*;
import java.lang.*;

public class EKAnimalProject {

    ArrayList<Animal> arr = new ArrayList<Animal>();

    public static void main(String[] args) {

        EKAnimalProject ek = new EKAnimalProject();
        ek.read();//Reading file and adding the file data to the Animal array
        System.out.println("Welcome");
        ek.menu();//Getting user input and printing output accordingly

    }

    //Getting user input and printing output accordingly
    public void menu() {

        //Getting user input
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What animal would you like to know about? (e.g: Lion, Bear, Chicken...)");
        String userInput = scan.nextLine();  // Read user input

        //Menu options
        if (userInput.equals("all")) { //Print all animals' data
            for (Animal animal : arr) {
                String output = animal.toString() + animal.speak();
                System.out.println(output);
                System.out.println();

                //WRITE TO FILE
                try {
                    BufferedWriter fw = new BufferedWriter(new FileWriter("animal_farm.txt", true));
                    String emp = "\t";
                    fw.write(output + "\n");
                    fw.write(emp + "\n");
                    fw.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        }
        // Exit the program
        else if (userInput.equals("exit")) {
            System.exit(0);
        }
        // Print list of commands and start over
        else if (userInput.equals("?")) {
            System.out.println("• all – write all animals to output file\n" +
                    "• exit – quit the program\n" +
                    "• ? – see a list of these commands\n" +
                    "• who – print author name and program name.\n" +
                    "• <animal name> - without the brackets. If this is an animal, print it out, otherwise print an error message");
            menu();
        }
        // Print author and program name
        else if (userInput.equals("who")) {
            System.out.println("Zoo Project by Elom Kponmassi");
        }
        //Print for animal
        else if (arr.toString().contains(" " + userInput.toLowerCase() + " ")) {
            for (Animal animal : arr) {
                if (animal.toString().contains(" " + userInput.toLowerCase() + " ")) {
                    System.out.println(animal.toString() + animal.speak());
                    System.out.println(animal.speak("Hello!")); //Input what you want it to say
                }
            }
            menu();
        }
        // Print Error message
        else {
            System.out.println("Error. Input not supported");
            menu();
        }
    } // End of menu method

    //Reading file and adding the file data to the Animal array
    public void read() {

        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("zoo_animals.csv"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                switch (values[11]) {
                    case "1": {
                        Animal x = new Mammal(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        arr.add(x);
                        break;
                    }
                    case "2": {
                        Animal x = new Bird(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        arr.add(x);
                        break;
                    }
                    case "3": {
                        Animal x = new Reptile(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        arr.add(x);
                        break;
                    }
                    case "4": {
                        Animal x = new Fish(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        arr.add(x);
                        break;
                    }
                    case "5": {
                        Animal x = new Amphibian(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        arr.add(x);
                        break;
                    }
                    case "6": {
                        Animal x = new Bug(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        arr.add(x);
                        break;
                    }
                    case "7": {
                        Animal x = new Otherinvertabrate(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        arr.add(x);
                        break;
                    }
                }
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
