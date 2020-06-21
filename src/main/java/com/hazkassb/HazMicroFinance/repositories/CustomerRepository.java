package com.hazkassb.HazMicroFinance.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hazkassb.HazMicroFinance.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
