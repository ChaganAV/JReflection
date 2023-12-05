public class Dog extends Animal{
    private String breed;
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("гав-гав");
    }

    @Override
    public String toString() {
        return String.format("$s $s",this.getClass(),super.toString());
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
