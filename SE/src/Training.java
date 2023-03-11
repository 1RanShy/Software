import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Training {
    private String trainingId; //training的id
    /*
     * 一共五位数
     * 第一位为星期：1,2,3,4,5
     * 第二三位为开始时间
     * 第四五位为结束时间*/
    private String trainingTime; //培训的时间
    private List<PTT> pttList; //参与培训的ptt
    private	int	i; //添加ptt时
    private int max; //每个班最多几人

    public Training(String trainingId, String trainingTime){
        i = 0;
        max = 20;
        this.trainingId = trainingId;
        this.trainingTime = trainingTime;
        this.pttList = new ArrayList<PTT>(max);
    }

    public String getTraining(String trainingId) {
        return trainingId + trainingTime + pttList; //感觉这里有点问题，或者建一个print函数
    }

    public void add(PTT ptt) {
        pttList.set(i++, ptt);
    }

    public void remove(PTT ptt) {
        int	j;
        for (j = 0; j < i; j++)
            if (pttList.get(j) == ptt)
                break;
        i--;
        for (; j < i; j++)
            pttList.set(j, pttList.get(j + 1));
    }

    public PTT find(String pttId)	{
        for (int j = 0; j < i; j++)
            if (pttList.get(j).getter_staffID().equals(pttId))
                return pttList.get(j);
        return null;
    }

    public void	print(PrintStream ps) {
        for (int j = 0; j < i; j++) {
            ps.print(String.format("ID: %s", pttList.get(j).getter_staffID()));
            ps.print(String.format("Name: %s", pttList.get(j).getter_staffName()));
            ps.print(String.format("Email: %s", pttList.get(j).getter_email()));
            ps.println();
        }
    }
}
