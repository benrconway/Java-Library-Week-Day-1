public class Student{
  private Book[] bag;

  public Student(){
    this.bag = new Book[3];
  }

  public int booksInBag(){
    int counter = 0;
    for(Book book: bag){
      if(book != null){
        counter++;
      }
    }
    return counter;
  }

  public boolean isBagFull(){
    return this.booksInBag() == this.bag.length;
  }

  public void takeBook(Book book){
    if(this.isBagFull()){
      return;
    }
    int booksInBag = booksInBag();
    bag[booksInBag] = book;
  }

}
