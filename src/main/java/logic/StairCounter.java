package logic;

import java.util.List;


interface MinFlightPerStride {
    int func(int flight);
}

public class StairCounter {
    public static int countStairs(List<Integer> flights, int stride) {

        MinFlightPerStride minFlightPerStride = (flight) -> (int) Math.ceil((double) flight/(double) stride);

        int landingStrides = 2 * (flights.size() -1) ;

        int flightsStrides = flights.stream()
                .reduce(0, (acc, elem) -> acc + minFlightPerStride.func(elem));

        return landingStrides + flightsStrides;
    }
}
