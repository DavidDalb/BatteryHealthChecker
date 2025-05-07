package com.example.batteryHealthChecker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class batteryHealthChecker {
    public static void main(String[] args) {

        batteryHealthChecker checker = new batteryHealthChecker();

        /*call method to check battery health status with these information:
         * Battery status, design capacity,full charge capacity,designVoltage,
         * estimated charge remaining,estimated run time,status
         */
        checker.checkBatteryHealth();



    }      public void checkBatteryHealth() {
        try {//create process that execute WMIC to get battery status information via JVM
            Process process = Runtime.getRuntime().exec("wmic path Win32_Battery get BatteryStatus,DesignCapacity,FullChargeCapacity,DesignVoltage,EstimatedChargeRemaining,EstimatedRunTime,Status"
            );

            //create reader that read command output (WMIC command)
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            System.out.println("=== WMIC Battery health information ===");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //exit code - to get feedback if the command has been executed
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("WMIC Command is successfully executed");
            }else {System.out.println("Error in the command execution ");
            }
            //If an error occurs print the exception message
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}

