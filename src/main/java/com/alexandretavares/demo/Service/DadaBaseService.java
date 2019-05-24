package com.alexandretavares.demo.Service;


import com.alexandretavares.demo.model.Cliente;
import com.alexandretavares.demo.repository.ClienteRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DadaBaseService {

    @Autowired
    ClienteService service;

    @Autowired
    ClienteRepositorie repositorie;

    public void incluirDB(){
        Cliente cliente = new Cliente();
        cliente.setNome("Alexandre");

        service.create(cliente);
    }




}
