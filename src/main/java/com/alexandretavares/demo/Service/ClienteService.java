package com.alexandretavares.demo.Service;

import com.alexandretavares.demo.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements ClienteServiceInterface {
    @Override
    public Cliente create(Cliente cliente) {
        return null;
    }

    @Override
    public Iterable<Cliente> getAll() {
        return null;
    }

    @Override
    public Cliente getById(Long id) {
        return null;
    }

    @Override
    public Cliente update(Long id, Cliente cliente) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
