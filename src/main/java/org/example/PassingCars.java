package org.example;

import java.util.Arrays;

public class PassingCars {
    public int solution(int[] A){
        int result=0;
        int tvlWest=0, tvlEast=0;
        for(int i: A){
            if(i==1){
                tvlWest++;
            }else{ //must be 0 coz conidtions
                tvlEast++;
            }
        }
        //O(N)

        for(int i=0;i<A.length;i++){
            //count and remove
            if(A[i]==1){//this car was trvling West
                result+=tvlEast;// first car passes all cars form oposite site
                tvlWest--;//this specific car should not be counted more
            }else{//this car was trvling East
                result+=tvlWest;
                tvlEast--;
            }
            if(result>1000000000){
                return -1;
            }
        }
        //O(N)

        return result;
    }
}
