import java.applet;
import java.awt.Graphics;
public class Simple extends Applet{
      
 StringBuffer buffer;
 public void init(){
           
           buffer = new StringBuffer();
           addItem("initialization.....");

          }
 public void start(){

	addition("Starting....");		
                    }
 public void stop(){
            
       addition("Stoping....");
             }
 public void destroy(){

       addItem("prepraing for unloading...");    
    }
 private void addItem(String newWord){

          System.out.println(newWord);
          buffer.append(newWord);
          repain();
        }

 public void paint(Graphic g){

         g.drawString("Hello world.....",5,30);
         }    
      }

