package bean;

public class Student {
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int sum;
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param chinese
	 * @param math
	 * @param english
	 */
	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sum = this.chinese + this.english + this.math;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the chinese
	 */
	public int getChinese() {
		return chinese;
	}
	/**
	 * @param chinese the chinese to set
	 */
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	/**
	 * @return the math
	 */
	public int getMath() {
		return math;
	}
	/**
	 * @param math the math to set
	 */
	public void setMath(int math) {
		this.math = math;
	}
	/**
	 * @return the english
	 */
	public int getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(int english) {
		this.english = english;
	}
	/**
	 * @return the sum
	 */
	public int getSum() {
		return sum;
	}
	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", chinese=" + chinese + ", math=" + math + ", english=" + english + ", sum="
				+ sum + "]";
	}
	
	

	

}
