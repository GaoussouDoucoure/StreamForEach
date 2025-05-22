import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
        // asList is a method that help to put values in arrays faster, belongs to the class arrays

//    	for(int i=0;i<nums.size();i++)
//    	{
//    		System.out.println(nums.get(i));
//    	}


//    	for(int n: nums)
//    	{
//    		System.out.println(n);
//    	}

        nums.forEach(n -> System.out.println(n)); //Stream API forEach
        //   forEach(name the variable -> what to do with that variable)

        int sum=0;
        for(int n:nums)
        {
            if(n%2==0)
            {
                n=n*2;
                sum=sum+n;
            }
        }

//    	System.out.println(nums);
        System.out.println();
        System.out.println(sum);

    }
}