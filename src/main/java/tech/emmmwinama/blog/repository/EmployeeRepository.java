package tech.emmmwinama.blog.repository;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.blog.entities.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Override
    public List<Employee> findAll();
}
