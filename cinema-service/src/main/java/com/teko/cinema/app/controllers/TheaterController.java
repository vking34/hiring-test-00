package com.teko.cinema.app.controllers;

import com.teko.cinema.app.requests.TheaterConfigRequest;
import com.teko.cinema.domain.services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/theaters")
public class TheaterController {

    @Autowired
    private TheaterService theaterService;

    @PostMapping
    Boolean configureTheater(@RequestBody TheaterConfigRequest configRequest){
        // need validate
        theaterService.configTheater(configRequest);


        return true;
    }
}
