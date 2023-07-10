package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args)
    {
//        Person person1 = new Person(null, "Lucas Motta", "Lucasmotta@gmail.com");
//        Person person2 = new Person(null, "João Silba", "joao@gmail.com");
//        Person person3 = new Person(null, "Matheus augusto", "matheus@gmail.com");
//
//        entityManager.persist(person1);
//        entityManager.persist(person2);
//        entityManager.persist(person3);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println(entityManager.find(Person.class, 1));

        entityManager.remove(2);
        
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("ok");

    }
}