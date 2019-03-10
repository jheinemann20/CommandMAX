// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.subsystems.*;


public class AAAMecanumDrive extends Command {

  public double strafeVal;
  public double forwardVal;
  public double turnVal;
  


  
    public AAAMecanumDrive(double fVal, double sVal, double tVal) {

      strafeVal = sVal;
      forwardVal = fVal;
      turnVal = tVal;

      requires(Robot.driveSub);

    }

    public AAAMecanumDrive(Joystick driveJoystick)
    {
      RobotMap.mecanumDrive.driveCartesian(Robot.oi.getYValue(), Robot.oi.getXValue(), Robot.oi.getTwistValue());
    	OI.shifter.set(Value.kForward);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    	new AAAMecanumDrive(Robot.oi.driveJoystick);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    }

  
    @Override
    protected void interrupted() {
    }
}

