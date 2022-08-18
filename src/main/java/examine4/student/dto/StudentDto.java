package examine4.student.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StudentDto {
    private Integer id;
    private String name;
    private Integer age;
    private CourseDto course_id;

}
