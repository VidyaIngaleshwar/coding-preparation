class Prime{
    public boolean check(int n){
        int cnt =0;
        
        for(int i=0;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        return cnt==2;
    }
    public static void main(String args[]){
        int n= 1483;
        if(Prime.check(n)){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not a prime.");
        }
    }
}