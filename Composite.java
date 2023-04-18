import java.io.*;
class CompNo{
        public static void main(String[] arr)throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter Number :");
         int num=Integer.parseInt(br.readLine());

          int count=0;

          for(int i=1;i<=num;i++){
                  if(num%i==0){
                          count++;
                 }
          }
                  if(count>2){
                          System.out.println("Composite Number");
                  }
                  else{
                          System.out.println("Not composite NUmber");
                  }
           }
}
