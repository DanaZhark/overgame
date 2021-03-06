package com.zhandabo.overgame.model.dto.game;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ApiModel("Данные игры для создания")
public class GameCreateDto {

    @NotBlank
    @ApiModelProperty("Название игры на англ и рус")
    private Map<String, String> name;

    @NotNull
    @ApiModelProperty("Описание игры на англ и рус")
    private Map<String, String> description;

    @NotBlank
    @ApiModelProperty("Ссылка на игру")
    private String gameLink;

    @ApiModelProperty("Файл с изображением")
    private MultipartFile imgFile;

    @NotNull
    @ApiModelProperty("Цена")
    private BigDecimal price;

    @NotNull
    @ApiModelProperty("Список id жанров")
    private List<Long> genreIds;
}
