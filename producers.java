public class producers extends Thread 
{
   company c ;
     producers(company c){
        this.c =c;
     }        
    public void run()
    { 
        int i=1;
          while (true) {
         this.c.produce_item(i); 
          try {
            Thread.sleep(5000);
          } catch (Exception e) {
            //TODO: handle exception
          }
         i++;   
          }
        }
}
