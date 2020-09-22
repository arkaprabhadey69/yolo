public class Employee2{
	
public static void main(String[] args) {
	
	int IS_FULL_TIME=1;
	int EMP_RATE_HR=20;

	int employeewage=0;
	int employeehrs=0;

	double empcheck= Math.floor(Math.random()*10)%2;

	if(empcheck==IS_FULL_TIME)
	{
		employeehrs=8;
	}
	/*else
	{
		employeehrs=0;
	}*/
	employeewage=EMP_RATE_HR*employeehrs;

	System.out.println("Emp wage is: "+employeewage);
}

}
