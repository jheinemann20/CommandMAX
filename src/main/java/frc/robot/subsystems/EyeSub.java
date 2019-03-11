package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem. You can replace me with your own Subsystem. An example
 * subsystem. You can replace me with your own Subsystem.
 */
public class EyeSub extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DigitalInput rightEye;
    public DigitalInput midEye;
    public DigitalInput leftEye;

    @Override
    public void initDefaultCommand() {
        rightEye = new DigitalInput(RobotMap.rightEyeID);
        midEye = new DigitalInput(RobotMap.midEyeID);
        leftEye = new DigitalInput(RobotMap.leftEyeID);
    }
}
