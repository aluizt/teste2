package com.alexandretavares.demo.repository;

import com.alexandretavares.demo.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepositorie extends MongoRepository<Cliente,Long> {
}
