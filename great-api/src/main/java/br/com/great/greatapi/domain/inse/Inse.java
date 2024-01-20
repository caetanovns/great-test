package br.com.great.greatapi.domain.inse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Inse {
    @Id
    private String id;

    @Field("NU_ANO_SAEB")
    private Integer saebYear;

    @Field("CO_UF")
    private Integer ufCod;

    @Field("NO_UF")
    private String ufName;

    @Field("CO_MUNICIPIO")
    private Integer cityCode;

    @Field("NO_MUNICIPIO")
    private String cityName;

    @Field("ID_ESCOLA")
    private Integer schoolId;

    @Field("NO_ESCOLA")
    private String schoolName;

    @Field("TP_TIPO_REDE")
    private Integer networkType;

    @Field("TP_LOCALIZACAO")
    private Integer location;

    @Field("TP_CAPITAL")
    private Integer capital;

    @Field("QTD_ALUNOS_INSE")
    private Integer studentsAmount;

    @Field("MEDIA_INSE")
    private Double inseAvg;

    @Field("INSE_CLASSIFICACAO")
    private String classificationInse;

    @Field("PC_NIVEL_1")
    private Double level1;

    @Field("PC_NIVEL_2")
    private Double level2;

    @Field("PC_NIVEL_3")
    private Double level3;

    @Field("PC_NIVEL_4")
    private Double level4;

    @Field("PC_NIVEL_5")
    private Double level5;

    @Field("PC_NIVEL_6")
    private Double level6;

    @Field("PC_NIVEL_7")
    private Double level7;

    @Field("PC_NIVEL_8")
    private Double level8;

}
