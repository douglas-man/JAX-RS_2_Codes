package org.bookstore.readerwriter;



import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/books")
// @ValidateOnExecution(ExecutableType.GETTER_METHODS)
public class BooksResource {
    @Produces("text/plain")
    @GET
    public String getGreeting() {
        return "Hello from Book resource\n";
    }
    

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response addBook(Book book) {
        return Response.ok(book).type(MediaType.APPLICATION_XML_TYPE).build();
    }

//    @GET
//    @Path("{isbn}")
//    @NotNull(message="Book does not exist for the ISBN requested")
//    public Book getBook(
//        @PathParam("isbn")String isbn) {
//        return BooksCollection.getBook(isbn);
//    }
    
}