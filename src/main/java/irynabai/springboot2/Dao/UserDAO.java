package irynabai.springboot2.Dao;

import irynabai.springboot2.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User,Integer> {
}
