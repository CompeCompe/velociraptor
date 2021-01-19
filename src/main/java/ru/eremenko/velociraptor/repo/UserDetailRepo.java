package ru.eremenko.velociraptor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eremenko.velociraptor.domain.User;

public interface UserDetailRepo extends JpaRepository<User, String> {
}
