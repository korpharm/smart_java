class Ex12{ 
   public static void main(String[] args){ 

   //3989��

     int input,h,m,s,res;
     input=3898;
     h=(int)(input/3600);

     //
    
     res=input%3600;
     m=res/60;
     
     s=res%60;

     System.out.println(input+"�ʴ�"+ h+"��" +m+"��"+ s+"��");


     
       }


 }