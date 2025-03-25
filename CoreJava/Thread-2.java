package zinphone;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadSample1 extends Thread {
        public void run(){
            System.out.println("Thread is running");
        }

    public static void main(String[] args) {
        ThreadSample1 t1=new ThreadSample1();
        t1.start();
        ThreadSample1 t2=new ThreadSample1();
        t2.start();
    }
}

class ThreadSample2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am running using runnable interface");
    }

    public static void main(String[] args) {
        ThreadSample2 t2=new ThreadSample2();
        Thread t=new Thread(t2);
        t.start();
    }
}

class  ThreadSample3{
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.println("I am running using lambda");
        });
        t.start();

        new Thread(()->{
            System.out.println("Hello , I am running using lambda");
        }).start();
    }
}

class  ThreadSample4{
    public static void main(String[] args) {
        testThread("Thread - 1");
        testThread("Thread - 2");
    }

    public synchronized static void testThread(String name){
        Thread t1=new Thread(()->{
            System.out.println("Running Thread .... "+Thread.currentThread().getName());
        },name);
        t1.start();
    }

}

class ThreadSample5{
    public static void main(String[] args) throws InterruptedException {
       testThread();
    }

    public synchronized  static void testThread() throws InterruptedException {
        new Thread(()->{
                System.out.println("Before Waiting");
                System.out.println("After  Waiting");
        }).start();
        Thread.sleep(2000);
        System.out.println("Thread Finished");
    }
}

class ThreadSample6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            System.out.println("Thread 1 Start");
            try{Thread.sleep(1000);} catch (InterruptedException e){}
            System.out.println("Thread 1 finish");
        });

        Thread t2=new Thread(()->{
            System.out.println("Thread 2 Start");
            try{Thread.sleep(500);} catch (InterruptedException e){}
            System.out.println("Thread 2 finish");
        });
        t1.start();
        t2.start();


    }
}

class ThreadSample7{
    private int count=0;
    public  synchronized void increaseCount(){
        count++;
    }
    public int getCount(){
        return count;
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadSample7 t7=new ThreadSample7();
        Thread t1=new Thread(()->{
            for(int i=0;i<10000;i++){
                t7.increaseCount();
                System.out.println(i+" --- From T1");
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<10000;i++){
                t7.increaseCount();
                System.out.println(i+" --- From T2");
            }
        });
        t1.start();
        t2.start();

        System.out.println("Before waiting time : Count = "+t7.getCount());
        Thread.sleep(2000);
        System.out.println("After waiting time : Count = "+t7.getCount());
    }
}

class ThreadSample8{
    public static void main(String[] args) {
        ExecutorService ex= Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            final  int taskId=i;
            ex.execute(()->{
                System.out.println("Task "+taskId+" running "+Thread.currentThread().getName());
            });
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        ex.shutdown();

    }
}

class ThreadSample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
            }
        });
        System.out.println("State After creation  : "+ t1.getState());
        t1.start();
        System.out.println("State after Start  : "+t1.getState());
        Thread.sleep(100);
        System.out.println("State during sleep  : "+t1.getState());
        t1.join();
        System.out.println("State After Complete : "+t1.getState());
        System.out.println(t1.getState().toString());
        if(t1.getState().toString()=="TERMINATED"){
            System.out.println("Terminated State");
        }
    }
}



class ThreadSample9{
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(3);
        for(int i=0;i<100;i++){
            final  int taskId=i;
            executor.execute(()->{
                System.out.println("Task "+taskId+" running "+Thread.currentThread().getName());
            });
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
    }
}
