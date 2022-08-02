package com.catur.book;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller	// This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
        

	@Autowired // This means to get the bean called userRepository
			   // Which is auto-generated by Spring, we will use it to handle the data

        private BookRepository bookRepository;

        
        @PostMapping(path="/add/book") // Map ONLY POST Requests
	public @ResponseBody String addNewBook (@RequestParam String id, @RequestParam String name) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Book b = new Book();
                b.setId(Integer.parseInt(id));
		b.setBalance(Long.parseLong(name));
		bookRepository.save(b);
		return "Saved";
	}

        
        @GetMapping(path="/book/all")
	public @ResponseBody Iterable<Book> getAllBook() {
		// This returns a JSON or XML with the users
		return bookRepository.findAll();
	}
        
        @GetMapping(path="/book/{id}")
	public @ResponseBody Optional<Book> getBookById(@PathVariable String id) {
		// This returns a JSON or XML with the users
		return bookRepository.findById(Integer.parseInt(id));
	}
        
}
