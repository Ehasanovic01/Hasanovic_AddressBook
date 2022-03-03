package address.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class addressBook {
    /**
     * stores data of entries in ab
     **/
    private TreeMap<String, addressEntry> addressEntryList = new TreeMap<String, addressEntry>();

    public void add(addressEntry newEntry) {
        /**
         * Adds a entry into ab
         * @param newEntry add to list
         */
        addressEntryList.put(newEntry.getLastName(), newEntry);
    }

    public void remove(String delName) {
        /**
         * Removes entry
         * @param delName to be removded from the list
         **/
        // Check if the list is empty
        if (addressEntryList.isEmpty()) {
            System.out.println("Address book is currently empty.\n");
        } else {
            // Create flag to return to menu
            boolean removeEntry = true;

            while (removeEntry) {
                addressEntryList.remove(delName);
                removeEntry = false;
            }
        }
    }

    public static void readFromFile(String fileName, addressBook ab) throws IOException {
        /**
         * Reads a file into the address book
         * @param fileName file name
         * @param ab addressbook instance
         * @throws IOException for file not found
         **/
        // Create a file reader
        FileReader file_input = new FileReader(fileName);
        // Create a buffered reader
        BufferedReader br = new BufferedReader(file_input);

        //read through buffer reader
        while (br.ready()) {
            // Create a new instance and add to it
            addressEntry EntryFile = new addressEntry(br.readLine(), br.readLine(), br.readLine(),
                    br.readLine(), br.readLine(), Integer.parseInt(br.readLine()), br.readLine(), br.readLine());
            // Add addressEntry
            ab.add(EntryFile);
        }

        // Close BufferedReader
        br.close();
        // Close FileReader
        file_input.close();
        // Display file read successfully
        System.out.println("File read successfully!\n");
    }

    public void list() {
        /**
         * displays list of entries
         **/
        // Check if empty
        if (addressEntryList.isEmpty()) {
            System.out.println("Address book is currently empty.\n");
        }
        // Otherwise display list
        else {
            int i = 1;
            for (Map.Entry<String, addressEntry> Entry : addressEntryList.entrySet()) {
                System.out.print(i + ". \n");
                System.out.println(Entry.getValue());
                i++;
            }
        }
    }


    public void find(String n) {
        /**
         * Finds entry by searching name
         * @param n entry to be found by name
         **/
        // Check if empty
        if (addressEntryList.isEmpty()) {
            System.out.println("Address book is currently empty.\n");
        } else {
            // Iterate through the list
            if (addressEntryList.get(n) == null) {
                System.out.print("No input found\n");
            } else {
                System.out.println("Here are the entries found that match the name:" + n + "\n ");
                System.out.println(addressEntryList.get(n));
            }
        }
    }
}



