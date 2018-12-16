package models;

import java.util.List;

public class StairCountRequest {
    private final List<Integer> flights;
    private final int stride;

    public StairCountRequest(List<Integer> flights, int stride) {
        this.flights = flights;
        this.stride = stride;
    }

    public List<Integer> getFlights() {
        return flights;
    }

    public int getStride() {
        return stride;
    }
}
