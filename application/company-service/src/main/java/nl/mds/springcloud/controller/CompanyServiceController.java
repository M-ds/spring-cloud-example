package nl.mds.springcloud.controller;

import nl.mds.springcloud.domain.Company;
import nl.mds.springcloud.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyServiceController {

    private final CompanyService companyService;

    public CompanyServiceController(@Autowired CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/find/{id}")
    public Company find(@PathVariable long id) {
        return companyService.find(id);
    }

    @PostMapping("/save")
    public Company save(@RequestBody Company company) {
        return companyService.save(company);
    }
}
