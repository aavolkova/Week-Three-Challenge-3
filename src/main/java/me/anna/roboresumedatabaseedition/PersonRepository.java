package me.anna.roboresumedatabaseedition;

import me.anna.roboresumedatabaseedition.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {
}
