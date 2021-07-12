package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TemperatureSensor extends Remote {
	
	public int getTemperature() throws RemoteException;

	//return current temperature based on that day
	public int getTemperatureBasedOnDay(String day) throws RemoteException;
	
	//calculate average temperature for ayer keroh
	public float getAvgTemperature() throws RemoteException;
}