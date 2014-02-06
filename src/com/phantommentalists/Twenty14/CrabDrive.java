package com.phantommentalists.Twenty14;

import edu.wpi.first.wpilibj.can.CANTimeoutException;

/*
 *       CrabDrive allocation:
 *               Hunter Lawrence
 *          Author:
 *               Hunter Lawrence
 */
public class CrabDrive {
    
    public DriveUnit left;
    public DriveUnit right;
    
    
    public CrabDrive() throws CANTimeoutException {
        left = new DriveUnit(Parameters.frontLeftSteeringCanId, 
                Parameters.rearLeftSteeringCanId, 
                Parameters.leftFrontDriveCanId, 
                Parameters.leftRearDriveCanId,
                Parameters.leftDriveShifter);
        right = new DriveUnit(Parameters.frontRightSteeringCanId, 
                Parameters.rearRightSteeringCanId, 
                Parameters.rightFrontDriveCanId,
                Parameters.rightRearDriveCanId,
                Parameters.rightDriveShifter);
        
    }

    /** enablePositionControl()
     * 
     * enables Position Controlling
     * 
     * @throws CANTimeoutException 
     */
    public void enablePositionControl() throws CANTimeoutException {
        right.enablePositionControl();
        left.enablePositionControl();
    }
      /** disablePositionControl()
     * 
     * disables Position Controlling
     * 
     * @throws CANTimeoutException 
     */
    public void disablePositionControl() throws CANTimeoutException {
        right.disablePositionControl();
        left.disablePositionControl();
    }
    
    /*   crabDrive()
     *   
     *   Makes all wheels turn in the same direction.
     */

    public void crabDrive(double drivePower, double turnAngle) throws CANTimeoutException {
        left.crabDrive(drivePower, turnAngle);
        right.crabDrive(drivePower, turnAngle);
    }
    /*  slewDrive()
     *
     *  Makes the robot turn on its axis.
     */

    public void slewDrive(double drivePower, double turnAngle) throws CANTimeoutException {
        left.slewDrive(drivePower, turnAngle);
        right.slewDrive(drivePower, turnAngle);
    }
    /** setDrive()
     * 
     * Not Sure yet
     * @param drivePower 
     */
    public void setDrive(double drivePower) {
        
    }
    /** setTurn()
     * 
     * Not Sure yet
     * @param turnAngle 
     */
    public void setTurn(double turnAngle) {
        
    }
    /**
     * getRearPosition()
     * 
     * Gets the rear position of the crab drive.
     * 
     * @return
     * @throws CANTimeoutException
     */
    public double getRearPosition() throws CANTimeoutException {
        return right.getRearPosition();
    }
    
    /**
     *getFrontPosition()
     * 
     * Gets the front position of crab drive.
     * 
     * @return
     * @throws CANTimeoutException
     */
    public double getFrontPosition() throws CANTimeoutException {
        return left.getFrontPosition();
    }
    
    public void processCrabDrive()
    {
        left.processDriveUnit();
        right.processDriveUnit();
    }
}
