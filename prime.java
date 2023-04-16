import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter a Number :");
                int num=Integer.parseInt(br.readLine());

                int count=0;

                for(int i=1;i<=num;i++){
                        if(num%i==0){
                                count++;
                        }
                }
                if(count==2){
                        System.out.println("It is a Prime No.");
                }
                else{
                        System.out.println("It is not a Prime No.");
                }
        }
}
     