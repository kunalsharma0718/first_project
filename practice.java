import java.util.*;
public class practice{
public static void main(String[] args) {
    int x=4,y=5; System.out.println(x +","+y);
    addTen(x,y);System.out.println(x +","+y);
}
    static void addTen(int x,int y){
        x+=10;y+=10;                       //local scope of x,y----> finishes as soon as addTen() block ends  
        System.out.println(x +","+y);
    }
}