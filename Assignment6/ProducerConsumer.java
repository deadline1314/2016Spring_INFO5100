package Assignment6;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 3. Understand producer-consumer problem and implement it.
 */
public class ProducerConsumer {

	public static void main(String[] args) {
		Storage storage = new Storage();
		
		Producer p1 = new Producer(storage);
		Producer p2 = new Producer(storage);
		Producer p3 = new Producer(storage);
		Producer p4 = new Producer(storage);
		Producer p5 = new Producer(storage);
		Producer p6 = new Producer(storage);
		
		Consumer c1 = new Consumer(storage);
		Consumer c2 = new Consumer(storage);
		Consumer c3 = new Consumer(storage);
		
		p1.setNum(10);
		p2.setNum(10);
		p3.setNum(10);
		p4.setNum(10);
		p5.setNum(10);
		p6.setNum(10);
		
		c1.setNum(2);
		c2.setNum(3);
		c3.setNum(5);
		
		c1.start();
		c2.start();
		c3.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		

	}

}

class Storage {
	private final int MAX_SIZE = 100;

	private LinkedBlockingQueue<Object> list = new LinkedBlockingQueue<Object>(100);

	// produce num products
	public void produce(int num) {

		// if storage is full
		if (list.size() == MAX_SIZE) {
			System.out.println("Storage:" + MAX_SIZE + "/t Can't produce now");
		}

		for (int i = 1; i <= num; ++i) {
			try {
				// produce products
				list.put(new Object());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		System.out.println("I'm producing...Current Volume: " + list.size());
	}

	// consume num products
	public void consume(int num) {
		// if storage is empty
		if (list.size() == 0) {
			System.out.println("No more products in storage.");
		}

		for (int i = 1; i <= num; ++i) {
			try {
				// consume products
				list.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("I'm consuming...Current Volume: " + list.size());
	}

	public LinkedBlockingQueue<Object> getList() {
		return list;
	}

	public void setList(LinkedBlockingQueue<Object> list) {
		this.list = list;
	}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}
}


class Producer extends Thread {
	// num of every producing process
	private int num;

	private Storage storage;

	Producer(Storage storage) {
		this.storage = storage;
	}

	public void run() {
		produce(num);
	}

	public void produce(int num) {
		storage.produce(num);
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}
}


class Consumer extends Thread {
	
	//num of every consuming process
	private int num;
	
	private Storage storage;
	
	public Consumer(Storage storage){
		this.storage = storage;
	}
	
	public void run(){
		consume(num);
	}
	
	public void consume(int num){
		storage.consume(num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	

}
