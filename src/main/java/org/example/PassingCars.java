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
            // first car passes all cars form oposite site
            //this specific car should not be counted more
            if(A[i]==1){//this car was trvling West, so we dont count cars it is passing by
                tvlWest--;
            }else{//this car was trvling East, so we count
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
