package practiceClasses;

public class javaDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte: 1 byte of data===> -128 to 127
		byte nbrByte = 127;
		// short: 2 bytes of data===>-32,768 to 32,767
		short nbrShort = 32767;
		// int: 4 bytes of data type ===> -2, 147, 483, 648 to 2, 147, 483, 647
		int nbrInt = 2147483647;
		// long: 8 bytes of data===> -9, 223,372,036,854,775,808 to
		// 9,223,372,036,854,775,807
		long nbrLong = 9223372036854775807L;
		// double: 8 bytes of data===> Stores fractional numbers. Sufficient for storing
		// 15 decimal digits
		// float: 4 bytes of data===> Stores fractional numbers. Sufficient for storing
		// 6 to 7 decimal digits
		float nbrFloat = 3.9f;
		// char: 2 bytes of data= 'a', 'A', '6' or acci value
		char nbrChar = 'A';
		// boolean: 1 byte of data = it can always equal to true or false

		// Ahmad is working in a company and his annual salary is $9500
		// I want pay his salary on bi-weekly bases
		// a year is 52 weeks, bi-weekly mean every two weeks that is 26
		double annualSalaryDouble = 9500.00;
		double biWeeklyPaycheckDouble = annualSalaryDouble / 26;
		System.out.println(biWeeklyPaycheckDouble);
		// 365.38461538461536
		float annualSalaryFloat = 9500.00f;
		float biWeeklyPaycheckFloat = annualSalaryFloat / 26;
		System.out.println(biWeeklyPaycheckFloat);
		// 365.3846

		// John salary is 96000.52
		// calculate his weekly salary

		double johnSalaryDouble = 96000.52;
		double weeklySalaryDouble = johnSalaryDouble / 52;
		System.out.println(weeklySalaryDouble);
		// 1846.1638461538462
		float johnSalaryFloat = 96000.52f;
		float weeklySalaryFloat = johnSalaryFloat / 52;
		System.out.println(weeklySalaryFloat);
		// 1846.164

		double john_Salary_Double = 9600.52;
		System.out.println(john_Salary_Double / 52);
		// 184.62538461538463

		float john_Salary_Float = 9600.52f;
		System.out.println(john_Salary_Float / 52);
		// 184.62538

		boolean blnBoolean = true;
		System.out.println(blnBoolean);

		boolean isJavaFun = true;

			if (isJavaFun) {
				System.out.println("Yes, java is fun");
			} else {
				System.out.println("No, java is not fun");
			}

			//If you have "!" before anything it means not, or it will means
			//the reverse of anything that you have after the "!" sign 
			if (!isJavaFun) {
				System.out.println("I don't know");
		}else {
			System.out.println("No, java is not fun");	
			
		}
	}

}
