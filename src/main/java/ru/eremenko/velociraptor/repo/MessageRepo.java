package ru.eremenko.velociraptor.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.eremenko.velociraptor.domain.Message;
import ru.eremenko.velociraptor.domain.User;

import java.util.List;

public interface MessageRepo extends JpaRepository<Message,Long> {
    @EntityGraph(attributePaths = { "comments" })
    Page<Message> findByAuthorIn(List<User> user, Pageable pageable);
}
