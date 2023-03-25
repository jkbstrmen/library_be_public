package sk.umb.example.library.authentication.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import sk.umb.example.library.authentication.persistence.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    public Optional<UserEntity> findByUsername(String username);
}
