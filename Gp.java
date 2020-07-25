class Test{
    void geop(int a,int r,int n){
        for(int i=0;i<n;i++){
            int term=a*(int)Math.pow(r, i);
            System.out.println(term+" ");
        }
    }
}
public class Gp {
    public static void main(String args[]){
        Test obj=new Test();
        obj.geop(2,3,5);

    }
    
}