class Library{
public String libraryName;
public float booktotalPer;
public Library(String libraryName,float booktotalPer){
this.libraryName=libraryName;
this.booktotalPer=booktotalPer;
}
public void displayLibraryDetails(){
System.out.println("college in library name is="+libraryName);
System.out.println("library collect total book percentage is="+booktotalPer);
}
}