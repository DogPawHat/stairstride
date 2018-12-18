package request;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import logic.StairCounter;

@RestController
public class StairCountController {

    @GetMapping("/stair_count")
    @ResponseBody
    public StairCountResponse stairCountRequest(
            @RequestParam(name="flights") List<Integer> flights,
            @RequestParam(name="stride") int stride
    ) {
        int result = StairCounter.countStairs(flights,stride);

        return new StairCountResponse(result);
    }
}
