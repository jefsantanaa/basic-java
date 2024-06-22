public class CellPhonePlan {
	public static void main(String[] args) {
		String plan = "M"; // M / T

		switch (plan) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp and Free Instagram");
			}
			case "B": {
				System.out.println("100 minutes of call");
			}
		}
	}
}