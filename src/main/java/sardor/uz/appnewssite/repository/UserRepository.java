package sardor.uz.appnewssite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sardor.uz.appnewssite.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
}
