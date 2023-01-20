import java.util.Scanner;
class npypat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,k=1;
System.out.print("Enter number of rows:");
n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<=i;j++){
System.out.print(k);
}
System.out.println();
k++;
}
k=n-1;
for(i=n-2;i>-1;i--){
for(j=0;j<=i;j++){
System.out.print(k);
}
System.out.println();
k--;
}
}
}
