package br.com.mt.mts.auth.springapp.controller;

import br.com.mt.mts.auth.springapp.dto.LoginRequestDTO;
import br.com.mt.mts.auth.springapp.inputadapter.LoginInputAdapter;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {

//    @Autowired
    private LoginInputAdapter loginInputAdapter;

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> login(@Valid @RequestBody LoginRequestDTO login) {
        log.info("User trying to sign in: {}", login.username());

        var response = "abc";//loginInputAdapter.login();

        return ResponseEntity
                .ok()
                .body(response);
    }

}
