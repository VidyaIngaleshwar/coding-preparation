class Palindrome{
    public boolean isPalindrome(int n){
        int rev=0;
        int temp=n;
        while(n>0){
          rev=rev*10+(n%10);
          n=n/10;
        }
        return temp==rev;
    }

    public static void main(String[] args){
        int num=141;
        if(Palindrome.isPalindrome(num)){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}