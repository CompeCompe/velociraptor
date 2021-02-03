package ru.eremenko.velociraptor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.eremenko.velociraptor.domain.Comment;
import ru.eremenko.velociraptor.domain.User;
import ru.eremenko.velociraptor.repo.CommentRepo;

@Service
public class CommentService {
    private final CommentRepo commentRepo;
    @Autowired
    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }

    public Comment create(Comment comment, User user){
        comment.setAuthor(user);
        commentRepo.save(comment);

        return comment;
    }
}
