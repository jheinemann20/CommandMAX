
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
// RobotBuilder Version: 2.0
//

package frc.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  //Instance Variables
  public Joystick
    driveJoystick = new Joystick(0),
    elevatorJoystick = new Joystick(1);

  public static DoubleSolenoid
    shifter = new DoubleSolenoid(0, 1);

  private static DigitalInput rightEye;
  private static DigitalInput midEye;
  private static DigitalInput leftEye;

  private static double xValue;
  private static double yValue;
  private static double twistValue;

	// OI constructor method
  public OI() 
  {  

  }

  public double getXValue()
  {
    return xValue;
  }

  public double getYValue()
  {
    return yValue;
  }

  public double getTwistValue()
  {
    return twistValue;
  }

  public Joystick getDriveJoystick()
  {
    return driveJoystick;
  }

  public Joystick getElevatorstick()
  {
    return elevatorJoystick;
  }

  public boolean getLeftEye() 
  {
    return leftEye.get();
  }

  public boolean getRightEye()
  {
    return rightEye.get();
  }

  public boolean getMidEye()
  {
    return midEye.get();
  }

}