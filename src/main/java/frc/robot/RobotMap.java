package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class RobotMap {
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

    public static MecanumDrive mecanumDrive;
  
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
    public static int // drivechannels
        frontLeftChannel = 3,
        frontRightChannel = 5,
        rearLeftChannel = 2,
        rearRightChannel = 4;
  
    public static int // motor channels
        lifter1Channel = 10,
        lifter2Channel = 9,
        elevatorChannel = 11,
        leftHerderChannel = 0,
        rightHerderChannel = 0,
        ballHolderChannel = 0,
        liftDriveChannel = 12;
  
    public static int // joystick channels
        myJoyChannel = 0,
        myJoy2Channel = 1;
  
    public static int[] // solenoid channels
        shifterChannel = new int[]{0, 1};
  
    public static double // deadband channels
        deadbandChannel = 0.05;  
  }