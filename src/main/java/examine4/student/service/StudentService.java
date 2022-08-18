package examine4.student.service;

import examine4.student.dto.ResponseDto;
import examine4.student.dto.StudentDto;

public interface StudentService {
    ResponseDto addStudent(StudentDto studentDto);

    ResponseDto deleteStudent(Integer id);

    ResponseDto updateStudent(String name);

    ResponseDto getStudent(Integer id);

}
