public class objectPassing {
    public static void main(String[] args){
        namelist student1 = new namelist("John Doe");
        namelist student2 = new namelist("Jane Smith");
        attendance Attendance = new attendance();
        Attendance.markAttendance(student1);
        Attendance.markAttendance(student2);
        }
}
// Objects can be passed as parameters to methods, allowing for more complex interactions between objects.
