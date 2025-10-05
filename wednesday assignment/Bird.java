class Bird extends Parrot{
public String birdName;
public int noOfage;
public float birdWeigth;
public long birdWingspan;
public double noOfIteams;
public char centreLetter;
public boolean isEndangered;
public Bird(String birdName,int noOfage,float birdWeigth,long birdWingspan,double noOfIteams,char centreLetter,boolean isEndangered){
super();
this.birdName=birdName;
this.noOfage=noOfage;
this.birdWeigth=birdWeigth;
this.birdWingspan=birdWingspan;
this.noOfIteams=noOfIteams;
this.centreLetter=centreLetter;
this.isEndangered=isEndangered;
}
public void displayBirdDetails(){
System.out.println("name of the bird is="+this.birdName);
System.out.println("bird is number of age is="+this.noOfage);
System.out.println("bird total weigth is="+this.birdWeigth);
System.out.println("bird wing span is="+this.birdWingspan);
System.out.println("bird eats no Of iteams is="+this.noOfIteams);
System.out.println("bird centre letter is="+this.centreLetter);
System.out.println("wheather bird is endangered in="+this.isEndangered);
System.out.println("name of the bird is="+super.birdName);
System.out.println("bird is number of age is="+super.noOfage);
System.out.println("bird total weigth is="+super.birdWeigth);
System.out.println("bird wing span is="+super.birdWingspan);
System.out.println("bird eats no Of iteams is="+super.noOfIteams);
System.out.println("bird centre letter is="+super.centreLetter);
System.out.println("wheather bird is endangered in="+super.isEndangered);
}
}