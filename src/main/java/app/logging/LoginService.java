package app.logging;

import org.springframework.beans.factory.annotation.Autowired;

import app.core.UserRepository;

public class LoginService {
    @Autowired
    private UserRepository repository;
}
