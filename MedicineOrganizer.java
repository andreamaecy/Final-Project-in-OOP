import java.util.ArrayList;
import java.util.Scanner;

class Medicine {
    private String name;
    private String dosage;
    private String schedule;
    private String type;  
   
    public Medicine(String medicineName, String medicineDosage, String medicineSchedule, String medicineType) {
        name = medicineName;
        dosage = medicineDosage;
        schedule = medicineSchedule;
        type = medicineType;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getType() {
        return type;
    }

    public String displayDetails() {
        return "Name: " + name + "\nDosage: " + dosage + "\nSchedule: " + schedule + "\nType: " + type;
    }
}

public class MedicineOrganizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        ArrayList<Medicine> medicines = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Medicine Organizer ---");
            System.out.println("Welcome, " + userName + "!");
            System.out.println("1. Add a Medicine");
            System.out.println("2. View All Medicines");
            System.out.println("3. Delete a Medicine");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                
                System.out.print("Enter medicine name: ");
                String medicineName = scanner.nextLine();

                System.out.print("Enter dosage (e.g., 500mg): ");
                String medicineDosage = scanner.nextLine();

                System.out.print("Enter schedule (e.g., Morning, Night): ");
                String medicineSchedule = scanner.nextLine();

                System.out.print("Enter medicine type (e.g., Painkiller, Antibiotic): ");
                String medicineType = scanner.nextLine();

                
                Medicine medicine = new Medicine(medicineName, medicineDosage, medicineSchedule, medicineType);
                medicines.add(medicine);

                System.out.println("Medicine added successfully!");

            } else if (choice == 2) {
               
                if (medicines.isEmpty()) {
                    System.out.println("No medicines added yet.");
                } else {
                    System.out.println("\n--- List of Medicines ---");
                    for (int i = 0; i < medicines.size(); i++) {
                        Medicine med = medicines.get(i);
                        System.out.println("\nMedicine #" + (i + 1));
                        System.out.println(med.displayDetails());
                    }
                }

            } else if (choice == 3) {
                
                if (medicines.isEmpty()) {
                    System.out.println("No medicines to delete.");
                } else {
                    System.out.println("\n--- List of Medicines to Delete ---");
                    for (int i = 0; i < medicines.size(); i++) {
                        Medicine med = medicines.get(i);
                        System.out.println((i + 1) + ". " + med.getName());
                    }

                    System.out.print("Enter the number of the medicine you want to delete: ");
                    int deleteChoice = scanner.nextInt();

                    if (deleteChoice > 0 && deleteChoice <= medicines.size()) {
                        medicines.remove(deleteChoice - 1);
                        System.out.println("Medicine deleted successfully!");
                    } else {
                        System.out.println("Invalid number. No medicine was deleted.");
                    }
                }

            } else if (choice == 4) {
              
                System.out.println("Exiting... Stay healthy!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
