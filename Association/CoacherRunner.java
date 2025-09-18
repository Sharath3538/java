class CoacherRunner{
public static void main(String [] args){
Coaching coaching=new Coaching(16000,"CricketAcademy");
Coacher coacher=new Coacher("YereGoud",600000,coaching);
coacher.displayCoacherTeams();
}
}