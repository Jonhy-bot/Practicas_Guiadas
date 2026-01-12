public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    public Person(String name, int age, PetManager petManager) {
        this.name = name;
        this.age = age;
        this.petManager = petManager;
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

}
