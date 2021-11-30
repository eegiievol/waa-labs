package ORM.ormdemo.service;

import ORM.ormdemo.domain.Address;
import ORM.ormdemo.domain.Course;
import ORM.ormdemo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void save(Course c) {
        courseRepository.save(c);
    }

    @Override
    public List<Course> getAll() {
        List<Course> courses = new ArrayList<Course>();

        var iterable = courseRepository.findAll();
        for (Course c: iterable){
            courses.add(c);
        }
        return courses;
    }
}
