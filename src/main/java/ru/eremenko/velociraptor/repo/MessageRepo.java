package ru.eremenko.velociraptor.repo;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.eremenko.velociraptor.domain.Message;

import java.util.List;

public interface MessageRepo extends JpaRepository<Message,Long> {
    @EntityGraph(attributePaths = { "comments" })
    List<Message> findAll();
}
