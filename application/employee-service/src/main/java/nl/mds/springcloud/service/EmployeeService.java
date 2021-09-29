package nl.mds.springcloud.service;

import nl.mds.springcloud.domain.Employee;
import nl.mds.springcloud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(@Autowired EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee find(long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    public List<Employee> findByCompanyId(long id) {
        return employeeRepository.findEmployeesByCompanyId(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
