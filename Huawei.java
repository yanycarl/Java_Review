package huawei;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> b = new LinkedHashMap();
		c = b.entrySet().iterator();
		Math.lo
	}
}

for(int i=(int)Math.floor(Math.log((double)input)/Math.log(26)); i>=0; i--){
    
    if(i == 0){
        System.out.print((char)(input+'a'-1));
    }
    
    else if(input > Math.pow(26, i)){
        int tempAmount = 0;
        tempAmount = (int)input/((int)Math.pow(26, i));
        System.out.print((char)(tempAmount+'a'-1));
        input -= tempAmount*(int)Math.pow(26, i);
    }
}



import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        if(input<27){
            System.out.println((char)(input+'a'-1));
        }
        
        else{
            int j = input;
            j = (j-1)/26;
            j = (int)Math.floor(Math.log((double)j)/Math.log(27))+1;

            for(int i=j; i>0; i--){
                int tempAmount=0;
                if(i != 1){
                    tempAmount = input/((int)Math.pow(27,i-1)*26);
                    input -= (tempAmount)*((int)Math.pow(26,i-1)*26);
                    System.out.print((char)(tempAmount+'a'-1));
                }
                else{
                    tempAmount = input/26;
                    input -= tempAmount*26;
                    System.out.print((char)(tempAmount+'a'-1));
                }
            }
            System.out.print((char)(input+'a'-1));
        }
        return;
    }
}
