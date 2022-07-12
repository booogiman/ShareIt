package ru.practicum.shareit.user.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.practicum.shareit.user.model.User;
@Component
public class UserMapper {

    public UserDto toUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    public User dtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        return user;
    }
}
