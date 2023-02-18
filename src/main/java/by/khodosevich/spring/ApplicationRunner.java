package by.khodosevich.spring;

import by.khodosevich.spring.database.pool.ConnectionPool;
import by.khodosevich.spring.database.repository.CompanyRepository;
import by.khodosevich.spring.database.repository.UserRepository;
import by.khodosevich.spring.ioc.Container;
import by.khodosevich.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is main class for run project
 * @author Dima Khodosevich
 * @since 18.02.2023
 * @version 1.01
 */

public class ApplicationRunner {
    /**
     * This argument is container.
     * @see Container#get(Class)
     *
     *
     */

    private Container container;

    /**
     * This is main method with runs the project
     * @param args takes String array
     *
     * @see String
     */

    public static void main(String[] args) {
        var dimaContext = new ClassPathXmlApplicationContext("dimaapplication.xml");
        System.out.println(dimaContext.getBean("dima1", ConnectionPool.class));

//
//        var context = new ClassPathXmlApplicationContext("application.xml");
//        var connectionPool = context.getBean("p5", ConnectionPool.class);
//        System.out.println(connectionPool);



    }
}
