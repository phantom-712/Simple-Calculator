import java.util.*;
class Calculator
{
    public static void main ()
    {
        Scanner obj = new Scanner(System.in);char repeat;
      do
       { 
        System.out.println("hello there!");
        System.out.println("Welcome to calculator! You can only input 2 numbers"+"\n"+ "enter the 2 numbers.");
        double a,b;
        a=obj.nextDouble();
        b=obj.nextDouble();
        System.out.println("choose one of the following - " + "\n" + "* -> multiply"+"\n" +"+ -> add" + "\n" + "- ->subtract");
        System.out.println("/ -> divide" + "\n" + "^ -> 1st no to the power of 2nd number" + "\n" + "f -> to find factorial of 1st no.");
        System.out.println("F - to find the factorial of the second number");
        System.out.println("l - log of 1st no. \nL - log of 2nd number  \nAll logs are of base 10");
        char choice = obj.next().charAt(0);
        switch(choice)
        {
            case '*' :double r1=a*b;System.out.println(a+"*"+b+"="+r1);break;
            case '+' :double r2=a+b;System.out.println(a+"+"+b+"="+r2);break;
            case '-' :double r3=a-b;System.out.println(a+"-"+b+"="+r3);break;
            case '/' :double r4=a/b;System.out.println(a+"/"+b+"="+r4);break;
            case '^' :double r5=Math.pow(a,b);System.out.println(a+"^"+b+"="+r5);break;
            case 'f' : int i=1;double r6=1;
                       for(i=1;i<=a;i++)//6!=1*2*3*4*5*6
                       {
                           r6*=i;
                        }
                        System.out.println(a+"!"+"="+r6);break;
            case 'F' : int i1=1;double r7=1;
                       for(i1=1;i1<=b;i1++)
                       {
                           r7*=i1;
                        }
                        System.out.println(b+"!"+"="+r7);break;
            case 'l' :double r8 = Math.log(a);System.out.println("Log of " +a+" to the base 10 ="+r8);break;
            case 'L' :double r9 = Math.log(b);System.out.println("Log of "+ b+" to the base 10 ="+r9);break;

            default : System.out.println("wrong choice");break;
            }
            System.out.println("if you want to repeat the process press 'R'"+"\nTo exit press E");
            repeat =obj.next().charAt(0);
            if(repeat=='E')
            {
             System.out.println("*EXIT CALCULATOR*");
             System.exit(0);
            }
            else if(repeat !='R')
            {
             System.out.println("sorry wrong input. "+ "\n*EXIT CALCULATOR*");
             System.exit(0);
            }
            
            
        }while(repeat == 'R');
    }
}
    