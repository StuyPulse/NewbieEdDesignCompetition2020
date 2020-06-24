/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>Iat is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public interface Constants {
    // int HI = 1;
    // int DRIVETRAIN_LEFT_MOTOR = 2;
    //how do we name constants
    int INTAKE_MOTOR = 18;
    int INTAKE_PORT_A_DOUBLESOLENOID = 4;
    int INTAKE_PORT_B_DOUBLESOLENOID = 5;
    int INTAKE_BUTTON1 = 4;

    // interface Drivetrain (nested interfaces are static as well, so you can do Consatnts.Drivetrain and import constants.drivetrain)
}
