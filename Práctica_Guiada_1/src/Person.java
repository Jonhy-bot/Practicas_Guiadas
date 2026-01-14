public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    public Person(String name, int age, int size) {
        this.name = name;
        this.age = age;
        this.petManager = new PetManager(size);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean addPet(Pet pet) {
        return petManager.addPet(pet);
    }

    public boolean removePet(Pet pet) {
        return petManager.removePet(pet);
    }

    public Pet[] getPets() {
        return petManager.getPets();
    }

    public boolean upadatePets(Pet pet, int index) {
        return petManager.upadatePets(pet, index);
    }

}
