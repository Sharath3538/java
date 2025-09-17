class DoctorRunner {
    public static void main(String [] args) {
        Stetoscope stetoscope = new Stetoscope("Checking");
        Doctor doctor = new Doctor(stetoscope);
        System.out.println(doctor.name);   
    }
}