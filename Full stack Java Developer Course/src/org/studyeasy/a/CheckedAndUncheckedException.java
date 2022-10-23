package org.studyeasy.a;

public class CheckedAndUncheckedException {
	public static void main(String[] args) {
             int x = 3/0;
             //this is unchecked exception
             
             Thread a = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						Thread.sleep(3000);
						//have to handle - checked exception
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
            	 
             });
             a.start();
             try {
				a.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  	}
}
