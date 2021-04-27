package package_1;

public class ClockExtended extends Clock {
    ClockExtended(){}
    ClockExtended(int h,int m,int n){
        super(h,m,n);
    }
    @Override
    public void display(){
        System.out.println("24 hour clock:-"+hours + ":" + min + ":" + sec);
        if(hours>12) {
            hours-=12;
            System.out.println("12 hour clock:-"+hours + ":" + min + ":" + sec+"" +" pm");
        }else{
            System.out.println("12 hour clock:-"+hours + ":" + min + ":" + sec+"" +" am");
        }

    }
}
