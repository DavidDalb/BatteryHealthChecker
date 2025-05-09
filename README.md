Battery Health Checker


Battery Health Checker is a Java application that allows you to check the battery status of a Windows computer using the wmic command. The program provides detailed information about the battery, such as:

Battery status

Design capacity

Full charge capacity

Design voltage

Estimated charge remaining

Estimated runtime

Battery status
-----------------------------------------------------------------------------
Features
Retrieves real-time battery information using the Windows wmic command.

Displays battery details directly in the command prompt.

No need to compile the code as the executable JAR file is already provided.

Run the program simply with the java -jar command from the terminal (command prompt).
-----------------------------------------------------------------------------

Usage Instructions
*THE JAR FILE IS LOCATED IN DIST/  

1. Download the Repository
Clone or download the repository to your computer.

2. Run the JAR File
Once you have the BatteryHealthChecker.jar file, you can run the program directly from the terminal (Command Prompt).

Open the Command Prompt (CMD) or PowerShell.

Navigate to the folder where you saved the JAR file. Use the cd command to change the directory:

cd C:\path\to\your\repository
Run the following command to start the application:


java -jar BatteryHealthChecker.jar
The program will display the battery information directly in the terminal.
-----------------------------------------------------------------------------

Issue with Missing Information
Some laptops may not display all the information such as Design Capacity or Full Charge Capacity. This occurs because the wmic command only retrieves data that is available through the operating system and the laptop's hardware specifications. If the manufacturer does not provide this data or if it is not accessible via wmic, the values may not be shown.
-----------------------------------------------------------------------------

Technologies Used
Java: The programming language used to develop the application.

WMIC: Used to retrieve battery status information in Windows.
-----------------------------------------------------------------------------

Contributions
If you'd like to contribute to this project, feel free to open a pull request with improvements, fixes, or new features. You might want to add, for example, a GUI, advanced error handling, or integration with other platforms.
-----------------------------------------------------------------------------

License
This project is distributed under the MIT License. See the LICENSE file for more details.