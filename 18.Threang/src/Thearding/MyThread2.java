public class MyThread2 extends Thread{
    Test t;

    MyThread2(Test t){
        this.t = t;
    }

    public void run(){
        t.printTable(100);
    }
}
