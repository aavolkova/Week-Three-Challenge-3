package me.anna.roboresumedatabaseedition;

import me.anna.roboresumedatabaseedition.models.Employment;
import org.springframework.data.repository.CrudRepository;

public interface EmploymentRepository extends CrudRepository<Employment,Long> {
}
