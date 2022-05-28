/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import factory.personnel.payroll.system.Note;

/**
 *
 * @author MELIH AFSAR
 * This class ensures that Not nodes are kept in the stack data structure.
 * 
 */
public class NoteStackLinkedList {
    private Note top;
    private int size;

    public NoteStackLinkedList() {
        top = null;
        size = 0;
    }

    public void push(Note note) {
        Note newNote = note;
        newNote.next = top;
        top = newNote;
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = top.getId();
        top = top.next;
        size--;
        return value;
    }

    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.getId();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void print() {
        Note current = top;
        while (current != null) {
            System.out.println(current.getId() + " " + current.getNote()+ ""+ current.getDate());
            current = current.next;
        }
        System.out.println();
    }
}
