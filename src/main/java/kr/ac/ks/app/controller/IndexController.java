package kr.ac.ks.app.controller;

import kr.ac.ks.app.domain.Student;
import kr.ac.ks.app.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final StudentRepository studentRepository;

    public IndexController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String index() {
        Iterable<Student> students = studentRepository.findAll();
        students.forEach(obj -> System.out.println(obj.getName()));
        return "index";
    }

}
