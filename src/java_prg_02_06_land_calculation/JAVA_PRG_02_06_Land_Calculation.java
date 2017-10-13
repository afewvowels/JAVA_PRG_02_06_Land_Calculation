/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_06_land_calculation;

/**
 *
 * @author bluebackdev
 * One acre of land is equivalent to 43,560 square feet. Write a program that
 * calculates the number of acres in a tract of land with 389,767 square feet.
 * Hint. Divide the size of the tract of land by the size of an acre to get
 * the number of acres.
 */
public class JAVA_PRG_02_06_Land_Calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define conversion ratio and total land area
        // as ints, will cast to float later
        final int INT_FEET_IN_ACRE = 43560;
        final int INT_LAND_TRACT = 389767;
        
        // Declare variable to hold result
        float fltAcres;
        
        // Calculate acres by dividing total land area by feet in acre.
        fltAcres = (float)INT_LAND_TRACT / (float)INT_FEET_IN_ACRE;
        
        // Print results to console
        System.out.println(INT_LAND_TRACT + " feet is equal to " +
                            fltAcres + " acres.");
    }
    
}
