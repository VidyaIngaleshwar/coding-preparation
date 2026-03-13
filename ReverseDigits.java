class ReverseDigits{
    public static int reversenum(int n){
        int rev=0;
        while(n>0){
            rev =rev*10+ n%10;
            n= n/10;
        }

        return rev;
    }

    public static void main(String[] args){
        int number= 12345;
        System.out.println(reversenum(number));
    }
}