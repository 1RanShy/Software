import java.text.SimpleDateFormat;
import java.util.Date;

//cd提交requirement，administrator添加内容等
public class Requirement {
    private String requirementId; //识别requirement的ID
    private String classDirectorId; //创建该requirement的ClassDirector的staffID
    private String createdDate; //创建该requirement的日期
    private String courseId; //课程的ID号
    private String pttId; //上这门课的PTT，CD创建时为空，后面需要A填写
    private String adminstratorId; //添加PTT的adminstrator
    /*
    * 0代表未完成
    * 1代表已完成（安排好了教师）
    * -1代表需要修改（没有合适的老师）--->这时候应该需要修改courseId
     */
    int reqStatus;//当前requirement的状态

    public	Requirement(String classDirectorId, String courseId) {
        this.requirementId = "1001"; //这里肯定要改！先让代码跑起来
        this.classDirectorId = classDirectorId;

        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date now = new Date();
        this.createdDate = timeFormat.format(now);

        this.courseId = courseId;

        this.pttId = null;

        this.adminstratorId = null;

        reqStatus = 0;
    }

    //administrator设置Ptt
    public void setPttId(String pttId, String adminstratorId) {
        this.pttId = pttId;
        this.adminstratorId = adminstratorId;
        this.reqStatus = 1;
    }

    //administrator没有找到合适的Ptt，修改reqStatus的状态
    public void setReqStatus(String adminstratorId) {
        this.adminstratorId = adminstratorId;
        this.reqStatus = -1;
    }

    //判断当前cd是否是创建这个requirement时的人
    public boolean isCdIdEquals(String staffId) {
//        boolean isEquals = this.classDirectorId.equals(staffId);
        return this.classDirectorId.equals(staffId);
    }

    //修改requirement的信息，只有写这个的cd才能修改courseId的信息
    public void modifyCourseId(String staffId, String courseId) { //staffId为系统传入
        if(isCdIdEquals(staffId)) { //返回true
            this.courseId = courseId;
        }else {
            System.out.println("Sorry, you have no permission to modify.");
        }
    }
}