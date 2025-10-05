class Instrument{
public String instrumentName;
public int instrumentVoices;
public float instrumentWeigth;
public long instrumentPrices;
public char firstLetter;
public boolean isElectric;
public double instrumentTunes;
public Instrument(String instrumentName,int instrumentVoices,float instrumentWeigth,long instrumentPrices,char firstLetter,boolean isElectric,double instrumentTunes){
this.instrumentName=instrumentName;
this.instrumentVoices=instrumentVoices;
this.instrumentWeigth=instrumentWeigth;
this.instrumentPrices=instrumentPrices;
this.firstLetter=firstLetter;
this.isElectric=isElectric;
this.instrumentTunes=instrumentTunes;
}
public void displayInstrumentDetails(){
System.out.println("name of the instrument is="+this.instrumentName);
System.out.println("instrument number of voice is="+this.instrumentVoices);
System.out.println("instrument total weigth is="+this.instrumentWeigth);
System.out.println("instrument price is="+this.instrumentPrices);
System.out.println("name first letter is="+this.firstLetter);
System.out.println("instrument are electric is there="+this.isElectric);
System.out.println("instrument number of tunes is="+this.instrumentTunes);
}
 }