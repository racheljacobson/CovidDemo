package com.sw409.coviddemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.coviddemo.models.Resident;

public interface ResidentRepository extends CrudRepository<Resident, Integer> {

}
