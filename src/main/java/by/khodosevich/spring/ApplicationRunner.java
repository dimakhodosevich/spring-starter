package by.khodosevich.spring;

import by.khodosevich.spring.database.pool.ConnectionPool;
import by.khodosevich.spring.database.repository.CompanyRepository;
import by.khodosevich.spring.database.repository.UserRepository;
import by.khodosevich.spring.ioc.Container;
import by.khodosevich.spring.service.UserService;

public class ApplicationRunner {
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
