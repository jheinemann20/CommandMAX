/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class DriveSub extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public CANSparkMax fL, fR, rL, rR;

  public MecanumDrive myDrive;

  public DoubleSolenoid shifter;

  public boolean shiftToggle, debounce, debounce_two;

  @Override
  public void initDefaultCommand() {
    // set motors
    fL = new CANSparkMax(RobotMap.frontLeftChannel, MotorType.kBrushless);
    fR = new CANSparkMax(RobotMap.frontRightChannel, MotorType.kBrushless);
    rL = new CANSparkMax(RobotMap.rearLeftChannel, MotorType.kBrushless);
    rR = new CANSparkMax(RobotMap.rearRightChannel, MotorType.kBrushless);

    // set motor ramp rate
    fL.setOpenLoopRampRate(0.5);
    fR.setOpenLoopRampRate(0.5);
    rL.setOpenLoopRampRate(0.5);
    rR.setOpenLoopRampRate(0.5);
    fL.setClosedLoopRampRate(1);
    fR.setClosedLoopRampRate(1);
    rL.setClosedLoopRampRate(1);
    rR.setClosedLoopRampRate(1);

    // invert motors
    fL.setInverted(false);
    fR.setInverted(false);
    rL.setInverted(false);
    rR.setInverted(false);

    // set drive
    myDrive = new MecanumDrive(fL, fR, rL, rR);

    // initialize DoubleSolenoid (and assosciated booleans)
    shifter = new DoubleSolenoid(0, 1);
    shiftToggle = true;
    debounce = false;

    // send to SmartDashboard
    SmartDashboard.putNumber("Front Left", fL.get());
    SmartDashboard.putNumber("Front Right", fR.get());
    SmartDashboard.putNumber("Rear Left", rL.get());
    SmartDashboard.putNumber("Rear Right", rR.get());
  }
}
