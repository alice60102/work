public class homework424_1 {
    public static void main(String[] args) {
       int a[] = {75,29,10,38,45,17};
       System.out.println("arr={"+line(a)+"}");
       System.out.print("average value:"+avg(a));
    }
    public static double avg(int arr[]){
        double b = 0;
        for (int i = 0;i<arr.length;i++){
            b += arr[i];
        }
        return b/arr.length;
    }
    public static String line(int arr[]){
        String c = "";
        for (int i = 0;i<arr.length;i++){
            if (i==arr.length-1){
                c += arr[i];
            }else{
            c += arr[i]+",";
            } 
        }
        return c;
    }
}
