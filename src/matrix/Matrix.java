/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author 2nd
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //matrix A
    int matA[][] = {{6,3,2}, {4,2,3}};
    //matrix B
    int matB[][] = {{1,2},{2,3},{3,1}};
    // matrix C
    int matC[][] = new int [matA.length][matB .length];
    
    //masuk ke looping 
  
        for (int x = 0; x < matA.length; x++){
            for (int y = 0; y < matA.length; y++){
                for (int z = 0; z < matB.length; z++){
                //Perkalian matrix A dengan matrix B
                matC[x][y] += matA[x][z] * matB[z][y]; 
                }
                System.out.print(matC[x][y]+" ");
            }
            System.out.println();
        }    
    }
}
      
        
        
      
                
                
                
                
            
            
        
    
    
        


        
    
    

