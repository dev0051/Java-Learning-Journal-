import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Arraylist {

    public static void main(String[] args){

        List<Integer> nums= new ArrayList<Integer>();
        nums.add(6);
        nums.add(4);
        nums.add(2);
        nums.add(9);

        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(2));

        for(Integer num:nums ){

            System.out.println(nums);
        }
    }
}