package com.fabiomarsiaj.payrollms.domains;

import lombok.Data;

@Data
public class Worker {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double dailyIncome;
}
