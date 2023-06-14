package com.stanrnd.shopping.catalog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @GetMapping("/all")
    public ResponseEntity<String> getAllItems() {
    	
        return ResponseEntity.ok("[{\"name\":\"Sugar\",\"price\":100},{\"name\":\"Rice\",\"price\":60},{\"name\":\"Dal\",\"price\":150}]");
    }
}
