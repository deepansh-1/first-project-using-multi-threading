class company{
    int n;
    boolean f = false;
    // f == false  chance : producer
    // f == true chance : consumer
  synchronized  public void produce_item(int n )
  {
       if(f){
        try {
            wait();
        } catch (Exception e) {
            //TODO: handle exception
        }
       }   


       this.n = n;
       System.out.println("produce :" + this.n);
      f= true;
      notify();
    }
  synchronized public int consume_item()
  {
    if(!f){
        try {
            wait();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    System.out.println("Consume :"+this.n);
     f = false;
     notify();
     return this.n;
  }



}