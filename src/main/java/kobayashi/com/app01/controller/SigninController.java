package kobayashi.com.app01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kobayashi.com.app01.constant.Url;
import kobayashi.com.app01.form.SigninForm;

@Controller
public class SigninController {
    
    @GetMapping(Url.SIGNIN_URL)
    public String view(Model model, SigninForm form) {

        return Url.SIGNIN;
    }
}
