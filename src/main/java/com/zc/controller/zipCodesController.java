package com.zc.controller;

//import org.springframework.stereotype.Controller;
import com.zc.entity.ZipCode;
import com.zc.repository.ZipcodeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class zipCodesController {
    @Autowired
    private ZipcodeRepo zipcodeRepo;


    @GetMapping("/home")
    public String test(){
        return "Ok";
    }

    //Funcion probada
    @GetMapping("/all")
    public Page<ZipCode> findAllCodes(@PageableDefault(page = 0, size = 20) Pageable pageable){
        return zipcodeRepo.findAll(pageable);
    }

    @GetMapping("/codigo/{code}")
    public Optional<List<ZipCode>> findCode(@PathVariable int code){
        return zipcodeRepo.findBycodigoPostal(code);
    }

    @GetMapping("/colonia")
    //public Optional<List<ZipCode>> findColonia(@RequestBody String colonia){
    public Optional<List<ZipCode>> findColonia(@RequestBody Map<String,Object> requestData){
        String colonia = (String) requestData.get("colonia");
        return zipcodeRepo.findByasentamiento(colonia);
    }

    @GetMapping("/estado")
    public Optional<Page<ZipCode>> findEstado(@PageableDefault(page = 0, size = 20) Pageable pageable, @RequestBody Map<String, Object> requestData){
        String estado = (String) requestData.get("estado");
        return zipcodeRepo.findByestado(pageable, estado);
    }

    @GetMapping("/zona")
    public Optional<Page<ZipCode>> findType(@PageableDefault(page = 0, size = 20) Pageable pageable, @RequestBody Map<String, Object> requestData){
        String zona = (String) requestData.get("zona");
        return zipcodeRepo.findByzona(pageable, zona);
    }

}
