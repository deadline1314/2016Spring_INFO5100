package Assignment6;

/**
 * 2. Create two threads, one prints out number 1 to 52, another prints out A to
 * Z. The result shows on the screen should be: ¡°12A34B56C78D¡­¡±
 */
public class NumCharThread {

	public static void main(String[] args) {
		NumThread num = new NumThread();
		CharThread ch = new CharThread();
		num.ch = ch;
		ch.num = num;

		Thread n = new Thread() {
			public void run() {
				try {
					num.numPrint();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Thread c = new Thread() {
			public void run() {
				try {
					ch.charPrint();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		n.start();
		c.start();
	}

}

class NumThread {
	CharThread ch;

	public void numPrint() throws Exception {
		for (int i = 1; i <= 52; i += 2) {
			System.out.print(i + "" + (i + 1));
			synchronized (ch) {
				ch.notify();
			}
			synchronized (this) {
				this.wait();
			}
		}
	}
}

class CharThread {
	NumThread num;

	public void charPrint() throws Exception {
		for (char c = 'A'; c <= 'Z'; c++) {
			synchronized (this) {
				this.wait();
			}
			System.out.print(c);
			synchronized (num) {
				num.notify();
			}
		}
	}
}
