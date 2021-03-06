package com.zhandabo.overgame.model.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("Данные юзера")
public class UserShortViewDto {

    @ApiModelProperty("id пользователя")
    private Long id;

    @ApiModelProperty("Логин пользователя")
    private String username;

    @ApiModelProperty("ава пользователя")
    private String img;
}
