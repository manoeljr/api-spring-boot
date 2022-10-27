package com.application.api.api.resource;


import com.application.api.api.resource.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create() {
        BookDTO dto = new BookDTO();
        dto.setAuthor("Author");
        dto.setTitle("Meu Livro");
        dto.setIsbn("1213212");
        dto.setId(1L);
        return dto;
    }

}
