public class Cat extends Animal implements Soundable{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("мяу-мяу");
    }

    @Override
    public String toString() {
        return String.format("$s $s",this.getClass(),super.toString());
    }
}
