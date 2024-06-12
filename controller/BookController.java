package cts.pepsico.Microservice_demo_GET.controller;

import cts.pepsico.Microservice_demo_GET.model.Book; //Imports Book entity class
import cts.pepsico.Microservice_demo_GET.repository.BookRepo; //I BookRepo repository interface
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired; //for dependency injection
import org.springframework.http.HttpStatus; //for response handling
import org.springframework.http.ResponseEntity; //for constructing responses
import org.springframework.web.bind.annotation.*; //for request mapping

import java.util.ArrayList;
import java.util.List;
import java.util.Optional; //for handling null values

@RestController //combines Controller & ResponseBody (JSON instead of HTML web page)
public class BookController {

    @Autowired //injects the BookRepo dependency, allowing the controller to interact with repository
    private BookRepo bookRepo;

    @Operation(
            tags = "Find All the Books",
            description = "All books will be fetched",
            responses = {
                    @ApiResponse(
                            description = "All books have been found",
                            responseCode = "200"

                    ),
                    @ApiResponse(
                            description = "No books found",
                            responseCode = "404"
                    )
            }
    )
    @GetMapping("/getAllBooks")
    public ResponseEntity<List<Book>> getAllBooks(){
        try{
            List<Book> bookList = new ArrayList<>(); //creates empty list of Book objects
            bookRepo.findAll().forEach(bookList::add); //iterates over each Book object and adds to the list

            if (bookList.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT); //ensures request was successful, but no content
            }
            return new ResponseEntity<>(bookList, HttpStatus.OK);

        } catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @Operation(
            tags = "Find the Book by their ID",
            description = "Found the book by it's ID",
            responses = {
                    @ApiResponse(
                            description = "The book has been found",
                            responseCode = "200"

                    ),
                    @ApiResponse(
                            description = "No book has been found",
                            responseCode = "404"
                    )
            }
    )
    @GetMapping("/getBookById/{id}")
    public ResponseEntity<Book> getBookByID(@PathVariable Long id) {

        Optional<Book> bookData =  bookRepo.findById(id); //avoid NullPointerException

        if (bookData.isPresent()) {
            return new ResponseEntity<>(bookData.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Operation(
            tags = "Add a new Book",
            description = "A new book will be added to the database",
            responses = {
                    @ApiResponse(
                            description = "A new book has been added",
                            responseCode = "200"

                    ),
                    @ApiResponse(
                            description = "No book has been added",
                            responseCode = "404"
                    )
            }
    )
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) { //maps the request body to the Book object
        Book bookObj = bookRepo.save(book);

        return new ResponseEntity<>(bookObj, HttpStatus.OK);
    }

    @Operation(
            tags = "Update a Book by their ID",
            description = "Update the book by it's ID",
            responses = {
                    @ApiResponse(
                            description = "The book has been updated",
                            responseCode = "200"

                    ),
                    @ApiResponse(
                            description = "The book has not been updated",
                            responseCode = "404"
                    )
            }
    )
    @PostMapping("/updateBookById/{id}")
    public ResponseEntity<Book> updateBookById(@PathVariable Long id, @RequestBody Book newBookData){
        Optional<Book> oldBookData = bookRepo.findById(id);

        if (oldBookData.isPresent()) {
            Book updatedBookData = oldBookData.get();
            updatedBookData.setTitle(newBookData.getTitle());
            updatedBookData.setAuthor(newBookData.getAuthor());

            Book bookObj = bookRepo.save(updatedBookData);
            return new ResponseEntity<>(bookObj, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @Operation(
            tags = "Delete a Book by it's ID",
            description = "Delete a particular book from the database",
            responses = {
                    @ApiResponse(
                            description = "The book has been deleted successfully",
                            responseCode = "200"

                    ),
                    @ApiResponse(
                            description = "The book cannot be deleted",
                            responseCode = "404"
                    )
            }
    )
    @DeleteMapping("/deleteBookById/{id}")
    public ResponseEntity<HttpStatus> deleteBookById(@PathVariable Long id){

        bookRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
