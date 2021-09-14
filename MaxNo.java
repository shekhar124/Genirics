package com.bl;

public class MaxNo {
	public static Integer findMax(Integer a, Integer b, Integer c) {
        Integer max = a;
        if(b.compareTo(max)> 0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        System.out.printf("The max of three numbers %s %s %s is : %s \n",a,b,c,max);
        return max;
    }
    public static void main(String[] args) {
        //TestCase1 max no.is first position
        Integer int1 = 100,int2 = 50,int3 = 25;
        Integer max = findMax(int1,int2,int3);

        //TestCase2 max no.is second position
        Integer int4 = 50,int5 = 100,int6 = 25;
        Integer max1 = findMax(int4,int5,int6);

        //TestCase max no.is third position
        Integer int7 = 25,int8 = 50,int9 = 100;
        Integer max2 = findMax(int7,int8,int9);
    }
	

	

}
