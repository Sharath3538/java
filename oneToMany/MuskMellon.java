class MuskMellon{
public double rating;
public float sweetPer;
public Fructose fructose;
public MuskMellon(double rating,float sweetPer,Fructose fructose){
this.rating=rating;
this.sweetPer=sweetPer;
this.fructose=fructose;
}
public void MuskMellonDetails(){
System.out.println("give super rating in online="+rating);
System.out.println("it is sweet in this juice="+sweetPer);
System.out.println(fructose.anotherName);
System.out.println(fructose.isReailyTaste);
}
}