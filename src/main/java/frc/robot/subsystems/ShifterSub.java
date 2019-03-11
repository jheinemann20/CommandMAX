package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem. You can replace me with your own Subsystem. An example
 * subsystem. You can replace me with your own Subsystem.
 */
public class ShifterSub extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DoubleSolenoid shifter;

    @Override
    public void initDefaultCommand() {
        shifter = new DoubleSolenoid(RobotMap.shifterChannel[0], RobotMap.shifterChannel[1]);
    }

    public void shiftForward() {
        shifter.set(Value.kForward);
    }

    public void shiftReverse() {
        shifter.set(Value.kReverse);
    }
}
