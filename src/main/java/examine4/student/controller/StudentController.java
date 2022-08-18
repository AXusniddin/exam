package examine4.student.controller;

import examine4.student.dto.ResponseDto;
import examine4.student.dto.StudentDto;
import examine4.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;


    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseDto getStudent(@PathVariable Integer id){
        return service.getStudent(id);
    }

    @PostMapping
    public ResponseDto addStudent(@RequestBody StudentDto studentDto){
        return service.addStudent(studentDto);
    }
}
