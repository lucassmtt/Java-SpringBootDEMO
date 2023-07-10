package application;

import domain.Person;

public class Program {
    public static void main(String[] args)
    {
        Person person1 = new Person(1, "Lucas Motta", "Lucasmotta@gmail.com");
        Person person2 = new Person(2, "João Silba", "joao@gmail.com");
        Person person3 = new Person(3, "Matheus augusto", "matheus@gmail.com");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
