class Pasta{
public String pastaName;
public boolean pastaTastey;
public Tomato tamato;
public Onion onion;
public Cheese cheese;
public Pasta(String pastaName,boolean pastaTastey,Tomato tamato,Onion onion,Cheese cheese){
this.pastaName=pastaName;
this.pastaTastey=pastaTastey;
this.tamato=tamato;
this.onion=onion;
this.cheese=cheese;
}
public void displayPastaDetails(){
System.out.println("name of the Pasta is="+pastaName);
System.out.println("pasta is raley chrunchy is there in="+pastaTastey);
System.out.println("pasta used in cheese name is="+cheese.cheeseName);
System.out.println("pasta used in cheese price is="+cheese.cheesePrice);
System.out.println("pasta is ready to number of onion is="+onion.noOfOnions);
System.out.println("pasta is used in onion percentage is="+onion.usingPer);
System.out.println("pasta using percentage is="+tamato.usingPer);
System.out.println("pasta used in tamato price is="+tamato.tomatoPrice);
}
}