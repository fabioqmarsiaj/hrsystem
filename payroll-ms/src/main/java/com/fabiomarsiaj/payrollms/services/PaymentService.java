package com.fabiomarsiaj.payrollms.services;

import com.fabiomarsiaj.payrollms.domains.Payment;
import com.fabiomarsiaj.payrollms.domains.Worker;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int days) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put("id", String.valueOf(workerId));

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriParams);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
