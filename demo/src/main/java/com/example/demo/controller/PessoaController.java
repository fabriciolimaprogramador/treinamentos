package com.example.demo.controller;

import com.example.demo.model.PessoaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PessoaController {


    @GetMapping
    public String get() {
        var pessoa = new PessoaModel(1l, "FABRICIO");
        return pessoa.toString();
    }

}
