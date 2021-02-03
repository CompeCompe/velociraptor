package ru.eremenko.velociraptor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eremenko.velociraptor.domain.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
