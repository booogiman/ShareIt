package ru.practicum.shareit.requests.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import ru.practicum.shareit.requests.ItemRequest;
//@Configuration
@Component
public class ItemRequestMapper {

    public ItemRequestDto toItemRequestDto(ItemRequest request) {
        return new ItemRequestDto(
                request.getDescription(),
                request.getRequestor(),
                request.getCreated()
        );
    }
}
