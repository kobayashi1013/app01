package kobayashi.com.app01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kobayashi.com.app01.constant.ModelKey;
import kobayashi.com.app01.constant.Url;
import kobayashi.com.app01.form.SigninForm;

@Controller
public class SigninController {
    
    @Value("${application.name}")
    private String APPLICATION_NAME;

    @GetMapping(Url.SIGNIN_URL)
    public String view(Model model, SigninForm form) {

        model.addAttribute(ModelKey.APPLICATION_NAME, APPLICATION_NAME);
        return Url.SIGNIN;
    }
}
