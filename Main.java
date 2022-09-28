package com.simplilearn.lockedmeapp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n***************************Lockers Pvt. Ltd.*******************************\n"+
		"********************************Welcome************************************\n"+
		"***********************************to**************************************\n"+
		"******************************LockedMe.com*********************************\n\n"+
		"----------------------Application Name: LOCKEDME.COM-----------------------\n\n" +
        "****************-------------Developer Details-------------****************\n\n" +
        "Name: DIVYANSHI RASTOGI \n" +
        "Designation: FULL STACK JAVA Developer\n" +
        "Date: 09-27-2022\n\n");
		boolean found;
		System.err.println("**********************************************\n"
				  +"                   MAIN MENU                  \n"
				  +"**********************************************");
		while(true) {
		Scanner s = new Scanner(System.in);

    		
		System.out.println("Enter 1 : Retrieving the file names in Ascending order\n" +
                "Enter 2:  Business Level Operations\n" +
                "Enter 3: Close the Application\n");
		
        System.out.println("Enter an option: ");
        int option = s.nextInt();

        if (option == 1) {

        	File f = new File("/Users/drastogi/lockedme");  
        	ArrayList<String> filenames = new ArrayList<String>(Arrays.asList(f.list()));
        	
        	Collections.sort(filenames);
        	if(filenames.size() == 0) {
        		System.err.println("No files present in the current folder");
        	}
        	else {
        		System.err.println("Files present in current folder");
        		for(String filename:filenames)
        		{  
        			System.out.println(filename);  
        		}  
        		}
        }

        	else if (option == 2) {
        		System.err.println("**********************************************\n"+"Please choose any one business level operation\n"+"**********************************************");
        		System.out.println(
            		"Enter 1 : Add a file\n" +
                    "Enter 2:  Delete a file\n" +
                    "Enter 3:  Search a file\n" +
                    "Enter 4:  Return to the main context");
            		int input = s.nextInt();
            	switch (input) {
            		case 1:
            			 try {  
            				    System.out.print("Enter name for your file : ");
            				    Scanner scanner1 = new Scanner(System.in);
            				    String name = scanner1.nextLine();
            				 	File file = new File("/Users/drastogi/lockedme/"+name);  
            		            if (file.createNewFile()) {  
            		                System.out.println("New File "+name+" is created!");  
            		            } else {  
            		                System.out.println(name+ " file already exists.");  
            		            }  
            		        } catch (IOException e) {  
            		            e.printStackTrace();  
            		        } 
            			 break;
            		case 2:
            			found=false;
            			System.out.print("Delete file : ");
            			Scanner scanner2 = new Scanner(System.in);
            			String name = scanner2.nextLine();
            			File filetodelete = new File("/Users/drastogi/lockedme/"+name);
            			File f = new File("/Users/drastogi/lockedme");
            			ArrayList<String> namesFILE = new ArrayList<String>(Arrays.asList(f.list()));
            			Iterator i = namesFILE.iterator();
            			while(i.hasNext()) {
            				String filenameinarray = (String) i.next();
            				if(name.equals(filenameinarray)) {
            					found=true;
            				}
            			}
            			if(!found) {
            				System.err.println("File not found");
            			}
            			else {
            				filetodelete.delete();
            				System.err.println("Successfully Deleted!");
            			}
	
            			break;
            			
            		case 3:
            			found=false;
            			System.out.println("Search file : ");
            			Scanner scanner3 = new Scanner(System.in);
            			String searchname = scanner3.nextLine();
            			File filetosearch = new File("/Users/drastogi/lockedme/"+searchname);
            			File f1 = new File("/Users/drastogi/lockedme");
            			ArrayList<String> namesFILESearch = new ArrayList<String>(Arrays.asList(f1.list()));
            			Iterator<String> i3 = namesFILESearch.iterator();
            			while(i3.hasNext()) {
            				String filenameinarray = i3.next();
            				if(searchname.equals(filenameinarray)) {
            					found=true;
            				}
            			}
            			if(!found) {
            				System.err.println("File not found");
            			}
            			else {
            				filetosearch.exists();
            				System.out.println("File Found!");
            			}
	
            			break;
            		case 4:
            			System.err.println("**********************************************\n"
      						  +"                   MAIN MENU                  \n"
      						  +"**********************************************");
            			
            			break;
            		default:
            			System.out.println("Please enter a valid choice");
            			break;
            		}
        		}
            	else if(option == 3) {
        			System.err.println("Application closed Successfully!");

            			System.exit(0);

                }

            	else {
            		System.out.println("Please enter a valid choice");
            	}
		}

	}

}
