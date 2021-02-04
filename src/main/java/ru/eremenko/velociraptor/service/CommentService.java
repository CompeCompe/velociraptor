package ru.eremenko.velociraptor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.eremenko.velociraptor.domain.Comment;
import ru.eremenko.velociraptor.domain.User;
import ru.eremenko.velociraptor.domain.Views;
import ru.eremenko.velociraptor.dto.EventType;
import ru.eremenko.velociraptor.dto.ObjectType;
import ru.eremenko.velociraptor.repo.CommentRepo;
import ru.eremenko.velociraptor.util.WsSender;

import java.util.function.BiConsumer;

@Service
public class CommentService {
    private final CommentRepo commentRepo;
    private final BiConsumer<EventType, Comment> wsSender;
    @Autowired
    public CommentService(CommentRepo commentRepo, WsSender wsSender) {
        this.commentRepo = commentRepo;
        this.wsSender = wsSender.getSender(ObjectType.COMMENT, Views.FullComment.class);
    }

    public Comment create(Comment comment, User user){
        comment.setAuthor(user);
        Comment commentFromDb = commentRepo.save(comment);

        wsSender.accept(EventType.CREATE, commentFromDb);

        return commentFromDb;
    }
}
