package com.corso.firstExercise.service.api;

import com.corso.firstExercise.domain.Veicolo;
import com.corso.firstExercise.repository.VeicoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeicoloServiceImpl implements VeicoloService {

    @Autowired
    VeicoloRepository veicoloRepository;


    @Override
    public List<Veicolo> findAll() {
        return veicoloRepository.findAll();
    }

    @Override
    public Veicolo create(Veicolo v) {
        return veicoloRepository.save(v);
    }

}
