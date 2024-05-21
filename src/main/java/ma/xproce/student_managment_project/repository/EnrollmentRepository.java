package ma.xproce.student_managment_project.repository;

import ma.xproce.student_managment_project.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Long> {

}
