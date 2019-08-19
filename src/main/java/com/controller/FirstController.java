package com.controller;

import com.app.SpringbootApplicationStarter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by menggq on 2019-08-14.
 */
@RestController
public class FirstController {


    @GetMapping("/first")
    public String first(){
        SpringbootApplicationStarter.run.close();
        System.out.println("nilaile");
        return "test";
    }

}
