import java.io.PrintStream;
import java.util.ArrayList;
public class ClassDirector extends Staff{

    //课程要求列表
    private ArrayList<Requirement> requirementList = new ArrayList<Requirement>();

    public ClassDirector(String staffID, String staffName, String email) {
        super(staffID, staffName, email);
    }

    public ArrayList<Requirement> getter_requirementList(){
        return this.requirementList;
    }

    //使用 Requirement类中的函数创建一个新的Requirement对象然后使用add函数加入这个动态数组中
    public void adder_requirementList(Requirement requirement){
        this.requirementList.add(requirement);
    }

    public void	print(PrintStream ps) {
        for (int j = 0; j < requirementList.size(); j++) {
            ps.print(String.format("ID: %s", requirementList.get(j).getRequirementId()));
            ps.print(String.format("CreatedDate: %s", requirementList.get(j).getCreatedDate()));
            ps.print(String.format("CourseId: %s", requirementList.get(j).getCourseId()));
            ps.print(String.format("PttId: %s", requirementList.get(j).getPttId()));
            ps.print(String.format("AdminstratorId: %s", requirementList.get(j).getAdminstratorId()));
            int stauts = requirementList.get(j).getReqStatus();
            if (stauts == 0)
                ps.print(String.format("Status: Incomplete"));
            else if (stauts == 1)
                ps.print(String.format("Status: Complete"));
            else if (stauts == -1)
                ps.print(String.format("Status: Need to be modified"));
            ps.println();
        }
    }
}
