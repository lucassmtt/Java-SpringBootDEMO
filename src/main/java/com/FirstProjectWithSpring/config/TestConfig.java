package com.FirstProjectWithSpring.config;

import com.FirstProjectWithSpring.entities.Category;
import com.FirstProjectWithSpring.entities.Order;
import com.FirstProjectWithSpring.entities.Product;
import com.FirstProjectWithSpring.entities.enums.OrderStatus;
import com.FirstProjectWithSpring.repositories.CategoryRepository;
import com.FirstProjectWithSpring.repositories.OrderRepository;
import com.FirstProjectWithSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.FirstProjectWithSpring.repositories.UserRepository;
import com.FirstProjectWithSpring.entities.User;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));


        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));


        User user01 = new User(null, "João Silva", "joaosilva@gmail.com", "47-99999999", "12345");
        User user02 = new User(null, "Marina Green", "marinagreen@gmail.com", "47-988888888", "12345");
        userRepository.saveAll(Arrays.asList(user01, user02));


        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user01, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user02, OrderStatus.CANCELED);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user01, OrderStatus.DELIVERED);
        Order o4 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user02, OrderStatus.WAITING_PAYMENT);
        Order o5 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user02, OrderStatus.SHIPPED);
        Order o6 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user01, OrderStatus.SHIPPED);
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6));
    }
}
