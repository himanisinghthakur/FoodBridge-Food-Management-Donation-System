# FoodBridge – Food Management & Donation System

## About the Project
FoodBridge is a Java-based food management and donation system designed to reduce food wastage by connecting surplus food with NGOs that can distribute it to people in need.
The system allows users to add surplus food, view available food, select an NGO for donation, maintain an NGO directory, and track the overall donation impact.
     “Where Extra Food Finds a Purpose.”



## Features

- Add Surplus Food – Add food name, quantity, unit, type, and expiry date.
- Explore Food – View available and donated food records.
- Search Food – Search for food using its name or type.
- Donate Food – Select available food and donate it to a registered NGO.
- Donation History – View previously donated food.
- NGO Directory – View NGOs and the types of food they accept.
- Add NGO – Add new NGOs to the directory.
- Impact Dashboard – View total food items, available food, donated food, and registered NGOs.


## Technologies Used

- Java – Main programming language
- HTML/CSS – Planned web interface
- Java Collections – ArrayList for managing food and NGO records
- VS Code – Development environment


## File Description

- Main.java: This is the main file of the FoodBridge project. It contains the main program, menu system, and user interaction. It connects all the features such as adding food, viewing and searching food, donating food, managing NGOs, and displaying the impact dashboard.
- Food.java: This file defines the Food class and stores information about each food item, including its name, quantity, unit, food type, expiry date, donation status, and the NGO to which it is donated.
- FoodManager.java: This file is responsible for managing food records. It uses an ArrayList to store food items and provides methods for adding, displaying, searching, and tracking available and donated food.
- NGO.java: This file defines the NGO class and stores details about NGOs, including their name, location, contact information, and the types of food they accept.
- NGOManager.java: This file manages the NGO directory. It stores NGO records using an ArrayList, provides some pre-added NGOs, and allows users to view existing NGOs and add new NGOs to the system.


## How It Works

1. The program starts with the FoodBridge welcome screen.
2. The user can add surplus food.
3. Added food is initially marked as Available.
4. The user can explore available food.
5. The user selects food and an NGO for donation.
6. After confirmation, the food status changes to Donated.
7. The impact dashboard displays the current food and NGO statistics.


## Pre-Added NGOs

- The system initially contains sample NGO records such as:
- Robin Hood Army
- Feeding India
- Akshaya Patra Foundation
- Annamrita Foundation
#### Users can also add additional NGOs through the Add NGO option.

## Future Scope

- The project can be extended with:
- Web-based interface using Java backend
- Database integration
- User authentication
- NGO verification
- Food pickup and delivery tracking
- Email/SMS notifications
- Food expiry reminders
- Admin dashboard


## Purpose

FoodBridge aims to demonstrate how a simple software system can help organize surplus food and make the donation process easier, while promoting the idea of reducing food waste and sharing usable food with those who need it.


##### Project: FoodBridge – Food Management & Donation System
##### Course: Introduction to Java Programming
Language: Java

