import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  String name;
  String serialNumber;
  int value;

  public String toString(){
    return name + "," + serialNumber + "," + value;
  }

  public Inventory(String name, String serialNumber, int value) {
    this.name = name;
    this.serialNumber = serialNumber;
    this.value = value;
  }

  class Main {
    public void main(String[] args) {
    String name;
    String serialNumber;
    int value;
    String choice;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Inventory> list = new ArrayList<Inventory>();
   do{ 
    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");
    choice = scanner.nextLine();
    switch(choice) {
      case "1":
      System.out.println("Enter the name:");
      name = scanner.nextLine();
      System.out.println("Enter the serial number:");
      serialNumber = scanner.nextLine();
      System.out.println("Enter the value in dollars (whole number):");
      value = scanner.nextInt();
      scanner.nextLine();
      list.add(new Inventory(name, serialNumber, value));
      break;

      case "2":
      System.out.println("Enter the serial number of the item to delete:");
      String p = scanner.nextLine();
        for (int i = 0; i < list.size(); i++){
          if (list.get(i).serialNumber.equals(p)) {
            list.remove(i);
          }
        }
      break;

      case "3":
      System.out.println("Enter the serial number of the item to change:");
      String l = scanner.nextLine();
        for (int i = 0; i < list.size(); i++){
          if (list.get(i).serialNumber.equals(l)){
            System.out.println("Enter the new name:");
            String newName = scanner.nextLine();
            list.get(i).name = newName;
            System.out.println("Enter the new value in dollars (whole number):");
            int newValue = scanner.nextInt();
            list.get(i).value = newValue;
          }
        }
            break;   
          
      case "4":
      for (int i = 0; i < list.size(); i++){
        System.out.println(list.get(i));
      }
        break;
          }
          }while(!choice.equals("5"));
    }
     }
  }
      
      
    

    

	
