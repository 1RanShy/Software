/*
 * goodAt - > canTeach
 * 
 */

public class PTT extends Staff{
    private String canTeach;  //目前是暂定一个老师只能教一个课程
    private Requirement requirement = new Requirement ();
    private Boolean ifAvailable = true; // 一开始肯定是有空的
    private String trainingID;

    //构造函数
    public PTT(String staffID, String staffName, String email,String canTeach,Boolean ifAvailable) {
        super(staffID, staffName, email);
        this.canTeach = canTeach;
        this.ifAvailable = ifAvailable;
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

    public void setter_ifAvailable(String trainingID){
        this.trainingID = trainingID;
    }

    public String getter_trainingID(){
        return this.trainingID;
    }

}
