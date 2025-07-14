package Java_OOPS_2;

// Thread allow us to execute multiple tasks at the same time. 
// Thus, it consumes less time.
// Here, it is created by extending Thread class.

class Thread1 extends Thread{
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("Efficient thread is running.\nI'm happy.\n");
            i++;
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("Slow thread is running.\nI'm sad.\n");
            i++;
        }
    }
}

// Here, it is created by using the Runnable Interface
// Class created by a runnable interface is like a bullet which could be used in the presence of a gun.
// which is Thread class in this case.

class RunnableThread1 implements Runnable {
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("Fast runnable thread is running.\n");
            i++;
        }
    }
}

class RunnableThread2 implements Runnable {
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("Slow runnable thread is running.\n");
            i++;
        }
    }
}

// Using constructors in threads

class Thread101 extends Thread{
    String name;
    Thread101(String name){
        this.name = name;
    }

    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("Thank you for running me  " + name);
            i++;
        }
    }
}

// Race Condition with mutable object
class Counter
{
	int count;
//	public void increment()
	public synchronized void increment()
	{
		count++;
	}
}

public class Threads {
    public static void main(String[] args) {
        // Thread1 t1 = new Thread1();
        // Thread2 t2 = new Thread2();

        // // both threads are initiated at same time.
        // t1.start();
        // t2.start();

        // // work would be done in a queue if we assign a particular task to it.
        // // t1.run();
        // // t2.run();

        // // Object for Runnable classes created
        // RunnableThread1 r1 = new RunnableThread1();
        // RunnableThread2 r2 = new RunnableThread2();

        // // loading bullets in the guns
        // Thread rt1 = new Thread(r1);
        // Thread rt2 = new Thread(r2);

        // // now it is usable
        // rt1.start();
        // rt2.start();

        // Constructors in threads
        Thread101 c1 = new Thread101("Aryan1111111111");
        Thread101 c2 = new Thread101("Aryan22222");
        Thread101 c3 = new Thread101("Aryan3");

        // c1.setPriority(Thread.MAX_PRIORITY);
        // c2.setPriority(2);
        // c3.setPriority(Thread.MIN_PRIORITY);

        // c1.start();
        // c2.start();
        // c3.start();

        // If we want that first c1 must finish it's work and then c2 might start, then

        c1.start();

        try {
            c1.join();
        } catch(Exception e) {
            System.out.println(e);
        }

        c2.start();
        c3.start();

        // Directly making the use of Runnable interface as it is a functional interface using Lambda Expression.
        Runnable r1 = () -> {int i = 0;
            while (i < 100){
                System.out.println("Hi");
                i++;
            }
        };
        Runnable r2 = () -> {int i = 0;
            while (i < 100){
                System.out.println("Hello");
                i++;
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.run();

        // Race Condition with mutable object
        Counter c=new Counter();
    	
    	Runnable obj1 = () -> {
            for(int i=1;i<=10000;i++) {
    			c.increment();
    	    }};
        Runnable obj2 = () -> { 
            for(int i=1;i<=10000;i++) {
    		    c.increment();
		    }};
    	
    	Thread t11 = new Thread(obj1);
    	Thread t22 = new Thread(obj2);
    	 	
    	t11.start();
    	t22.start();
    	
    	try {
            t11.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	try {
            t22.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	
    	System.out.println(c.count);
    }
}