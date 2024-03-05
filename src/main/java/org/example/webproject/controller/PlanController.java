package org.example.webproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.webproject.entity.Plan;
import org.example.webproject.service.PlanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plans")
@RequiredArgsConstructor
public class PlanController {
    private final PlanService planService;

    @GetMapping
    public List<Plan> getPlans() {
        return planService.getPlans();
    }
}
