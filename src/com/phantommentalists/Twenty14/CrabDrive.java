package com.phantommentalists.Twenty14;

import java.util.Vector;

/*
 *       CrabDrive allocation:
 *               Hunter Lawrence
 *          Author:
 *               Hunter Lawrence
 */
public class CrabDrive {

    private DriveUnit left;
    private DriveUnit right;
    public boolean isCrab;

    public CrabDrive(){
        
    }
     /*   crabDrive()
    *   
    *   Makes all wheels turn in the same direction.
    */
    public void crabDrive(double drivePower, double turnAngle) {
        left.crabDrive(drivePower, turnAngle);
        right.crabDrive(drivePower, turnAngle);
        
        
      //Make wheels move in parallel
    }
       /*  slewDrive()
     *
     *  Makes the robot turn on its axis.
     */
    public void slewDrive(double drivePower, double turnAngle) {
       //Make wheels move in Opposites of each other
        left.slewDrive(drivePower, turnAngle);
        right.slewDrive(drivePower, turnAngle);
        
    }
    public void setDrive(double drivePower){
        
    }
    
    public void setTurn(double turnAngle){
        
    }
    
}