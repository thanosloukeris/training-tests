package training.thanos.training.thanos.tests.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import training.thanos.training.thanos.tests.model.User;
import training.thanos.training.thanos.tests.service.CRUDUserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {


    private CRUDUserService crudUserService;


    @GetMapping
    public List<User> getUsers() {
        return crudUserService.getAll();
    }


    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return crudUserService.getUserById(id);
    }
}
