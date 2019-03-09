/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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

  public CANSparkMax
      fL = new CANSparkMax(3, MotorType.kBrushless),
      fR = new CANSparkMax(5, MotorType.kBrushless),
      rL = new CANSparkMax(2, MotorType.kBrushless),
      rR = new CANSparkMax(4, MotorType.kBrushless);

  public VictorSPX
      lifter1 = new VictorSPX(10),
      lifter2 = new VictorSPX(9),
      elevator = new VictorSPX(11),
      leftHerder = new VictorSPX(0),
      rightHerder = new VictorSPX(0),
      ballHolder = new VictorSPX(0),
      liftDrive = new VictorSPX(12);

  public Joystick
      myJoy = new Joystick(0),
      myJoy2 = new Joystick(1);

  public MecanumDrive
      myDrive = new MecanumDrive(fL, fR, rL, rR);

  public DoubleSolenoid
      shifter = new DoubleSolenoid(0, 1);

  public boolean
      driveToggle = false,
      shiftToggle = true,
      debounce = false,
      debounce_two = false;

  public double
      deadband = 0.05,
      joyX, // modified in drive subsystem
      joyY, // modified in drive subsystem
      joyZ; // modified in drive subsystem

  public double addDeadband(double x) {
    if (x >= deadband)
      return x;
    else if (x <= -deadband)
      return x;
    else
      return 0;
  }
}
