package com.bridgelabz.controller;

import com.bridgelabz.controller.dto.UserDto;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/hello2")
    public String getMessage(@RequestParam String name) {
        return " Hello " + name + " From Bridgelabz ";
    }

    @GetMapping(value = "/hello3/{name}")
    public String getMessageUsingPathVariable
            (@PathVariable String name) {
        return " Hello " + name + " From BridgeLabz ";
    }

    @PostMapping(value = "/hello4")
    public String getUserMessage(@RequestBody UserDto userDto) {
        return userDto.toString();
    }
}
