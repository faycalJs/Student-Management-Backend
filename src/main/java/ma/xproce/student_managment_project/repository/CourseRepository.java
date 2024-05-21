package ma.xproce.student_managment_project.repository;

import ma.xproce.student_managment_project.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
