/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team852;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring.
 */
public class RobotMap {

    // maping motor
    public static SpeedController frontLeft = new PWMTalonSRX(0);
    public static SpeedController backLeft = new PWMTalonSRX(1);
    public static SpeedController frontRight = new PWMTalonSRX(3);
    public static SpeedController backRight = new PWMTalonSRX(2);

    public static SpeedControllerGroup leftDrive = new SpeedControllerGroup(frontLeft, backLeft);
    public static SpeedControllerGroup rightDrive = new SpeedControllerGroup(frontRight, backRight);

    public static DifferentialDrive robotDrive = new DifferentialDrive(leftDrive, rightDrive);
}
