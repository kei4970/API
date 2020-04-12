package kr.ac.ks.app.repository;

import kr.ac.ks.app.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}