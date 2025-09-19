class Cherry{
public String fruitName;
public int cost;
public Fructose fructose;
public Cherry(String fruitName,int cost,Fructose fructose){
this.fruitName=fruitName;
this.cost=cost;
this.fructose=fructose;
}
public void CherryDetails(){
System.out.println("varity type fruits in cherry is="+fruitName);
System.out.println("very high cost is there ="+cost);
System.out.println(fructose.anotherName);
System.out.println(fructose.isReailyTaste);
}
}