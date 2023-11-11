package com.example.application.services;

import com.example.application.data.SamplePerson;
import com.example.application.data.SamplePersonRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class SamplePersonService {

    private final SamplePersonRepository repository;

    public SamplePersonService(SamplePersonRepository repository) {
        this.repository = repository;
    }

    public Optional<SamplePerson> get(Long id) {
        return repository.findById(id);
    }

    public SamplePerson update(SamplePerson entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<SamplePerson> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public List<SamplePerson> list() {
        return this.repository.findAll();
    }

    public Page<SamplePerson> list(Pageable pageable, Specification<SamplePerson> filter) {
        SamplePerson p = (SamplePerson) filter;
        System.out.println(p.getName());
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
