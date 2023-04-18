import java.io.*;
class AutomorficNo{
        public static void main(String[] args)throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Number :");
            int num =Integer.parseInt(br.readLine());

                int count=0;
                

                for(int temp=num;temp!=0;temp=temp/10){
                        count++;
                }
                int sum=0;
                int sq=num*num;

                for(int i=1;i<=count;i++){
                        int rem=sq%10;
                        sum=sum*10+rem;
                        sq=sq/10;
                }
                int temp2=0;
                for(int temp=sum;temp!=0;temp=temp/10){
                        temp2=temp2*10+(temp%10);
                }

                if(temp2==num){
                   System.out.println("Automorfic Number");
                }
                else{
                        System.out.println("Not Automorfic Number");
                }
        }
}
