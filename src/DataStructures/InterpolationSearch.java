/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author kenan
 */
public class InterpolationSearch {
    
    public static int interpolationSearch(int arr[],int low,int high,int search){
        int pos; //position of the element
        if(low <= high && search >= arr[low] && search <=arr[high]){
            pos = low + (((high - low) / (arr[high] - arr[low])) * (search - arr[low]));
            if(arr[pos] == search){
                return pos;
            }
            if(arr[pos] <search){
               return interpolationSearch(arr,pos+1,high,search); //low = pos + 1..
            }
            if (arr[pos]>search){
                return interpolationSearch(arr,low,pos-1,search); //high = pos - 1..    
            }
        }
        return -1;
    }

    public Integer interpolationSearch(Integer[] SelectId, int i, Integer len, Integer searchId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
