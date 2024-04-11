package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Book;

public interface BookRespository extends JpaRepository<Book,Long> {

}
