package com.fabiomarsiaj.workerms.repositories;

import com.fabiomarsiaj.workerms.domains.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
