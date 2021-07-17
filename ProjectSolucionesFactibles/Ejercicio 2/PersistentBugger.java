package SolucionesFactibles.ProjectSolucionesFactibles;

public class PersistentBugger {
	public static void main(String[] args) {
		System.out.printf("persistence(39) == ");
		System.out.println(PersistentBugger.persistent(39));
		System.out.printf("persistence(999) == ");
		System.out.println(PersistentBugger.persistent(999));
		System.out.printf("persistence(4) == ");
		System.out.println(PersistentBugger.persistent(4));
	}

	public static int persistent(long n) {
		long multi = 1, ans = 0;
		while (n >= 10) {
			while (n > 0) {
				multi = multi * (n % 10);
				n = n / 10;
			}
			if (multi >= 10)
				n = multi;
			multi = 1;
			ans++;
		}
		return (int) ans;
	}
}
