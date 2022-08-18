package examine4.student.service.impl;

import examine4.student.dto.ResponseDto;
import examine4.student.dto.StudentDto;
import examine4.student.entity.Student;
import examine4.student.mapper.StudentMapper;
import examine4.student.repository.StudentRepository;
import examine4.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public ResponseDto addStudent(StudentDto studentDto) {
        studentRepository.save(studentMapper.toEntity(studentDto));
        return ResponseDto.builder()
                .succes(true)
                .code(0)
                .message("OK")
                .build();
    }

    @Override
    public ResponseDto deleteStudent(Integer id) {
        return null;
    }

    @Override
    public ResponseDto updateStudent(String name) {
        return null;
    }

    @Override
    public ResponseDto getStudent(Integer id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if(optionalStudent.isEmpty()){
            return ResponseDto.builder()
                    .code(-1)
                    .message("not found")
                    .succes(false)
                    .data(null)
                    .build();

        }

        StudentDto studentDto = studentMapper.toDto(optionalStudent.get());

        return ResponseDto.builder()
                .code(0)
                .message("OK")
                .succes(true)
                .data(studentDto)
                .build();

    }
}
