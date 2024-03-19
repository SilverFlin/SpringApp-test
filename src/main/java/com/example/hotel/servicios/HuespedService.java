package com.example.hotel.servicios;

import com.example.hotel.model.Huesped;
import com.example.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {

    @Autowired
    private HuespedRepository repository;

    public List<Huesped> getAll(){
        return this.repository.findAll();
    }

    public Huesped save(Huesped huesped){
        return this.repository.save(huesped);
    }

    public Huesped update(Huesped huesped){
        return this.repository.save(huesped);
    }

    public void delete(Long id){
        this.repository.deleteById(id);
    }
}
