class UniversityRunner{
public static void main(String [] args){
College college=new College("Nagarujaana",70);
Teachers teachers=new Teachers("navin gowda",80000);
Students students=new Students("Dayanyand",70.57f);
University university=new University ("Bangslore",false,college,teachers,students);
university.displayUniversitydetails();
}
}