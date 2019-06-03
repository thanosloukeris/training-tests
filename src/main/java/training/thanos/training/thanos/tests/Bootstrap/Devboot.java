package training.thanos.training.thanos.tests.Bootstrap;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import training.thanos.training.thanos.tests.Repository.UserRepository;
import training.thanos.training.thanos.tests.model.User;

@Component
@AllArgsConstructor
public class Devboot implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        User user1 = new User("ttu", "uuuuuuu");
        User user2 = new User("asdasd", "attttttt");
        User user3 = new User("dasedeee", "awwwwww");
        User user4 = new User("qweeqe", "aqqqqqq");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

    }
}
