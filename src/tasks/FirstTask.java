package tasks;

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int math[] = new int[12];
        int mathQueue[]    = new  int[math.length/2];

        for (int  i=0; i<math.length; i++){
            int value = (int)(1+((Math.random()*2)));
            mathQueue[i] = value;
        }
        System.out.println(Arrays.toString(mathQueue)+  " - mathQueue");
    for (int i=0; i<math.length/2; i++){
        if (mathQueue[i]==1){
            int value  = (int) (1+(Math.random()*(10)));
            math[i]=value;
        }else if (mathQueue[i]==2){
            int value = (int) ( -11+(Math.random()*(10)));
        math[i]= value;
        }
    }
    for (int  j = math.length/2, i=0; j<math.length; j++, i++){
        if (mathQueue[i]==2){
            int value = (int)(1+(Math.random()*(10)));
            math[j]=value;
        }else if (mathQueue[i]==1){
            int value = (int)(-11+(Math.random()*(10)));
            math[j]=value;
        }
    }
        System.out.println(Arrays.toString(math)+" Math");
    }

}
