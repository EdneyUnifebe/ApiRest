package br.com.avaliacao.apitaskrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.avaliacao.apitaskrest.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	Task findById(long id);

}
