package com.zhandabo.overgame.service;

import com.zhandabo.overgame.model.dto.KeycloakAuthRequestDto;
import com.zhandabo.overgame.model.dto.KeycloakAuthResponseDto;
import com.zhandabo.overgame.model.dto.UserInfoDto;
import com.zhandabo.overgame.model.entity.User;

public interface UserService {

    void create(UserInfoDto userInfoDto);

    KeycloakAuthResponseDto login(KeycloakAuthRequestDto keycloakAuthRequestDto);

    User getCurrentUser();
}
