package br.com.great.greatapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InseAggregationDTO {

    private Double inseAvg;
    private Double inseMax;
    private Double inseMin;
    private Integer studentsAmount;
    private Double studentsAvg;
    private Double studentsMin;
    private Double studentsMax;
}
