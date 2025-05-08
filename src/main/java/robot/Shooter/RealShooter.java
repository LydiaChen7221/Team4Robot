package robot.Shooter;

import static robot.Ports.Shooter.BOTTOM_MOTOR;
import static robot.Ports.Shooter.TOP_MOTOR;
import robot.Constants;
import robot.Ports;
import robot.Robot;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import com.revrobotics.CANSparkMax;


public class RealShooter implements ShooterIO {
    private final CANSparkMax topMotor;
    private final CANSparkMax bottomMotor;

    public RealShooter(CANSparkMax topMotor, CANSparkMax bottomMotor) {
        this.topMotor = topMotor;
        this.bottomMotor = bottomMotor;
    }

    @Override
    public void setVoltage(double voltage) {
        // Set power top and bottom shooter rollers
        topMotor.set(voltage); 
        bottomMotor.set(voltage);
    }

    @Override
    public void stopMotors() {
        // Stop shooter motors
        topMotor.set(0);  // Stops by setting power to 0
        bottomMotor.set(0);
    }

    @Override
    public double voltage() {
        return topMotor.getVoltage();
        return bottomMotor.getVoltage();
        //Returns voltage for shooter motors
    }

    @Override
    public double velocity() {
        return topMotor.getVelocity();
        return bottomMotor.getVelocity();
        //Returns velocity for shooter motors
    }
}