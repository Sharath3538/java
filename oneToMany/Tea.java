class Tea{
public static String teaName;
public int price;
public Sugar sugar;
public Tea(String teaName,int price,Sugar sugar){
this.teaName=teaName;
this.price=price;
this.sugar=sugar;
}
public void displayTeaDetails(){
System.out.println(teaName+price);
System.out.println(sugar.sugarName);
System.out.println(sugar.isSweet);

}
}