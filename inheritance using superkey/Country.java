class Country extends India{
public String countryName;
public int countryReligion;
public float countryRatio;
public long countryPopulation;
public boolean lifeisGood;
public double countryBudget;
public char coutryfirstWord;
public Country(String countryName,int countryReligion,float countryRatio,long countryPopulation,boolean lifeisGood,double countryBudget,char coutryfirstWord){

super();
this.countryName=countryName;
this.countryReligion=countryReligion;
this.countryRatio=countryRatio;
this.countryPopulation=countryPopulation;
this.lifeisGood=lifeisGood;
this.countryBudget=countryBudget;
this.coutryfirstWord=coutryfirstWord;
 
}
public void displayCountryDetail(){
System.out.println("name of the country is="+ this.countryName);
System.out.println("India Details"+ super.countryName);
System.out.println("country total religion is="+ this.countryReligion);
System.out.println("India Details"+ super.countryReligion);
System.out.println("country total ratio is="+ this.countryRatio);
System.out.println("India Details"+ super.countryRatio);
System.out.println("country total population is="+ this.countryPopulation);
System.out.println("India Details"+ super.countryPopulation);
System.out.println("country life good is="+ this.lifeisGood);
System.out.println("India Details"+ super.lifeisGood);
System.out.println("country total budget is="+ this.countryBudget);
System.out.println("India Details"+ super.countryBudget);
System.out.println("country first word is ="+ this.coutryfirstWord);
System.out.println("India Details"+ super.coutryfirstWord);
}
}