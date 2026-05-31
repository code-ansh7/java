class printEvenOdd {
    public static void main(String args[]){
        System.out.println("Even numbers : ");
        for(int i = 0; i <= 100; i = i + 2){
            System.out.print(i+"  ");
        }
        System.out.println("");
        System.out.println("Odd numbers : ");

        for(int i = 1; i <= 100; i = i + 2){
            System.out.print(i+"  ");
        }
    }
}
