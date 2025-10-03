class JavaBook{
public String authorName;
public int noOfPages;
public Library library;
public JavaBook(String authorName,int noOfPages,Library library){
this.authorName=authorName;
this.noOfPages=noOfPages;
this.library=library;
}
public void displayJavaBookDetails(){
System.out.println("java book in author name is="+authorName);
System.out.println("java book total number of pages is="+noOfPages);
System.out.println(library.libraryName);
System.out.println(library.booktotalPer);
}
}