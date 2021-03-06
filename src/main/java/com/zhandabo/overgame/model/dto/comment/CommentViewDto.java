package com.zhandabo.overgame.model.dto.comment;

import com.zhandabo.overgame.model.dto.user.UserShortViewDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentViewDto {

    Long id;
    String text;
    Long gameId;
    UserShortViewDto userInfo;
    Date dateCreated;
}
