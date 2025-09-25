class Planet extends Earth{
public String planetName;
public int planetSize;
public float waterPer;
public double distanceMeter;
public long bigNumber;
public boolean lifeLeading;
public char lastWord;
public Planet(String planetName,int planetSize,float waterPer,double distanceMeter,long bigNumber,boolean lifeLeading,char lastWord){
super();
this.planetName=planetName;
this.planetSize=planetSize;
this.waterPer=waterPer;
this.distanceMeter=distanceMeter;
this.bigNumber=bigNumber;
this.lifeLeading=lifeLeading;
this.lastWord=lastWord;
}
public void displayPlanetDetails(){
System.out.println("name of the planet is="+this.planetName);
System.out.println("Earth details"+super.planetName);
System.out.println("planet total size is="+this.planetSize);
System.out.println("Earth details"+super.planetSize);
System.out.println("planet water percentage is="+this.waterPer);
System.out.println("Earth details"+super.waterPer);
System.out.println("travelling one planet to another planet distance meter is="+this.distanceMeter);
System.out.println("Earth details"+super.distanceMeter);
System.out.println("planet big number is ="+this.bigNumber);
System.out.println("Earth details"+super.bigNumber);
System.out.println("planet life leading is very easy ="+this.lifeLeading);
System.out.println("Earth details"+super.lifeLeading);
System.out.println("planet last word is="+this.lastWord);
System.out.println("Earth details"+super.lastWord);

}
}