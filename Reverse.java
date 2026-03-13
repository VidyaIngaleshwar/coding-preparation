class Reverse{
    public static void main(String args[]){
        String str = "hello world";
        string rev = "";
        for(int i= str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }
}