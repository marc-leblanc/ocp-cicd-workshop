package nl.mhjmaas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/health/")
public class HealthController {

    @RequestMapping(method = RequestMethod.GET, value="/")
    public String index() {
        return "Ok";
    }
}
