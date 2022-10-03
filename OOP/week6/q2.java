import java.util.*;

class Building
{
	double sqf;
	int stories;
	double getsqf()
	{
		return sqf;
	}
	int getstories()
	{
		return stories;
	}
	void setsqf(double s)
	{
		sqf = s;
	}
	void setstories(int sto)
	{
		stories = sto;
	}
}
class House extends Building
{
	int bed;
	int bath;
	int getbed()
	{
		return bed;
	}
	int getbath()
	{
		return bath;
	}
	void setbed(int b)
	{
		bed = b;
	}
	void setbath(int ba)
	{
		bath = ba;
	}
}
class School extends Building
{
	int classrooms;
	String grade;
	int getclassrooms()
	{
		return classrooms;
	}
	String getgrade()
	{
		return grade;
	}
	void setclassrooms(int cr)
	{
		classrooms = cr;
	}
	void setgrade(String g)
	{
		grade = g;
	}
}

class q2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Building b1 = new Building();
		House h1 = new House();
		School s1 = new School();
		System.out.println("Enter square footage of Building: ");
		double sqf1 = sc.nextDouble();
		b1.setsqf(sqf1);
		System.out.printf("Enter stories of Building: ");
		int stories1 = sc.nextInt();
		b1.setstories(stories1);
		System.out.println("Enter number of bedrooms in House: ");
		int bed1 = sc.nextInt();
		h1.setbed(bed1);
		System.out.println("Enter number of baths in House: ");
		int bath1 = sc.nextInt();
		h1.setbath(bath1);
		System.out.println("Enter the number of classrooms in School: ");
		int classrooms1 = sc.nextInt();
		s1.setclassrooms(classrooms1);
		System.out.println("Enter the grade level in School: ");
		String grade1 = sc.next();
		s1.setgrade(grade1);
		System.out.println("\n\nSquare footage of Building: " + b1.getsqf() +
							"\nNumber of stories of Building: " + b1.getstories()+
							"\nNumber of Bedrooms in House: " + h1.getbed()+
							"\nNumber of Bathrooms in House: " + h1.getbath()+
							"\nNumber of Classrooms in School: " + s1.getclassrooms()+
							"\nGrade level of school: " + s1.getgrade());
	}
}