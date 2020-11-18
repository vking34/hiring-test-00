package com.teko.cinema.app.requests;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
public class TheaterConfigRequest {

    @Positive
    private Integer rows;

    @Positive
    private Integer columns;

    @Positive
    @JsonProperty("min_distance")
    private Integer minDistance;
}
