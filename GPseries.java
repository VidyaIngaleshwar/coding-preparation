class GPseries{
    public static double gpSum(double a, double r, int n){
        double sum=0;
        double term=a;
        for(int i=0; i<n; i++){
            sum+=term;
            term*=r;
        }
        return sum;
    }

    public static void main(String args[]){
        double a=2,r=3;
        int n=4;
        System.out.println(gpSum(a,r,n));
    }
}