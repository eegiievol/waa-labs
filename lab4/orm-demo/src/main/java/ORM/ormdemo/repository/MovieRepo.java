package ORM.ormdemo.repository;

import ORM.ormdemo.domain.Movies;
import ORM.ormdemo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MovieRepo extends CrudRepository<Movies, Long> {

    @Query("select m from Movies m where m.id=:id")
    public Movies getMoviesById(@Param("id") String id);

    @Query("select m.user from Movies m where m.user.id=:id")
    public User getUserByMov(@Param("id") String id);
}
