import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class Mapp{
    public static void main(String[] args){

        Map<String,Integer> students = new Hashtable<>();

        students.put("Dev",99);
        students.put("Ganz",80);
        students.put("hemu",49);
        students.put("raju",76);
        students.put("NAksh",78);


        for(String key : students.keySet())
        {
            System.out.println(key+":"+students.get(key));
        }


    }
}