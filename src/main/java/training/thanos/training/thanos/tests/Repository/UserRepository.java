package training.thanos.training.thanos.tests.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import training.thanos.training.thanos.tests.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
