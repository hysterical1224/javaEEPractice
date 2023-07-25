package duoxiancheng20;

public class Producer implements Runnable{
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        //30瓶的牛奶
        for (int i=1; i<=30; i++){
            b.put(i);
        }
    }
}