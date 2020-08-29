import java.util.*;
public class Islands {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];
        int b[][]={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        
        //taking input
        System.out.println("Enter array elements");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++)
                a[i][j]=sc.nextInt();
        }
        
        //solving
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i][j]==1 && b[i][j]==0){
                    check(a,b,i,j);
                    count++;
                }
            }      
        }
        System.out.println("count="+count);
    }
        //creating method
        public static void check(int c[][],int d[][],int m,int n)
        {
            d[m][n]=1;
            if(m-1>=0 && m-1<=4 && n-1>=0 && n-1<=4 && c[m-1][n-1]==1 && d[m-1][n-1]==0)
                check(c,d,m-1,n-1);
            
            if(m-1>=0 && m-1<=4 && n>=0 && n<=4 && c[m-1][n]==1 && d[m-1][n]==0)
                check(c,d,m-1,n);
            
            if(m-1>=0 && m-1<=4 && n+1>=0 && n+1<=4 && c[m-1][n+1]==1 && d[m-1][n+1]==0)
                check(c,d,m-1,n+1);
            
            if(m>=0 && m<=4 && n-1>=0 && n-1<=4 && c[m][n-1]==1 && d[m][n-1]==0)
                check(c,d,m,n-1);
            
            if(m>=0 && m<=4 && n+1>=0 && n+1<=4 && c[m][n+1]==1 && d[m][n+1]==0)
                check(c,d,m,n+1);
            
            if(m+1>=0 && m+1<=4 && n-1>=0 && n-1<=4 && c[m+1][n-1]==1 && d[m+1][n-1]==0)
                check(c,d,m+1,n-1);
            
            if(m+1>=0 && m+1<=4 && n>=0 && n<=4 && c[m+1][n]==1 && d[m+1][n]==0)
                check(c,d,m+1,n);
            
            if(m+1>=0 && m+1<=4 && n+1>=0 && n+1<=4 && c[m+1][n+1]==1 && d[m+1][n+1]==0)
                check(c,d,m+1,n+1);
        }
        
        
    
    
}
