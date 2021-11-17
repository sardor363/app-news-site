package sardor.uz.appnewssite.controller;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sardor.uz.appnewssite.payload.RegisterDto;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping
    public HttpEntity<?> registerUser(@Valid @RequestBody RegisterDto registerDto){

    }
}
