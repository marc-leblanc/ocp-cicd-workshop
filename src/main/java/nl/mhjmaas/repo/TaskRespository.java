package nl.mhjmaas.repo;

import nl.mhjmaas.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRespository extends MongoRepository<Task, String> {
}
