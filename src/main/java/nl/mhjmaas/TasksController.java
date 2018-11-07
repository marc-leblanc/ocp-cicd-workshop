package nl.mhjmaas;

import nl.mhjmaas.model.Task;
import nl.mhjmaas.repo.TaskRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task/")
public class TasksController {

    @Autowired
    private TaskRespository repository;

    @RequestMapping(method = RequestMethod.GET, value="/")
    public List<Task> index() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value="/")
    public Task updateOrSave(@RequestBody Task task) {
        return repository.save(task);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{taskId}")
    public boolean delete(@PathVariable String taskId) {
        repository.delete(taskId);
        return true;
    }
}
