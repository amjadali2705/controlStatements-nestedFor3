class Core2Web{
    public static void main(String[] args) {
        int n=4;
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(num++ +" ");
            }
            num--;
            System.out.println();
        }
    }
}