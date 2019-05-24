package com.alexandretavares.demo.controll;

import com.alexandretavares.demo.Service.DadaBaseService;
import com.alexandretavares.demo.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/db")
public class DBControll {

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @GetMapping
    public ResponseEntity<Cliente> incluir(){
        DadaBaseService service = new DadaBaseService();

        return ResponseEntity.ok().build();
    }
}
