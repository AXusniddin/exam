package examine4.student.entity;

import examine4.student.dto.CourseDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @GeneratedValue(generator ="student_seq" )
    @SequenceGenerator(name = "student_seq", sequenceName = "student_id_seq", allocationSize = 1)


    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

//    @ManyToOne()
//    @Column(name = "course_id")
//    private CourseDto course_id;


}
