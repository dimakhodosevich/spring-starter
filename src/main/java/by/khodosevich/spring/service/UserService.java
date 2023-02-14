package by.khodosevich.spring.service;

import by.khodosevich.spring.database.repository.CompanyRepository;
import by.khodosevich.spring.database.repository.UserRepository;

public class UserService  {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;


    public UserService(UserRepository userRepository,
                       CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
