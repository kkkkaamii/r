public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public double getScholarship() {
        return (averageMark == 5) ? 100 : 80;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + ", Group: " + group + ", Average Mark: " + averageMark;
    }
}

class Aspirant extends Student {
    private String researchTopic;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String researchTopic) {
        super(firstName, lastName, group, averageMark);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    public double getScholarship() {
        return (getAverageMark() == 5) ? 200 : 180;
    }

    @Override
    public String toString() {
        return super.toString() + ", Research Topic: " + researchTopic;
    }
}
