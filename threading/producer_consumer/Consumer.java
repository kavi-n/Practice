package producer_consumer;

import java.util.List;

class Consumer implements Runnable
{
   private final List<Integer> taskQueue;
 
   public Consumer(List<Integer> sharedQueue)
   {
      this.taskQueue = sharedQueue;
   }
 
   public void run()
   {
      while (true)
      {
         try
         {
            consume();
         } catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
 
   private void consume() throws InterruptedException
   {
      synchronized (taskQueue)
      {
         while (taskQueue.isEmpty())
         {
            System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
            taskQueue.wait();
         }
         Thread.sleep(10);
         int i = (Integer) taskQueue.remove(0);
         System.out.println("Consumed: " + i);
         taskQueue.notifyAll();
      }
   }
}
