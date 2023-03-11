public class Administrator extends Staff{

    public Administrator(String staffID, String staffName, String email) {
        super(staffID, staffName, email);
    }

    public void check_TeachingRequirement(){

    }

    //应该是从数据库搜索PTT.canTeach 然后打印出来
    public void searchPTT(){

    }

    //administratorID 的传递是使用
    public void add_PTT_to_TeachingRequirement(PTT Ptt,Requirement requirement){

    }

    public void addTrainingtoPTT(){

    }
}
