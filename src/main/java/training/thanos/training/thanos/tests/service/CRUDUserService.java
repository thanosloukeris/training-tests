package training.thanos.training.thanos.tests.service;


import org.springframework.stereotype.Service;
import training.thanos.training.thanos.tests.Repository.UserRepository;
import training.thanos.training.thanos.tests.model.User;

import java.util.List;

@Service
public class CRUDUserService {

    private UserRepository userRepository;

    public CRUDUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
       return userRepository.findById(id).get();
    }
}
