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
    

}
