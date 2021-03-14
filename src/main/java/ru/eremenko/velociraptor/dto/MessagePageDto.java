package ru.eremenko.velociraptor.dto;

import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.eremenko.velociraptor.domain.Message;
import ru.eremenko.velociraptor.domain.Views;

@Data
@AllArgsConstructor
@JsonView(Views.FullMessage.class)
public class MessagePageDto {
    private List<Message> messages;
    private int currentPage;
    private int totalPages;
}
