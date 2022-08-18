package examine4.student.mapper;

import examine4.student.dto.StudentDto;
import examine4.student.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student toEntity(StudentDto studentDto);
    StudentDto toDto(Student student);
}
