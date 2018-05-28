package advertisers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AdvertisersController {

    @RequestMapping("/api/advertiser")
    public String index() {
        return "{}";
    }

}
