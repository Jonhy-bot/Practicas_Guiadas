
public class Main {
    public static void main(String[] args) {
        /*
         * int[] numbers = { 10, 20, 30, 40, 50 };
         * String[] fruits = new String[3];
         * 
         * System.out.println(numbers[2]);
         * System.out.println(fruits[2]);
         */

        /*
         * Person person = new Person("Jona", 19, 1);
         * 
         * for (Pet pet : person.getPets()) {
         * System.out.println("Pet: " + pet.getPetName());
         * }
         */

        Person person = new Person("Jona", 19, 1);
        Pet pet1 = new Pet("Bella", "Dog");

        if (person.addPet(pet1)) {
            IOManager.printlnMessage("Pet added successfully");
        } else {
            IOManager.printlnMessage("Fail, try again");
        }

        /*
         * if (person.removePet(pet1)) {
         * IOManager.printlnMessage("Pet remove successfully");
         * } else {
         * IOManager.printlnMessage("Fail, try again");
         * }
         */

        if (person.getPets().length == 0) {
            IOManager.printlnMessage("No pets found");
        } else {
            for (Pet pet : person.getPets()) {
                IOManager.printlnMessage(pet.getPetName());
            }

        }

        if (person.upadatePets(pet1, 0)) {
            IOManager.printlnMessage("Uptede successfully");
        } else {
            IOManager.printlnMessage("Fail, try again");
        }

    }
}