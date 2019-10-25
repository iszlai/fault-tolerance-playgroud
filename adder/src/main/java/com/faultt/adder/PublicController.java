package com.faultt.adder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @Autowired
    LTVRepository ltvRepository;

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    String addTransaction(@RequestBody Transaction transaction){
        return "ok";
    }
}
