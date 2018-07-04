/*
 This class contains the hash table and its respective methods
 */
import java.util.*;

public class MyHashTable {

    private ArrayList< EmployeeInfo>[] buckets;

    public ArrayList<EmployeeInfo>[] getBuckets() {
        return buckets;
    }

    public void setBuckets(ArrayList<EmployeeInfo>[] buckets) {
        this.buckets = buckets;
    }

    // CONSTRUCTOR
    public MyHashTable(int howManyBuckets) {
        // Instantiate an array to have an ArrayList as each element of the array
        buckets = new ArrayList[howManyBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++) {
            buckets[i] = new ArrayList(); // Instantiate the ArrayList for bucket i
        }
    }

    public int calcBucket(int keyValue) {
        // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table
        return (keyValue % buckets.length);
    }

    public boolean addEmployee(EmployeeInfo theEmployee) {
        int targetBucket = calcBucket(theEmployee.getEmpNumber());
        return (buckets[targetBucket].add(theEmployee));
    }

    public int searchEmployee(int employeeNum) //This method is used to search for an employee
    {
        int ans = calcBucket(employeeNum);
        for (int i = 0; i < buckets[ans].size(); i++) {
            if (employeeNum == buckets[ans].get(i).getEmpNumber()) {
                //returns the bucket the employee is in
                return i;
            }
        }
        return (-1);
    }

    public EmployeeInfo removeEmployee(int employeeNum) {
        int ans = searchEmployee(employeeNum);
        if (ans >= 0) {
            //The employee is in the table at position ans in the ArrayList for that bucket
            int theBucket = calcBucket(employeeNum);
            EmployeeInfo removedEmp = buckets[theBucket].remove(ans);

            return removedEmp;

        } else {
            return null; // Employee is not in the table
        }
    }

    public void displayContents() {
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.println("\nbucket " + i + " position " + j
                        + " is employee " + buckets[i].get(j).getFirstName() + " with ID " + buckets[i].get(j).getEmpNumber());
            }
        }
        // Print the employee numbers for the employees stored in each bucket's ArrayList,
        // starting with bucket 0, then bucket 1, and so on
    }
}
