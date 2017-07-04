//calculating volume and surface area using costructor over loading

public class Box1{

                  public float length,breadth,height,volume,s_area;
                  
                  public Box1(float length, float breadth ,float height)
                  {
                     volume=length*breadth*height;
                     s_area=2*(length*height+breadth*height);
                     System.out.println("Volume : "+volume+ "Surface area :"+s_area);
                  }   
                  
                  
                  public Box1(float length,float height)
                  {
                
                      
                   volume=length*length*height;
                   s_area=4*(length*height);
                   System.out.println("Volume of special box :"+volume+ "Surface area :"+s_area);

                 }
                public Box1(float length)
                {
                  
                  volume=length*length*length; 
                  s_area=4*(length*length); 
                  System.out.println("Volume of cube :"+volume+ "and Surface area :"+s_area);
                }
 
                 public static void main(String args[])
                 {
                   Box1 b1= new Box1(2.0f,1.0f,2.5f);
                   Box1 b2= new Box1(3.2f,2.0f);
                   Box1 b3= new Box1(3.0f); 
                   

                } 
 

          }
