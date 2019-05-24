package com.alexandretavares.demo.Service;

import com.alexandretavares.demo.model.Cliente;

public interface ClienteServiceInterface {

    Cliente create(Cliente cliente);
    Iterable<Cliente> getAll();
    Cliente getById(Long id);
    Cliente update(Long id, Cliente cliente);
    void delete(Long id);
}
