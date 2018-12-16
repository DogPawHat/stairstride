package logic;

import models.StairCountRequest;

import java.util.List;


interface MinFlightPerStride {
    int func(int flight);
}

public class StairCounter {
    public static int countStairs(StairCountRequest stairCountRequest) {

        List<Integer> flights = stairCountRequest.getFlights();

        MinFlightPerStride minFlightPerStride = (flight) -> (int) Math.ceil((double) flight/(double) stairCountRequest.getStride());

        int landingStrides = 2 * (flights.size() -1) ;

        int flightsStrides = flights.stream()
                .reduce(0, (acc, elem) -> acc + minFlightPerStride.func(elem));

        return landingStrides + flightsStrides;
    }
}
