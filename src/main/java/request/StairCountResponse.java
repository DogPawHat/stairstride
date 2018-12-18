package request;

public class StairCountResponse {
    private final int totalStrides;

    public StairCountResponse(int totalStrides) {
        this.totalStrides = totalStrides;
    }

    public int getTotalStrides() {
        return totalStrides;
    }
}