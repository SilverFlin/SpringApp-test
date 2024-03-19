package com.example.hotel.servicios;

import com.example.hotel.model.Reserva;
import com.example.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public List<Reserva> getAll(){
        return this.repository.findAll();
    }

    public Reserva save(Reserva Reserva){
        return this.repository.save(Reserva);
    }

    public Reserva update(Reserva Reserva){
        return this.repository.save(Reserva);
    }

    public void delete(Long id){
        this.repository.deleteById(id);
    }

}
