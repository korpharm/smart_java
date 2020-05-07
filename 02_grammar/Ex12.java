class Ex12{ 
   public static void main(String[] args){ 

   //3989초

     int input,h,m,s,res;
     input=3898;
     h=(int)(input/3600);

     //
    
     res=input%3600;
     m=res/60;
     
     s=res%60;

     System.out.println(input+"초는"+ h+"시" +m+"분"+ s+"초");


     
       }


 }