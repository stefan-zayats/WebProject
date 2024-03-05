package org.example.webproject.service;

import lombok.RequiredArgsConstructor;
import org.example.webproject.entity.Plan;
import org.example.webproject.repository.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanService {
    private final PlanRepository planRepository;

    public List<Plan> getPlans() {
        return planRepository.findAll();
    }
}
