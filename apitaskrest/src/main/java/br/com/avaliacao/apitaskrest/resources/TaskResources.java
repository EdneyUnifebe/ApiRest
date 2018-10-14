package br.com.avaliacao.apitaskrest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.avaliacao.apitaskrest.model.Task;
import br.com.avaliacao.apitaskrest.repository.TaskRepository;
import java.util.List;
import java.util.Optional; 

@RestController
@RequestMapping(value="/api")
public class TaskResources {
	
	@Autowired
	TaskRepository taskRepository; 
	
    //@CrossOrigin(origins = "http://localhost:8082")
	@GetMapping("/task")
	public List<Task> listAllTask(){
		return taskRepository.findAll();
	}
    
    //@CrossOrigin(origins = "http://localhost:8082")
	@GetMapping("/task/{id}")
	public Task getTaskById(@PathVariable(value="id") long id){
		return taskRepository.findById(id);
	}
    
    //@CrossOrigin(origins = "http://localhost:8082")
	@PostMapping("/task")
	public Task salvarTask(@RequestBody Task task) {
		return taskRepository.save(task);		
	}
	
    @CrossOrigin(origins = "http://localhost:8082")
	@DeleteMapping("/task")
	public void deletarTask(@RequestBody Task task) {
		 taskRepository.delete(task);		
		 System.out.println(task.toString());
	}
	
    //@CrossOrigin(origins = "http://localhost:8082")
	@PutMapping("/task")
	public Task alterarTask(@RequestBody Task task) {
		 return taskRepository.save(task);		
	}
	

}
