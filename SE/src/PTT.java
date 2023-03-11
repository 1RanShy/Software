import java.io.PrintStream;

/*
 * goodAt - > canTeach
 * 
 */

public class PTT extends Staff{
    private String canTeach;  //目前是暂定一个老师只能教一个课程
    private Requirement requirement = new Requirement ();
    private Boolean ifAvailable; // 一开始肯定是有空的
    private String trainingID;

    //构造函数
    public PTT(String staffID, String staffName, String email,String canTeach) {
        super(staffID, staffName, email);
        this.canTeach = canTeach;
        this.ifAvailable = true;
        this.trainingID = null;
    }

    public void setter_canTeach(String canTeach){
        this.canTeach = canTeach;
    }

    public String getter_canTeach(){
        return this.canTeach;
    }

    public void setter_requirement(Requirement requirement){
        this.requirement = requirement;
    }

    public Requirement getter_requirement(){
        return this.requirement;
    }

    public void setter_ifAvailable(Boolean ifAvailable){
        this.ifAvailable = ifAvailable;
    }

    public Boolean getter_ifAvailable(){
        return this.ifAvailable;
    }

    public void setter_trainingID(String trainingID){
        this.trainingID = trainingID;
    }

    public String getter_trainingID(){
        return this.trainingID;
    }
    //

    public void	print(PrintStream ps) {
        ps.print(String.format("ID: %s", this.requirement.getRequirementId()));
        ps.print(String.format("CreatedDate: %s", this.requirement.getCreatedDate()));
        ps.print(String.format("CourseId: %s", this.requirement.getCourseId()));
        ps.print(String.format("PttId: %s", this.requirement.getPttId()));
        ps.print(String.format("AdminstratorId: %s", this.requirement.getAdminstratorId()));
        int stauts = this.requirement.getReqStatus();
        if (stauts == 0)
            ps.print(String.format("Status: Incomplete"));
        else if (stauts == 1)
            ps.print(String.format("Status: Complete"));
        else if (stauts == -1)
            ps.print(String.format("Status: Need to be modified"));
        ps.println();        
    }
}
