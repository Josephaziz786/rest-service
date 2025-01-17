package net.jpmc.catalog.rest_service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
@Slf4j
public class ProductController {


    @GetMapping
    public ResponseEntity<String> getAllProducts() {

        /**
         * INFO: information log or application logs, log.info()
         * DEBUG: debug logs, log.debug()
         * ERROR: Suppose you want to log an exception or error, then use ERROR logs, log.error()
         */

        log.info("Received request to get all products");
        //TODO: work on processing
        return ResponseEntity.ok("Product from response"); // ok-> 200


    }

}





