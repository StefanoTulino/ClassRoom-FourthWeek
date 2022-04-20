package com.corso.java.boot.controller;

import com.corso.java.boot.domain.CompactDisk;
import com.corso.java.boot.service.CompactDiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
//fa parte del contesto
@RestController

@RequestMapping(path = "/api/v1")
public class CompactDiskController {

    @Autowired
    CompactDiskService compactDiskService;

    @GetMapping(path="compactdisks")
    ResponseEntity <List<CompactDisk>> getAll(){
        List<CompactDisk> list= compactDiskService.findAll();
        ResponseEntity r=new ResponseEntity(list, HttpStatus.OK);
            return r.ok(list);

        //invia una risposta ed è piu corretto in quanto viene inviato subito effettivamente come risposta
        //return ResponseEntity
        //      .noContent()
        //    .build();
    }

    @PostMapping(path = "compactInsert")
    ResponseEntity<CompactDisk> create(@RequestBody CompactDisk c){
        //se l'invio andrà bene,allora avremo un http status ok
         compactDiskService.create(c);
        return new ResponseEntity<>(c, HttpStatus.OK);
        //ALTRIMENTI FARE RETURN COMPACTDISK sia sulla firma del metodo che nel return effettivo
        //return compactDiskService.create(c);
        }

}
