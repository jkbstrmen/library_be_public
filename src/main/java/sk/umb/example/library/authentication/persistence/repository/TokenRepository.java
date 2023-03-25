package sk.umb.example.library.authentication.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.umb.example.library.authentication.persistence.entity.TokenEntity;

import java.util.Optional;

@Repository
public interface TokenRepository extends CrudRepository<TokenEntity, Long> {
    Optional<TokenEntity> findByToken(String token);
    Long deleteByToken(String token);
}
