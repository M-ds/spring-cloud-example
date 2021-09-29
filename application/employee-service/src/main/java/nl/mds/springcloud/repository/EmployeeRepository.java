package nl.mds.springcloud.repository;

import nl.mds.springcloud.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    @Query(value = "SELECT * FROM Employee e where e.company_id = :companyId", nativeQuery = true)
    List<Employee> findEmployeesByCompanyId(@Param("companyId") long companyId);
}
