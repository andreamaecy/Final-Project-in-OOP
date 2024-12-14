# Comia_final-project-in-OOP


I. A Brief Project Overview

Welcome to the Medicine Organizer! This Java application is developed to assist users in better managing their medicine. Whether it is about remembering medications for yourself or medications of your friends and relatives, this program lets you add, view, and delete medicine information easily wihtout encountering any problems. Thanks to the user friendly interface provided by The Medicine Organizer that allows you to never forget taking your medicines and helps you to keep track of times when a medicine needs to be taken without missing any.


II. Explanation of How OOP Principles Were Applied

The objective of this project is to utilize the principles of Object-Oriented Programming (OOP) in order to develop a 
structured and effective application:

Encapsulation 

In this console, The Medicine class has four private fields: name, dosage, schedule, and type. These fields are not accessible directly from outside the class.
Public getter methods (getName(), getDosage(), etc.) provide controlled access to these private fields, allowing other classes to retrieve their values without modifying them directly. This encapsulation ensures that the internal state of the Medicine object is protected.

Inheritance

For this, The Prescription class inherits from the Medicine class using the extends keyword. This means it can access all public and protected members of the Medicine class.
The constructor of Prescription uses super() to call the parent class's constructor, demonstrating code reuse.
The displayDetails() method is overridden to include additional information about the prescribing doctor.

Polymorphism

This concept from the code includes, The displayDetails() method in the Prescription class overrides the method from the Medicine class. When called on an instance of Prescription, it provides a unique response that includes additional information about the prescribing doctor.
If there are multiple subclasses (e.g., OverTheCounter, Prescription), each could implement its own version of displayDetails(), showcasing polymorphism by allowing different objects to respond differently to the same method call.

Abstraction

An interface named Medication defines a method take(). Any class that implements this interface must provide an implementation for this method.
The Prescription class implements the Medication interface and provides its own version of the take() method, which specifies how to take that particular medication.
This abstraction allows users to interact with medications without needing to understand their underlying implementations.


III. Details of the Chosen SDG and its Integration Into the Project

This project targets Sustainable Development Goal 3, which is Good Health and Well-being. The project in question, the Medicine Organizer, would more importantly make the individuals’ health care management easier as it enables proper management of medications. The significance of this strategy would be improved and focused to the treatment, reduced hospital visits and improved health in general. The presented application is designed to encourage the users to become active participants in their health care processes by allowing the listing and recording of their medicine intake information.

IV. Instructions for Running the Program

To use the Medicine Organizer program, start by running the application with the command java MedicineOrganizer. The program will prompt you to enter your name, for a more personalized experience. After entering your name, you will see a menu with four options: to add a medicine, view all medicines, delete a medicine, or exit the program. If you choose to add a medicine by selecting option 1, you will be prompted to enter details such as the medicine's name, dosage, schedule, and type. Once you provide this information, the program will confirm that the medicine has been added successfully. If you select option 2, the program will display a list of all medicines you've added, showing their details in a structured format. If you choose option 3, you will see a list of medicines available for deletion; you can enter the corresponding number to delete a specific medicine, and the program will confirm the deletion. Finally, selecting option 4 will exit the program with a friendly message wishing you good health. This simple flow allows users to efficiently manage their medications while keeping track of important thngs.
