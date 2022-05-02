package com.zhandabo.overgame.converter;

import com.zhandabo.overgame.model.dto.UserViewDto;
import com.zhandabo.overgame.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserViewDtoConverter implements Converter<User, UserViewDto> {

    @Override
    public UserViewDto convert(User source) {
        UserViewDto target = new UserViewDto();
        target.setId(source.getId());
        target.setUsername(source.getUsername());
        target.setImg(source.getAvatarUrl());
        return null;
    }
}