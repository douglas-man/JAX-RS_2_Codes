package org.bookstore.readerwriter;



import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/books")
public class BooksResource {
    @Produces("text/plain")
    @GET
    public String getGreeting() {
        return "Hello from Book resource\n";
    }
}