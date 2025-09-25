class Shanker extends Hero{
public String movieName;
public int age;
public float filmRatings;
public double fundings;
public boolean isSucess;
public char firstLetter;
public long phoneNum;



public Shanker(String movieName,int age,float filmRatings,double fundings,boolean isSucess,char firstLetter,long phoneNum){
super();
this.movieName=movieName;
this.age=age;
this.filmRatings=filmRatings;
this.fundings=fundings;
this.isSucess=isSucess;
this.firstLetter=firstLetter;
this.phoneNum=phoneNum;
}
public  void displayShankerDetails(){
	System.out.println("shanker movie name is="+this.movieName);
	System.out.println("Hero detalies"+super.movieName);
	System.out.println("shanker age is="+this.age);
	System.out.println("Hero detalies"+super.age);
	System.out.println("shanker acting film ratings is="+this.filmRatings);
	System.out.println("Hero detalies"+super.filmRatings);
	System.out.println("shanker social service fundings is="+this.fundings);
	System.out.println("Hero detalies"+super.fundings);
	System.out.println("shanker films sucess is real="+this.isSucess);
	System.out.println("Hero detalies"+super.isSucess);
	System.out.println("shanker first letter is"+this.firstLetter);
	System.out.println("Hero detalies"+super.firstLetter);
	System.out.println("shanker phone number is="+this.phoneNum);
	System.out.println("Hero detalies"+super.phoneNum);
	
}
}