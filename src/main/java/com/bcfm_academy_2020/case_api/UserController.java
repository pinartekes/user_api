package com.bcfm_academy_2020.case_api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @RequestMapping(value = "/whoami", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(
            @RequestParam(value = "firstname", defaultValue = "Pinar") String firstname,
            @RequestParam(value = "lastname", defaultValue = "Tekes") String lastname){

        User user = new User(firstname,lastname);
        return ResponseEntity.ok(user);
    }
}
