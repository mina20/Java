//wa student with data member roll no name function display

public class Student
	{
		
		String name;
		int roll_number;
                float entrance_score;
		void display()
		{
			System.out.println("\nname of student:"+name+"\nroll number :"+roll_number+"\nEntrance Score:"+entrance_score);
		}
        
                public static void main(String[] str)
              {
		Student stud1=new Student();
                     
                stud1.name="Rio";
                stud1.roll_number=2;
                stud1.entrance_score=75.0f;          
		stud1.display();
	      }
		          
}
