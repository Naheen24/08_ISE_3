public class PrimeNo 
{  
public static void main(String[] args)   
    {  
int c=0,no=0,i=1,j=1;  
while(no<25)  
{  
j=1;  
c=0;  
while(j<=i)  
{  
if(i%j==0)  
c++;  
j++;   
}  
if(c==2)  
{  
System.out.printf("%d ",i);  
no++;  
}  
i++;  
}    
}  
}  
