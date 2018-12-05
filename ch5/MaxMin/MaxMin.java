
public class MaxMin {

	private int count = 0;
	private String[] str = new String[4];

	private String maxstr;
	private String minstr;

	public MaxMin() {
		maxstr = null;
		minstr = null;
	}

	public void addString(String pStr) {
		if (count > 3) {
			count = 0;
			maxstr = null;
			minstr = null;
		}
		if (minstr == null) {
			minstr = pStr;
		} else if (minstr.compareTo(pStr) > 0) {
			minstr = pStr;
		} // end if minstr

		if (maxstr == null) {
			maxstr = pStr;
		} else if (maxstr.compareTo(pStr) < 0) {
			maxstr = pStr;
		}

		str[count] = pStr;
		count++;
	}

	public String getMaxString() {
return maxstr;
	}

	public String getMinString() {
return minstr;
	}

}
