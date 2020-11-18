package com.teko.cinema.domain.services;

import com.teko.cinema.app.requests.TheaterConfigRequest;
import com.teko.cinema.domain.models.Theater;
import org.springframework.stereotype.Service;

@Service
public class TheaterService {
    private final Theater theater = new Theater();

    public Boolean configTheater(TheaterConfigRequest theaterConfigRequest) {
        int rows = theaterConfigRequest.getRows();
        int columns = theaterConfigRequest.getColumns();
        int[][] seatGraph = new int[rows][columns];
        theater.setRows(theaterConfigRequest.getRows());
        theater.setColumns(theaterConfigRequest.getColumns());
        theater.setMinDistance(theaterConfigRequest.getMinDistance());
        theater.setSeatGraph(seatGraph);
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                System.out.print(seatGraph[x][y] + " ");
            }
            System.out.print("\n");
        }
        return true;
    }
}
