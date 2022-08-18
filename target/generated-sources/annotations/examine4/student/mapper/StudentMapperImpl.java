package examine4.student.mapper;

import examine4.student.dto.StudentDto;
import examine4.student.entity.Student;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-18T10:35:20+0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student toEntity(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student.StudentBuilder student = Student.builder();

        student.name( studentDto.getName() );

        return student.build();
    }

    @Override
    public StudentDto toDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto.StudentDtoBuilder studentDto = StudentDto.builder();

        studentDto.name( student.getName() );

        return studentDto.build();
    }
}
