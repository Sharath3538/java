class Noodles{
public String noodlesName;
public int price;
public Maggi maggi;
public Noodles(String noodlesName,int price,Maggi maggi){
this.noodlesName=noodlesName;
this.price=price;
this.maggi=maggi;
}
public void displayNoodlesDetails(){
System.out.println("name of the noodles is="+noodlesName);
System.out.println("varity price of varity noodles="+price);
System.out.println(maggi.maggiName);
System.out.println(maggi.isTastey);
}
}