package kobayashi.com.app01.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kobayashi.com.app01.constant.Url;

@Controller
public class SigninController {
    
    @GetMapping(Url.SIGNIN_URL)
    public String view() {

        return Url.SIGNIN;
    }
}
