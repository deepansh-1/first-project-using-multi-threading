
public class consumer extends Thread {
 
    company c ;
    consumer(company c){
     this.c = c;
    }
    public void run()
{
      while (true) {
         this.c.consume_item();
         try {
            Thread.sleep(4000);
         } catch (Exception e) {
            //TODO: handle exception
         }
      }
       
}

    
}
