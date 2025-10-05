class University{
public String universityName;
public boolean universityallstudentPass;
public College college;
public Teachers teachers;
public Students students;
public University(String universityName,boolean universityallstudentPass,College college,Teachers teachers,Students students){
this.universityName=universityName;
this.universityallstudentPass=universityallstudentPass;
this.college=college;
this.teachers=teachers;
this.students=students;
}
public void displayUniversitydetails(){
System.out.println("name of the university is="+universityName);
System.out.println("every years all students pass is there="+universityallstudentPass);
System.out.println(college.collegeName);
System.out.println(college.collegeSterngth);
System.out.println(teachers.teacherName);
System.out.println(teachers.teacherSalary);
System.out.println(students.studentName);
System.out.println(students.studentperce);
}
}