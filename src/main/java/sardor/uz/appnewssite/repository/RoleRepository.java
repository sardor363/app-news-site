package sardor.uz.appnewssite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sardor.uz.appnewssite.entity.Role;

public interface RoleRepository  extends JpaRepository<Role,Long> {
}
