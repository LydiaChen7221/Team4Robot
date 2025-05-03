package robot.Drive;

import com.revrobotics.CANSparkMax;
import com. revrobotics. CANSparkLowLevel;
import robot.Ports;

public class Drive {
    private final CANSparkMax leftMotor;
    private final CANSparkMax rightMotor;
    public Drive() {
        leftMotor = new CANSparkMax (Ports.Motors.LEFT_DRIVE, CANSparkLowLevel.MotorType.kBrushless);
        rightMotor = new CANSparkMax (Ports.Motors.RIGHT_DRIVE, CANSparkLowLevel.MotorType.kBrushless);

        //invert a motor depending on electrical wriring
        leftMotor.setInverted (false);
        rightMotor.setInverted(true);
    }
    
    private void tankDrive(double leftSpeed, double rightSpeed) {
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }
    public void stop(){
        leftMotor.stopMotor();
        rightMotor.stopMotor();
    }
}