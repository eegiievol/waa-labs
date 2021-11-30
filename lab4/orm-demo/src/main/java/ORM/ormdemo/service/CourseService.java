package ORM.ormdemo.service;

import ORM.ormdemo.domain.Address;
import ORM.ormdemo.domain.Course;
import ORM.ormdemo.repository.CourseRepository;

import java.util.List;

public interface CourseService {
    void save(Course c);
    List<Course> getAll();
}
