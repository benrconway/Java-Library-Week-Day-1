import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{
  Book book;
  Student student;
  Library library;

  @Before
  public void before(){
    book = new Book();
    library = new Library();
    student = new Student();
  }

  @Test
  public void isEmpty(){
    assertEquals(0, library.bookCount() );
  }

  @Test
  public void hasBooks(){
    library.addBook(book);
    assertEquals(1, library.bookCount() );
  }

  @Test
  public void stockIsFull(){
    for( int i = 0; i < 15; i++){
      library.addBook(book);
    }
    assertEquals(10, library.bookCount() );
  }

  @Test
  public void canClearBooks(){
   for( int i = 0; i < 12; i++){
     library.addBook(book);
      }
   library.clearAllBooks();
   assertEquals(0, library.bookCount() );
  }

  @Test
  public void canLendBook(){
    for(int i = 0; i < 9; i++){
      library.addBook(book);
    }
    library.lendBook();
    assertEquals(8, library.bookCount() );
  }

  @Test
  public void canBorrowBook(){
    library.addBook(book);
    library.lendBook();
    student.takeBook(book);
    assertEquals(1, student.booksInBag());
    assertEquals(0, library.bookCount());
  }

}
