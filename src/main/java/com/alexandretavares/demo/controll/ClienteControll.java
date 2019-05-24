package com.alexandretavares.demo.controll;

import com.alexandretavares.demo.Service.ClienteService;
import com.alexandretavares.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteControll {

    @Autowired
    ClienteService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Cliente> post(@RequestBody Cliente cliente) {
        Cliente clienteRetorno = service.create(cliente);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(clienteRetorno.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getId(@PathVariable Long id){
        return ResponseEntity.ok(this.service.getById(id));
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> put(@RequestBody Cliente cliente, @PathVariable Long id) {
        return new ResponseEntity<>(service.update(id, cliente), HttpStatus.ACCEPTED);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
