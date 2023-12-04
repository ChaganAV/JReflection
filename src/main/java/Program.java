import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.reflect.Method.*;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Reflection API");
        System.out.println();
        Animal[] animals = new Animal[]{
                new Dog("Лорд",2),
                new Dog("Барбос", 4),
                new Cat("Мурка",1),
                new Cat("Рыжик",3)
        };
        for (Animal animal: animals) {
            Class<?> any = Class.forName(animal.getClass().getName());
            System.out.println(String.format("%s %s",any.getName(),animal.getName()));
            Constructor<?>[] constructors = any.getConstructors();
            System.out.println("Конструкторы");
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(constructors[i]);
            }
            Field[] fields = any.getFields();
            System.out.println("Поля");
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i]);
            }
            Method[] methods = any.getDeclaredMethods();
            System.out.println("Методы");
            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i]);
                if(methods[i].getName().equals("makeSound")){
                    System.out.println(methods[i].getName());
                    Method method = methods[i];

                }
            }
        }
    }
}
