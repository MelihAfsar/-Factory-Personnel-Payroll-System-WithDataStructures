/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import factory.personnel.payroll.system.Employee;

/**
 *
 * @author melih
 */
public class MergeSortAlgorithms {
    // Function to merge sort
    public Employee mergeSort(Employee head)
    {
        if (head.next == null)
            return head;
  
        Employee mid = findMid(head);
        Employee head2 = mid.next;
        mid.next = null;
        Employee newHead1 = mergeSort(head);
        Employee newHead2 = mergeSort(head2);
        Employee finalHead = merge(newHead1, newHead2);
  
        return finalHead;
    }
  
    
    public Employee merge(Employee head1, Employee head2)
    {
        Employee merged = new Employee(-1,"","","",0,"","","",0,0,0,0,0);
        Employee temp = merged;

        while (head1 != null && head2 != null) {
            if (head1.getSalary() < head2.getSalary()) {
                temp.next = head1;
                head1 = head1.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }
  
    public Employee findMid(Employee head)
    {
        Employee slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
