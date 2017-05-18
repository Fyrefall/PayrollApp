package com.fyrefall.PayrollApp;

import org.springframework.data.repository.CrudRepository;

//tag::code[]
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
//end::code[]