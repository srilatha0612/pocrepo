package com.org.employ.Controller;

import com.org.employ.Repository.Employeerepo;
import com.org.employ.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employeecont {
    @Autowired
    private Employeerepo employeerepo;

    @PostMapping
    public void createemployeerecord(@RequestBody EmployeeDetails details) {
        employeerepo.save(details);
    }

    @GetMapping
    public List<EmployeeDetails> allgetDetails() {
        List<EmployeeDetails> all = employeerepo.findAll();
        return all;
    }

    @PutMapping
    public void updateEmployeerecord(@RequestBody EmployeeDetails details) {
        employeerepo.save(details);
    }
}

