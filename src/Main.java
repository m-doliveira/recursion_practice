public class Main {
    public static void main(String[] args) {
        Main myapp= new Main();
    }
    public Main(){
        int a;
factorials(4);
    }

    public int factorials(int a){
        int fac=a;
        if (a==0) {
            return 1;

        }
        else{
            factorials(a-1);
            return fac*(a-1);
        }
    }
}
