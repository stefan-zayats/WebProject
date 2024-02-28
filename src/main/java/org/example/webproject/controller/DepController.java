package org.example.webproject.controller;

import org.example.webproject.entity.DepResult;
import org.example.webproject.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {


    @Autowired
    private DepService depService;

    @GetMapping("/credit")
    public DepResult calculateDep(
            @RequestParam double amount,
            @RequestParam int term,
            @RequestParam String currency,
            @RequestParam double interestRate) {

//        return creditService.calculateProfit(amount, term, currency, interestRate);
        DepResult result = depService.calculateProfit(amount, term, currency, interestRate);


        return result;
    }


}
