 //calculate volume and surface using function over loading 


  public class Box{

                  public float length,breadth,height,volume,s_area;
                  
                  
                  
                  float cal_volume(float a,float b,float c)
                  {
                     length=a;
                     breadth=b;
                     height=c;
                     volume=length*breadth*height;
                     s_area=2*(length*height+breadth*height);
                     System.out.println("Volume : "+volume+" and surface area :"+s_area );
                     return 0.0f;
                   }
                  float cal_volume(float l,float h)
                  {
                    length=l;
                    height=h;
                    breadth=l;  
                    volume=l*l*h;
                    s_area=4*(l*h);
                    System.out.println("Volume of special box :"+volume+ " and surface area is :"+s_area);
                    return 0.0f; 
                 }
                float cal_volume(float len)
                {
                  length=len;
                  volume=len*len*len;
                  s_area=4*(len*len); 
                  System.out.println("Volume of cube :"+volume+ " and surface area :"+s_area);
                  return 0.0f;
                }
 
                 public static void main(String args[])
                 {
                   Box B1= new Box();
                   B1.cal_volume(2.3f,2.0f,3.2f);
                   B1.cal_volume(1.2f,3.2f);
                   B1.cal_volume(3.0f); 

                } 
 

          }
