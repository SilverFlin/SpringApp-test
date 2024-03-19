package com.example.hotel.controller;

import com.example.hotel.model.Reserva;
import com.example.hotel.servicios.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reserva")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @GetMapping
    public List<Reserva> get(){
        return this.service.getAll();
    }

    @PostMapping
    public Reserva post(@RequestBody Reserva reserva){
        return this.service.save(reserva);
    }

    @PutMapping("{id}")
    public Reserva put(@RequestBody Reserva reserva, @PathVariable Long id){
        reserva.setId(id);
        return this.service.update(reserva);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.service.delete(id);
    }
}
