/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackages;

import DataStructures.NoteStackLinkedList;
import factory.personnel.payroll.system.Note;

/**
 *
 * @author melih
 */
public class TestClass {
    public static void main(String[] args){
        System.out.println("Test");
        
        NoteStackLinkedList stack = new NoteStackLinkedList();
        stack.push(new Note(1,"a","1 haziran"));
        stack.push(new Note(2,"b","2 haziran"));
        stack.push(new Note(3,"c","3 haziran"));
        stack.push(new Note(4,"d","4 haziran"));
        
        stack.print();
        
        stack.pop();
        stack.print();
    }
}
