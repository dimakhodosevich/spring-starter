package by.khodosevich.spring;

import by.khodosevich.spring.database.pool.ConnectionPool;
import by.khodosevich.spring.database.repository.CompanyRepository;
import by.khodosevich.spring.database.repository.UserRepository;
import by.khodosevich.spring.ioc.Container;
import by.khodosevich.spring.service.UserService;

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


              var container = new Container();


//        var connectionPool = new ConnectionPool();
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userRepository = new UserRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

        var connectionPool = container.get(ConnectionPool.class);
        var companyRepository = container.get(CompanyRepository.class);
        var userRepository = container.get(UserRepository.class);
        var userService = container.get(UserService.class);




    }
}
