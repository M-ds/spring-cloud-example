package nl.mds.springcloud.controller;

import nl.mds.springcloud.domain.Employee;
import nl.mds.springcloud.repository.EmployeeRepository;
import nl.mds.springcloud.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private final EmployeeService employeeService;

    EmployeeController(@Autowired EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find/{id}")
    public Employee find(@PathVariable long id) throws Exception {
        if (id < 0) throw new Exception("Id is lower than 0 which can not occur. Please make sure the correct variable is passed.");
        logger.info("EmployeeController | Searching for employee with id: {}", id);
        return employeeService.find(id);
    }

    @GetMapping("/find/company/{id}")
    public List<Employee> findByCompanyId(@PathVariable long id) {
        logger.info("EmployeeController | Searching for employees from company with id: {}", id);
        return employeeService.findByCompanyId(id);
    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        logger.info("EmployeeController | Saving employee: {}", employee.toString());
        return employeeService.save(employee);
    }

}
