//最主要的应该是让cd修改requirement时用到Id
public class Course {
    /*
    * 课程id的形式可以为四位，比如1023
    * 其中第一位代表不同的科目类别*/
    private String courseId; //课程的Id号
    private String courseName; //课程名，可有可不有

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getInfo(){
        return "courseId: " + this.courseId + ", courseName: " +this.courseName;
    }
}
