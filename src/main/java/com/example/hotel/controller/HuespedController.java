package com.example.hotel.controller;

import com.example.hotel.model.Huesped;
import com.example.hotel.servicios.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("huesped")
public class HuespedController {

    @Autowired
    private HuespedService service;

    @GetMapping
    public List<Huesped> getAll() {
        return this.service.getAll();
    }

    @PostMapping
    public Huesped post(@RequestBody Huesped huesped) {
        return this.service.save(huesped);
    }

    @PutMapping("{id}")
    public Huesped put(@RequestBody Huesped huesped, @PathVariable Long id) {
        huesped.setId(id);
        return this.service.update(huesped);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

}
