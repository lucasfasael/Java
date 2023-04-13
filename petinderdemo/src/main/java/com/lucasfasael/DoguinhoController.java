package com.lucasfasael;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoguinhoController {

    @Autowired
    DoguinhoService doguinhoService;

    @GetMapping("/cria")
    void criaDog() {
        doguinhoService.criaDoguinho();
    }

}
