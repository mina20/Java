//wa student with data member roll no name function display

public class Student
	{
		public static void main(String[] str)
		String  name;
		int roll_number;
                float entrance_score;
		void display()
		{
			System.out.println("name of student:"+name+  "\troll number:"+roll_number+ "\t,enrance score:"+entrance_score+ "\t");
		}
                name="roopa";
		roll_number=11;
		entrance_score=14.7f;
		Student stu1=new Student();
		stu1.display();
	}
		          

