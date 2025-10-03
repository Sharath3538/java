class LibraryRunner{
public static void main(String [] args){
Library library=new Library("Thebritish library",8.1f);
MathematicsBook mathematicsBook=new MathematicsBook(389,true,library);
JavaBook javaBook=new JavaBook("HerbertSchildt",485,library);
StoryBook storyBook=new StoryBook("HarryPotter",780,library);
library.displayLibraryDetails();
mathematicsBook.displayMathematicsBookDetails();
javaBook.displayJavaBookDetails();
storyBook.displayStoryBookDetails();
}
}