package request;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import models.StairCountRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import logic.StairCounter;

@RestController
public class StairCountController {

    @RequestMapping("/stair_count")
    public StairCountRequest stairCountRequest(
            @RequestParam(name="flights") String flights,
            @RequestParam(name="stride") String stride
    ) {
        List<Integer> flightsList =
                Arrays.stream(flights.split(","))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        return new countStairs(StairCountRequest(flightsList,Integer.parseInt(stride)));
    }
}
