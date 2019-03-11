/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.Robot;

public class MecanumDriveCommand extends Command {

  public MecanumDriveCommand() {
    setTimeout(1000);
  }

  private MecanumDrive myDrive;
  private DoubleSolenoid shifter;
  private double joyX, joyY, joyZ;

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    myDrive = Robot.mecDriveSub.myDrive;
    shifter = Robot.shifterSub.shifter;
    shifter.set(Value.kReverse);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // Line auto-correction
    joyX = Robot.joySub.addDeadband(Robot.joySub.myJoy.getRawAxis(1));
    joyY = Robot.joySub.addDeadband(Robot.joySub.myJoy.getRawAxis(0));
    joyZ = Robot.joySub.addDeadband(Robot.joySub.myJoy.getRawAxis(4));
    myDrive.driveCartesian(-joyX, joyY, joyZ);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}