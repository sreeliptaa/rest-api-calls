package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose : To demonstrate the various HTTP methods with the help of REST Controller
 *
 * @author SREELIPTA
 * @since 01-12-2021
 */

@RestController
public class RestApiCallsController {

    @GetMapping(value = "/hello")
    public String getMessage() {
        return "Hello From BridgeLabz";
    }
}
