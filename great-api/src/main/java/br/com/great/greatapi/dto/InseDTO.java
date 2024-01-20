package br.com.great.greatapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InseDTO {
    private Integer saebYear;
    private Integer ufCod;
    private String ufName;
    private Integer cityCode;
    private String cityName;
    private Integer schoolId;
    private String schoolName;
    private Integer networkType;
    private Integer location;
    private Integer capital;
    private Integer studentsAmount;
    private Double inseAvg;
    private String classificationInse;
    private Double level1;
    private Double level2;
    private Double level3;
    private Double level4;
    private Double level5;
    private Double level6;
    private Double level7;
    private Double level8;
}
