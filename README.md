# FoodBridge – Food Management & Donation System

## Project Title

FoodBridge – Food Management & Donation System
  “Where Extra Food Finds a Purpose.”


## Overview of the Project
FoodBridge is a Java-based food management and donation system developed to help reduce food wastage by managing surplus food and connecting it with NGOs that can distribute it to people in need.
The system allows users to add surplus food details, view and search available food, maintain an NGO directory, and donate surplus food to a selected NGO. Once a food item is donated, its status is updated from Available to Donated. The project also provides an impact dashboard to display basic statistics about food and NGO records.



## Features

- Add Surplus Food: Add food name, quantity, unit, food type, and expiry date.
- Explore Food: View available and donated food records.
- Search Food: Search for a particular food item.
- Donate Food: Select available food and donate it to a registered NGO.
- Donation History: View previously donated food.
- NGO Directory: View details of registered NGOs and the food they accept.
- Add NGO: Add new NGOs to the system.
- Impact Dashboard: Display total food items, available food, donated food, and registered NGOs.



## Technologies / Tools Used

- Java: Used as the primary programming language for implementing the project logic.
- Java ArrayList: Used for temporarily storing and managing food and NGO records.
- VS Code: Used as the development environment.
- JDK: Required to compile and run the Java program.

Note: The current version does not use a database. Food and NGO records are managed using Java ArrayList.


---

## Steps to Install & Run the Project

- Step 1: Install Java

Install the Java Development Kit (JDK) on your system and make sure Java is properly configured.

Check Java installation:

java -version

Check whether the Java compiler is available:

javac -version

- Step 2: Open the Project

Open the FoodBridge project folder in VS Code.

The project structure is:

FoodBridge
└── src
    ├── Main.java
    ├── Food.java
    ├── FoodManager.java
    ├── NGO.java
    └── NGOManager.java

- Step 3: Compile the Project

Open the terminal inside the src folder and compile all Java files:

javac *.java

- Step 4: Run the Project

After successful compilation, run:

java Main

The FoodBridge welcome screen will appear.



## Instructions for Testing

Follow these steps to test the main functionality of the project:

- Test 1 – Add Food
1. Select Add Surplus Food.
2. Enter the food details.
3. Confirm that the food is added successfully.
4. Open Explore Food and verify that the food appears with Available status.


- Test 2 – View and Search Food
1. Open Explore Food.
2. Verify that the added food records are displayed.
3. Open Search Food.
4. Enter the name of an existing food item.
5. Verify that the corresponding food record is displayed.


- Test 3 – NGO Directory
1. Open Find an NGO.
2. Verify that the pre-added NGOs are displayed.
3. Check their location and food acceptance details.



- Test 4 – Donate Food
1. Open Donate Food.
2. Select an available food item.
3. Select an NGO.
4. Confirm the donation.
5. Verify that the food status changes from Available to Donated.



- Test 5 – Add NGO
1. Open Add NGO.
2. Enter the NGO details.
3. Confirm that the NGO is added successfully.
4. Open the NGO Directory and verify the newly added NGO.



- Test 6 – Impact Dashboard
1. Open the Impact Dashboard.
2. Verify the total number of food items.
3. Check the number of available and donated items.
4. Verify the number of registered NGOs.




