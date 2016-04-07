package Assignment6;

/**
 * 1. Create five threads, let them print out ¡°A¡±, ¡°B¡±, ¡°C¡±, ¡°D¡±, ¡°E¡±
 * individually. The result shows on the screen should be: ¡°ABCDEABCDEABCDE¡­...¡±
 */
public class ABCDEThread {

	public static void main(String[] args) {
		AThread a = new AThread("A");
		BThread b = new BThread("B");
		CThread c = new CThread("C");
		DThread d = new DThread("D");
		EThread e = new EThread("E");
		a.b = b;
		b.c = c;
		c.d = d;
		d.e = e;
		e.a = a;
		Thread astart = new Thread() {
			public void run() {
				try {
					a.aBegin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Thread bstart = new Thread() {
			public void run() {
				try {
					b.bBegin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread cstart = new Thread() {
			public void run() {
				try {
					c.cBegin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread dstart = new Thread() {
			public void run() {
				try {
					d.dBegin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread estart = new Thread() {
			public void run() {
				try {
					e.eBegin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		astart.start();
		bstart.start();
		cstart.start();
		dstart.start();
		estart.start();

	}

}

class AThread {
	boolean ATurn = true;
	String info;
	BThread b;

	public AThread(String info) {
		this.info = info;
	}

	public void aBegin() throws Exception {
		while (true) {
			if (ATurn) {
				System.out.print(info);
				ATurn = false;
				synchronized (b) {
					b.notify();
				}
			} else {
				synchronized (this) {
					this.wait();
					this.ATurn = true;
				}
			}
		}
	}
}

class BThread {
	boolean BTurn = false;
	String info;
	CThread c;

	public BThread(String info) {
		this.info = info;
	}

	public void bBegin() throws Exception {
		while (true) {
			if (BTurn) {
				System.out.print(info);
				BTurn = false;
				synchronized (c) {
					c.notify();
				}
			} else {
				synchronized (this) {
					this.wait();
					this.BTurn = true;
				}
			}
		}
	}

}

class CThread {
	boolean CTurn = false;
	String info;
	DThread d;

	public CThread(String info) {
		this.info = info;
	}

	public void cBegin() throws Exception {
		while (true) {
			if (CTurn) {
				System.out.print(info);
				CTurn = false;
				synchronized (d) {
					d.notify();
				}
			} else {
				synchronized (this) {
					this.wait();
					this.CTurn = true;
				}
			}
		}
	}

}

class DThread {
	boolean DTurn = false;
	String info;
	EThread e;

	public DThread(String info) {
		this.info = info;
	}

	public void dBegin() throws Exception {
		while (true) {
			if (DTurn) {
				System.out.print(info);
				DTurn = false;
				synchronized (e) {
					e.notify();
				}
			} else {
				synchronized (this) {
					this.wait();
					this.DTurn = true;
				}
			}
		}
	}

}

class EThread {
	boolean ETurn = false;
	String info;
	AThread a;

	public EThread(String info) {
		this.info = info;
	}

	public void eBegin() throws Exception {
		while (true) {
			if (ETurn) {
				System.out.print(info);
				ETurn = false;
				synchronized (a) {
					a.notify();
				}
			} else {
				synchronized (this) {
					this.wait();
					this.ETurn = true;
				}
			}
		}
	}

}
