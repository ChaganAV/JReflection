public class Program {
    public static void main(String[] args) {
        System.out.println("Reflection API");
        System.out.println();
        Animal[] animals = new Animal[]{
                new Dog("Лорд",2),
                new Dog("Барбос", 4),
                new Cat("Мурка",1),
                new Cat("Рыжик",3)
        };
        for (Animal item: animals) {
            item.toString();
        }
    }
}
