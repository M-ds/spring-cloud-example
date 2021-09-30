package nl.mds.springcloud.service;

import nl.mds.springcloud.domain.Company;
import nl.mds.springcloud.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(@Autowired CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public Company find(long id) {
        return companyRepository.findById(id).orElseThrow();
    }
}
