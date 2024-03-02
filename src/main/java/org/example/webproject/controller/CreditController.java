package org.example.webproject.controller;

import lombok.AllArgsConstructor;
import org.example.webproject.entity.CreditResult;
import org.example.webproject.service.CreditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/credit")
public class CreditController {
    private final CreditService creditService;

    @GetMapping
    public CreditResult calculateCredit(
            @RequestParam double sum,
            @RequestParam int term,
            @RequestParam(defaultValue = "USD") String currency,
            @RequestParam(name = "rate") double interestRate,
            @RequestParam String duration) {

        return creditService.calculateLosses(sum, term, currency, interestRate, duration);
    }
}
