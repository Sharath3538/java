class MathematicsBook{
public int noOfPages;
public boolean isreallyUnderstand;
public Library library;
public MathematicsBook(int noOfPages,boolean isreallyUnderstand,Library library){
this.noOfPages=noOfPages;
this.isreallyUnderstand=isreallyUnderstand;
this.library=library;
}
public void displayMathematicsBookDetails(){
System.out.println("mathematics book in number of pages is="+noOfPages);
System.out.println("mathematics book is reading in really understand in="+isreallyUnderstand);
System.out.println(library.libraryName);
System.out.println(library.booktotalPer);
}
}