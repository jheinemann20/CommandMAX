/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSub extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public CANSparkMax
      fL = new CANSparkMax(3, MotorType.kBrushless),
      fR = new CANSparkMax(5, MotorType.kBrushless),
      rL = new CANSparkMax(2, MotorType.kBrushless),
      rR = new CANSparkMax(4, MotorType.kBrushless);

  @Override
  public void initDefaultCommand() {
    // set motor ramp rate
    fL.setOpenLoopRampRate(0.5);
    fR.setOpenLoopRampRate(0.5);
    rL.setOpenLoopRampRate(0.5);
    rR.setOpenLoopRampRate(0.5);
    fL.setClosedLoopRampRate(1);
    fR.setClosedLoopRampRate(1);
    rL.setClosedLoopRampRate(1);
    rR.setClosedLoopRampRate(1);
  }
}
