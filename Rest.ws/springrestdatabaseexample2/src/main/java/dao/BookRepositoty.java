package dao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;

import entities.Book; 

@ComponentScan
public interface BookRepositoty extends CrudRepository<Book, Integer> {
	public Book findById(int id);
}
