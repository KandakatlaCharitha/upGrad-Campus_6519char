import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

/* Program:1-Create a Vehicle class with a method displayInfo(). Create two subclasses, Car and Motorcycle, that override this method. 
Additionally, overload the displayInfo() method in the Vehicle class to demonstrate method overloading.*/
class Vehicle {
    // Method overloading in the Vehicle class
    public void displayInfo() {
        System.out.println("Generic information about a vehicle");
    }

    // Overloaded method with different parameters
    public void displayInfo(String modelName) {
        System.out.println("Information about a vehicle model: " + modelName);
    }
}
class Car extends Vehicle {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Information - Brand: " + brand);
    }
}

class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String type) {
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Information - Type: " + type);
    }
}


/*Program:2-implement a Java program that rotates an array in the clockwise direction for a specified number of times 'n'. 
The program should take user input for the array length, array elements, and the number of clockwise rotations.*/
class RotateArrayClockwiseNTimes {

    // Function to rotate the array in clockwise direction
    public  void rotateClockwise(int[] arr, int rotations) {
        int n = arr.length;
        rotations = rotations % n; // Handling cases where rotations > array length

        for (int i = 0; i < rotations; i++) {
            int temp = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = temp;
        }
    }

    // Function to print an array
    public  void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


/*Program:3-Implement a Java program named UniqueElementsFinder that takes a list of integers as input 
and returns a new list containing only the unique elements. */

class UniqueElementsFinder {

    // Method to find unique elements in the list
    public static List<Integer> findUniqueElements(List<Integer> inputList) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer num : inputList) {
            // Check if the number is not present in the uniqueList
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        return uniqueList;
    }
}


/*Program:4-Implement a  Java program that takes user input to populate an ArrayList
and  returns the sum of the maximum and minimum values in the list:  */
class ArrayListMinMaxSum {
    public  int calculateMinMaxSum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : list) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        return max + min;
    }
}


//Program:5-write a code to insert an element into linked list
// Node class representing a node in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class representing the linked list
class LinkedList {
    Node head;

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/*Program:6-Java program that uses an iterator to iterate over a list of numbers and calculate their sum: */
class IteratorSumExample {
    public  int calculateSum(List<Integer> numbers) {
        // Get an Iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate over the list using the Iterator and calculate the sum
        int sum = 0;
        while (iterator.hasNext()) {
            int number = iterator.next();
            sum += number;
        }

        return sum;
    }
}


public class PolymorphismArraysAndLinkedLists{
    public static void main(String[] args) {
        //--------Program:1---------
        Vehicle genericVehicle = new Vehicle();
        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Sport Bike");

        // Method overloading in Vehicle class
        genericVehicle.displayInfo();
        genericVehicle.displayInfo("Generic Model");

        // Method overriding in subclasses
        car.displayInfo();
        motorcycle.displayInfo();

        //--------Program:2---------
        Scanner scanner = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        // Input array elements
        int[] array = new int[length];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // Input number of rotations
        System.out.print("Enter the number of clockwise rotations: ");
        int rotations = scanner.nextInt();
        RotateArrayClockwiseNTimes rotateArray=new RotateArrayClockwiseNTimes();
        System.out.println("\nOriginal Array:");
        rotateArray.printArray(array);

        // Rotate the array in clockwise direction 'rotations' number of times
        rotateArray.rotateClockwise(array, rotations);

        System.out.println("Array after " + rotations + " rotations in clockwise direction:");
        rotateArray.printArray(array);


        //--------Program:3---------
        UniqueElementsFinder unique=new UniqueElementsFinder();
        System.out.print("Enter the list of integers separated by spaces: ");
        List<Integer> inputList = new ArrayList<>();
         // Take user input elements until the user enters a non-integer value
        System.out.println("Enter integers to add to the ArrayList (enter a non-integer to finish):");
        while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            inputList.add(userInput);
        }

        System.out.println("Original List: " + inputList);

        List<Integer> uniqueElements = unique.findUniqueElements(inputList);

        System.out.println("Unique Elements: " + uniqueElements);

        //--------Program:4---------
        ArrayListMinMaxSum minmaxsum=new ArrayListMinMaxSum();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(24);
        numberList.add(100);
        numberList.add(14);
        numberList.add(52);
        numberList.add(32);
        numberList.add(1);
        // Calculate and display the sum of max and min
        int sum = minmaxsum.calculateMinMaxSum(numberList);
        System.out.println("Sum of Max and Min: " + sum);

        //--------Program:5---------
        // Creating a linked list
        LinkedList linkedList = new LinkedList();

        // Inserting elements into the linked list
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        // Displaying the linked list
        System.out.println("Linked List: ");
        linkedList.display();


         //--------Program:6---------
        // Create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        // Use Iterator to iterate over the list and calculate the sum
        IteratorSumExample iteratorsum=new IteratorSumExample();
        int sum1 = iteratorsum.calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum1);

    }
}

