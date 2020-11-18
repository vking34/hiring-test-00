package com.teko.cinema.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theater {
    private Integer rows;
    private Integer columns;
    private Integer minDistance;
    private int[][] seatGraph;
}
