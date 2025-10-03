class ArijitSingh{
public int noOfSongs;
public boolean allsongSuccessful;
public ThodiJagah thodijagah;
public Dhokha dhokaha;
public TumhiHo tumhiho;
public ArijitSingh(int noOfSongs,boolean allsongSuccessful,ThodiJagah thodijagah,Dhokha dhokaha,TumhiHo tumhiho){
this.noOfSongs=noOfSongs;
this.allsongSuccessful=allsongSuccessful;
this.thodijagah=thodijagah;
this.dhokaha=dhokaha;
this.tumhiho=tumhiho;
}
public void displayArijitSinghDetails(){
System.out.println("arijit singh number of songs is="+noOfSongs);
System.out.println("arijit singhs all song are successful is there="+allsongSuccessful);
System.out.println("this song saddness percentage is="+thodijagah.saddnessPer);
System.out.println("it is song saddness is there="+thodijagah.itissadSong);
System.out.println("dhokaha song in hero name is="+dhokaha.dhokhasongheroName);
System.out.println("dhokaha song salary is="+dhokaha.thissongSalary);
System.out.println("tumhiho song heroine name is="+tumhiho.songHeroineName);
System.out.println("this song romentic wibe is there="+tumhiho.itisromenticWibe);
}
}