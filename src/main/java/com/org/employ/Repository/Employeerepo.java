package com.org.employ.Repository;

import com.org.employ.model.EmployeeDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends MongoRepository<EmployeeDetails,Double> {
}
