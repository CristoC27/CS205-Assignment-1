package edu.monmouth.vehicle;

public class Motorcycle implements Vehicle {
	private PowerTypes powerSource;
	private int maxSpeed;
	
	public Motorcycle(PowerTypes powerSource, int maxSpeed) {
		setPowerSource(powerSource);
		setMaxSpeed(maxSpeed);
	}
	public void go() {
		System.out.println("Accelerator handle twisted");
	}
	public void stop() {
		System.out.println("Brakes applied");
	}
	public PowerTypes getPowerSource() {
		return powerSource;
	}
	public void setPowerSource(PowerTypes powerSource) {
		this.powerSource = powerSource;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public PowerTypes powerBy(){
		return getPowerSource();
	}
	@Override
	public String toString() {
		return "Max speed: "+ getMaxSpeed() + "| Power source: "+ powerBy();
	}
}
