package com.corso.firstExercise.service.api;

import com.corso.firstExercise.domain.Veicolo;

import java.util.List;

public interface VeicoloService {
    List<Veicolo> findAll();
    Veicolo create(Veicolo v);
}
