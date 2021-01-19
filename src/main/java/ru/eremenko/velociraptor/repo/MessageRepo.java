package ru.eremenko.velociraptor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eremenko.velociraptor.domain.Message;

public interface MessageRepo extends JpaRepository<Message,Long> {
}
