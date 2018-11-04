import javax.swing.JOptionPane;

public class DayMonth {
	public DayMonth() {
		String str = JOptionPane.showInputDialog("What is the number of the month");
		month = Integer.parseInt(str);
	}

	public void getMonth() {
		System.out.println("The month number was: " + month);
		if (month > 0 && month <= 12) {
			switch (month) {
			case 1:
				System.out.println("There are 31 days");
				break;
			case 2:
				System.out.println("There are 28 days");
				break;
			case 3:
				System.out.println("There are 31 days");
				break;
			case 4:
				System.out.println("There are 30 days");
				break;
			case 5:
				System.out.println("There are 31 days");
				break;
			case 6:
				System.out.println("There are 30 days");
				break;
			case 7:
				System.out.println("There are 31 days");
				break;
			case 8:
				System.out.println("There are 31 days");
				break;
			case 9:
				System.out.println("There are 30 days");
				break;
			case 10:
				System.out.println("There are 31 days");
				break;
			case 11:
				System.out.println("There are 30 days");
				break;
			case 12:
				System.out.println("There are 31 days");
				break;
			}
		} else {
			System.out.println("Invalid Imput");
		}
	}

	private int month;
}