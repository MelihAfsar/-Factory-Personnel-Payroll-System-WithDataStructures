/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;
import factory.personnel.payroll.system.Note;

/**
 * @author MELIH AFSAR
 * This class allows Not nodes to be kept in the queue data structure.
 */
public class NoteQueueLinkedList {
    Note front, rear;
    public NoteQueueLinkedList()
    {
        this.front = this.rear = null;
    }
    // Method to add an key to the queue.
    public void enqueue(Note note)
    {
        // Create a new LL node
        Note temp = note;
        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
    // Method to remove an key from queue.
    public void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null){
            System.out.println("No notes to delete");
            return;
        }
        // Store previous front and move front one node ahead
        Note temp = this.front;
        this.front = this.front.next;
 
        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
    }
    
    public Note getFront(){
        return this.front;
    }
    
    public Note popQueue(){
        if (this.front == null){
            return null;
        }
        Note temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        return temp;
    }
}
