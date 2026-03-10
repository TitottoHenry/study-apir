package br.com.fiap.study_apir.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()

public class PingController {
    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("rota1")
    public String rota1() {
        return "rota1";

    }

    

    @GetMapping("sasuke")
    public String sasuke() {
        return "naruto";

    }
}
