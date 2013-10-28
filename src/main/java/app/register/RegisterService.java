package app.register;

import org.springframework.beans.factory.annotation.Autowired;

import app.core.UserRepository;

public class RegisterService {
    @Autowired
    private UserRepository repository;
}
