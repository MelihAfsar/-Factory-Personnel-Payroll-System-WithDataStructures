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
public class EmployeeLinkedList {
    private Employee headNode;
    private int numberOfNodes;
    
    public EmployeeLinkedList(){
        headNode = null;
        numberOfNodes=0;
    }
    
    public void add(Employee employee){
        if(getHeadNode() == null){
            setHeadNode(employee);
            setNumberOfNodes(numberOfNodes+1);
        }
        else{
            setNumberOfNodes(numberOfNodes+1);
            employee.next = getHeadNode();
            setHeadNode(employee);
        }
    }
    
    //Test
    public void display(){
        Employee employee = getHeadNode();
        
        while (employee!=null) {
            System.out.println(employee.getName());
            employee = employee.next;
        }
                
    }

    /**
     * @return the headNode
     */
    public Employee getHeadNode() {
        return headNode;
    }

    /**
     * @param headNode the headNode to set
     */
    public void setHeadNode(Employee headNode) {
        this.headNode = headNode;
    }

    /**
     * @return the numberOfNodes
     */
    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * @param numberOfNodes the numberOfNodes to set
     */
    public void setNumberOfNodes(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }
}
