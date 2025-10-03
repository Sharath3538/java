class StoryBook{
public String storybookName;
public int storybookPrice;
public Library library;
public StoryBook(String storybookName,int storybookPrice,Library library){
this.storybookName=storybookName;
this.storybookPrice=storybookPrice;
this.library=library;
}
public void displayStoryBookDetails(){
System.out.println("name of the story book is="+storybookName);
System.out.println("story book price is="+storybookPrice);
System.out.println(library.libraryName);
System.out.println(library.booktotalPer);
}
}