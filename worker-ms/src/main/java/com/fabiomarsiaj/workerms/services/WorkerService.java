package com.fabiomarsiaj.workerms.services;

import com.fabiomarsiaj.workerms.domains.Worker;
import com.fabiomarsiaj.workerms.repositories.WorkerRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repository;

    public Page<Worker> findPage(Integer page, Integer linesPerPage, String direction, String orderBy) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);

        return repository.findAll(pageRequest);
    }

    public Optional<Worker> find(Long id) {
        return repository.findById(id);
    }
}
