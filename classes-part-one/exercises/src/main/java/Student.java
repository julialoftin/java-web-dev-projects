public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        // Constructor
        public Student(String name, int studentId, int numberOfCredits, double gpa){
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Setters
        public void setName(String aName) {
                name = aName;
        }
        public void setStudentId(int aStudentId) {
                studentId = aStudentId;
        }
        private void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
        private void setGpa(double gpa) {
                this.gpa = gpa;
        }

        // Getters
        public String getName() {
                return this.name;
        }
        public int getStudentId() {
                return this.studentId;
        }
        public int getNumberOfCredits() {
                return this.numberOfCredits;
        }
        public double getGpa() {
                return this.gpa;
        }

        // Change this method to a toString() method
        public String toString() {
                return name + "(" + studentId + ")" + " has a gpa of " + gpa + " and " + numberOfCredits + " credit(s).";
        }
}
