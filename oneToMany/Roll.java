class Roll{
public String rollName;
public int rollprice;
public Maggi maggi;
public Roll(String rollName,int rollprice,Maggi maggi){
this.rollName=rollName;
this.rollprice=rollprice;
this.maggi=maggi;
}
public void displayRollDetails(){
System.out.println("many number of roll name="+rollName);
System.out.println("roll is different price="+rollprice);
System.out.println(maggi.maggiName);
System.out.println(maggi.isTastey);
}
}