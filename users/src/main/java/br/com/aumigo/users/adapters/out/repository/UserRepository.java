package br.com.aumigo.users.adapters.out.repository;

import br.com.aumigo.users.adapters.out.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
}
