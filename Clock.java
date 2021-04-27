package package_1;

public class Clock {
    int hours;
    int min;
    int sec;
    Clock(){}
    Clock(int h,int m,int s){
        hours=h;
        min=m;
        sec=s;
    }
    public void display(){
        System.out.println(hours + ":" + min + ":" + sec);
        

    }
}
