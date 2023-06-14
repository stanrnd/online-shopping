package com.stanrnd.shopping.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{accountId}")
    public ResponseEntity<String> getBankAccount(@PathVariable("accountId") String accountId) {
    	
        return ResponseEntity.ok("{\"name\":\"Bob\", \"email\":\"bob32@gmail.com\"}");
    }
}
