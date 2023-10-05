public class homework424_2 {
    public static void main(String[] args) {
        System.out.println("Triangle1 Area:"+triangle(6,3));
        System.out.println("Triangle2 Area:"+triangle((float)4.2,(float)3.3));
    }
    
    public static float triangle(float base, float height){
        float a,b,c;
        a = base;
        b = height;
        c = (a*b)/2;
        return c;
    }
}
