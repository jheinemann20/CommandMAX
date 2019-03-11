package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem. You can replace me with your own Subsystem. An example
 * subsystem. You can replace me with your own Subsystem.
 */
public class JoySub extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Joystick myJoy, myJoy2;
    private double deadband = RobotMap.deadbandChannel;

    @Override
    public void initDefaultCommand() {
        myJoy = new Joystick(RobotMap.myJoyChannel);
        myJoy2 = new Joystick(RobotMap.myJoy2Channel);
    }

    // Adds deadband to a given axis (for driving only)
  public double addDeadband(double x) {
    if (x >= deadband)
      return x;
    else if (x <= -deadband)
      return x;
    else
      return 0;
  }
}
