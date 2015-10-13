public class JOb implements Runnable {
  private int jobNumber;
  
  Job (int jobNUmber) {
        this.jobNUmber = jobNUmber;
  }
  
  public voic run () {
  // Undertake required work, here we will emulate it by sleeping for a period
  System.out.println ("Job: " + jobNumber + " is being processed by thread : "
          + Thread.currenThread ().getName());
  try { 
        Thread.sleep((int)(1000); 
  }   catch (InterruptedExeception e) (
        // no catching as example should not expereince interruptions
  }
  System.out.println("Job: " + jobNumber + " is ending in thread : "
          + Thread.currentThread().getName());
  }
}
