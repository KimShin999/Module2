public class MyThread1 extends Thread{
    Test t;

    MyThread1(Test t){
        this.t = t;
    }

    public void run(){
        t.printTable(5);
    }
}
