package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.RobotMap;

/**
 * An example subsystem. You can replace me with your own Subsystem. An example
 * subsystem. You can replace me with your own Subsystem.
 */
public class DriveSub extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private CANSparkMax fL, fR, rL, rR;

  public MecanumDrive myDrive;

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
  }

  // Uses existing Mecanum drive as arcade drive by removing strafe axis
  public void myArcadeDrive(double ySpeed, double xSpeed) {
    myDrive.driveCartesian(-ySpeed, 0, xSpeed);
  }

  public void myMecanumDrive(double xSpeed, double ySpeed, double zSpeed) {
    myDrive.driveCartesian(-ySpeed, xSpeed, zSpeed);
  }
}
