package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane=new Plane(10);
		plane.onboard("Shri");
		plane.onboard("Pavithra");
		plane.onboard("Nive");
		
		System.out.println("Plane took off at: " + plane.takeOff());
		
		System.out.println("People on the plane: " + plane.getPassengers());
		Thread.sleep(5000);
		
		plane.land();
        
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
	}


}