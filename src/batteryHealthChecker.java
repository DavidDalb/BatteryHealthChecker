import java.io.BufferedReader;
import java.io.InputStreamReader;

public class batteryHealthChecker {
   public static void main(String[] args) {

       batteryHealthChecker checker = new batteryHealthChecker();
       //call method to check battery status
       checker.checkBatteryHealth();

}      public void checkBatteryHealth() {
       try{//create process that execute WMIC to get battery status information via JVM
           Process process = Runtime.getRuntime().exec("wmic path Win32_Battery get BatteryStatus, Caption, DesignCapacity, DesignVoltage, EstimatedChargeRemaining, EstimatedRunTime, Status, Voltage"
           );

           //create reader that read command output (WMIC command)
           BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

           //If an error occurs print the exception message
    } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
       }
       }
}
