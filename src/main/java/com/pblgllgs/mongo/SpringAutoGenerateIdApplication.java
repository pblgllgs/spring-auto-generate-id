package com.pblgllgs.mongo;

import com.pblgllgs.mongo.entity.Book;
import com.pblgllgs.mongo.repository.BookRepository;
import com.pblgllgs.mongo.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringAutoGenerateIdApplication {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;

	@PostMapping("/saveBook")
	public Book save(@RequestBody Book book){
		book.setId(sequenceGeneratorService.getSequenceNumber(Book.SEQUENCE_NAME));
		return (Book) bookRepository.save(book);
	}

	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAutoGenerateIdApplication.class, args);
	}

}
