package fbo.amo.cnss_droit.droit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/droits")
public class DroitController {

    @GetMapping("/status")
    public String status() {
        return "Droit ouvert";
    }

    @GetMapping("")
    public String getStatus() {
        return "Droit ouvert";
    }
}
