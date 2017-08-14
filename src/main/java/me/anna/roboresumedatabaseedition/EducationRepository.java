package me.anna.roboresumedatabaseedition;

import me.anna.roboresumedatabaseedition.models.Education;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EducationRepository  extends CrudRepository<Education, Long> {


//    List<Education> findAll();

}
