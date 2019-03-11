/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static int // drivechannels
    frontLeftChannel = 3,
    frontRightChannel = 5,
    rearLeftChannel = 2,
    rearRightChannel = 4;

  public static int // motor channels
    lifter1Channel = 10,
    lifter2Channel = 9,
    elevatorChannel = 11,
    leftHerderChannel = 0,
    rightHerderChannel = 0,
    ballHolderChannel = 0,
    liftDriveChannel = 12;

  public static int // joystick channels
    myJoyChannel = 0,
    myJoy2Channel = 1;

  public static int // eye channels
    rightEyeID = 0,
    leftEyeID = 0,
    midEyeID = 0;

  public static int[] // solenoid channels
    shifterChannel = new int[]{0, 1};

  public static double // deadband channels
    deadbandChannel = 0.05;
}
