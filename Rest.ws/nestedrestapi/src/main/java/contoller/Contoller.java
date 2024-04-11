package contoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exception.ResourcesNotFoundException;
import model.Book;
import repository.BookRespository;


@RestController
@RequestMapping("/api/books")
public class Contoller {

	@Autowired
	private BookRespository br;
	
	@GetMapping
	public List<Book> getAllBook(){
		
		return br.findAll();
	}
	//build create employee Rest Api
	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return br.save(book);
	}
	
	//build get employee by id rest api
	@GetMapping("{id}")
	public ResponseEntity<Book> getBookById(@PathVariable long id){
		
		Book book = br.findById(id)
				.orElseThrow(() -> new ResourcesNotFoundException("book not exit with id:"+id));
		return ResponseEntity.ok(book);
	}
	
	//build update empolyee rest api
	@PutMapping("{id}")
	public ResponseEntity<Book> updateBook(@PathVariable long id ,@RequestBody Book bookDetails){
		Book update = br.findById(id)
				.orElseThrow(() -> new ResourcesNotFoundException("employee not exit with id" +id));
		
		update.setAuthor(bookDetails.getAuthor());
		update.setTitle(bookDetails.getTitle());
		update.setDescription(bookDetails.getDescription());
		
		br.save(update);
		return ResponseEntity.ok(update);
		
	}
	
	//build delete employee rest api
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
		Book book = br.findById(id).orElseThrow(() -> new ResourcesNotFoundException("employee not exit with id"+ id));
		br.delete(book);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
