public class Library{
  private Book[] stock;

  public Library(){
    this.stock = new Book[10];
  }

  public int bookCount(){
  int counter = 0;
  for(Book book: stock){
    if(book != null){
      counter++;
      }
    }
  return counter;
  }

  public void addBook(Book book){
    if(this.isStockFull() ){
      return;
    }
    int bookCount = bookCount();
    stock[bookCount] = book;
  }

  public boolean isStockFull(){
    return this.bookCount() == this.stock.length;
  }

  public void clearAllBooks(){
    for(int i = 0; i < stock.length; i ++){
      stock[i] = null;
    }
  }

  public void lendBook(){
    stock[this.bookCount() - 1] = null;
  }

}
