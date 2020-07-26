import java.io.*;
import java.util.concurrent.ThreadLocalRandom;
public class Assignment2File
{
public static void main(String []args) throws IOException
{
FileWriter fw=new FileWriter("Numbers.txt");
for(int i=0;i<30;i++)
{
fw.write(String.valueOf(ThreadLocalRandom.current().nextInt(1,31)));
fw.write("\r\n");
}
fw.close();
FileReader fr=null;
try
{
fr=new FileReader("Numbers.txt");
BufferedReader br=new BufferedReader(fr);
int count=0;
String line;
double sum=0.0;
System.out.println("The numbers are:");
while((line=br.readLine())!=null)
{
int num1=Integer.parseInt(line);
int num2=Integer.parseInt(br.readLine());
sum+=(num1+num2);
if(count==10)
{
count=0;
System.out.println();
}
System.out.print(num1+" "+num2+" ");
count+=2;
}
System.out.println();
System.out.println("The sum of the numbers are:"+sum);
System.out.println("The average of the numbers are:"+(sum/30));
}
catch(FileNotFoundException fe)
{
System.out.println("File not found");
}
}
}
