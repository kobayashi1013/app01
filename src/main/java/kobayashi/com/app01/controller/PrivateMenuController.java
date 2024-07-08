package kobayashi.com.app01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kobayashi.com.app01.constant.Url;

@Controller
public class PrivateMenuController {
    
    @GetMapping(Url.PRIVATE_URL)
    public String view() {

        return Url.PRIVATE;
    }
}
