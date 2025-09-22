class TamotoBath{
public String name;
public int noOfIteam;
public Oil oil;
public Tamotoes tamotoes;
public Batani batani;
public TamotoBath(String name,int noOfIteam,Oil oil,Tamotoes tamotoes,Batani batani){
this.name=name;
this.noOfIteam=noOfIteam;
this.oil=oil;
this.tamotoes=tamotoes;
this.batani=batani;
}
public void displayTamotoBathDetails(){
System.out.println("name of the tamoto bath is="+name);
System.out.println("used iteam list is="+noOfIteam);
System.out.println("total oil percentage is="+oil.usingPerc);
System.out.println("tamotoBath used no of liter oil is="+oil.noOfLiter);
System.out.println("tamotoBath used no of tamotoes is="+tamotoes.noOfUsing);
System.out.println("tamotoes is frying is taste is spicy="+tamotoes.isTaste);
System.out.println("another type batani name is="+batani.bataniName);
System.out.println("TamotoBath total batani used percentage is="+batani.usingPer);
}
}