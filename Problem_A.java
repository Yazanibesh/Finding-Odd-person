public class Problem_A{
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       // TODO code application logic here
   Scanner scan = new  Scanner(System.in);//Initializing scanner to scan input from user
       int n=scan.nextInt();//scanning the number of cases in variable n
       int i=0;//initializing loop handeler
       while(i < n){// While loop 1 to handle the number of cases (note: it will run n number of times (cases))
       int g=scan.nextInt();//scanning number of guests
       String s=scan.nextLine();//initializing the code variable which will store codes of all guests
       s=scan.nextLine();//scanning the whole line of codes

       String[] values;
       values=s.split(" ");//spliting whole codes into single elements

       int code=0;
       int count = 0;
       int num;
       while(code < g){// while loop 2 to get a number one time each
       num=Integer.parseInt(values[code]);
       int c=0;
        while(c < g){// While Loop 3 to calculate the number  of times a code occered in provided list
            if( num == Integer.parseInt(values[c])){
            count = count +1;
            }
        c=c+1;}

          if(count == 1){// checking if code occered once  then it will stop the loop
       System.out.println("Case #"+(i+1)+":"+num);
        break;}
        count=0;
       code=code+1;
       }



       i=i+1;// case increment

       }



   }






}
