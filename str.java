 class str {
    public static void main(String[] args){
        String a = "hello";
        String b = "HELLO";
        System.out.println(a.toUpperCase());
        System.out.println(b.toUpperCase());

        if(a.equals(b)){
            System.out.println("Both the strings are equal");
        }
        else{
            System.out.println("both are not equal");
        }
    }
}
