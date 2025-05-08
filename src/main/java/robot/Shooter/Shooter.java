package robot.Shooter;

import static robot.Ports.Shooter.BOTTOM_MOTOR;
import static robot.Ports.Shooter.TOP_MOTOR;
import com.revrobotics.CANSparkMax;
import robot.Constants;
import robot.Ports;
import robot.Robot;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class Shooter extends SubsystemBase{
    private final ShooterIO top;
    private final ShooterIO bottom;

    /* Incomplete or Unused Code
    private final PIDcontroller topPID = new PIDController(kP, kI, kD);
    private final PIDcontroller bottomPID = new PIDController(kP, kI, kD);
    /* */

    public Shooter(ShooterIO top, ShooterIO bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public static Shooter create(CANSparkMax topMotor, CANSparkMax bottomMotor) {
        return new Shooter(new RealShooter(topMotor, bottomMotor));
    }
    public static Shooter none() {
        return new Shooter(new NoShooter());  
    }

    public void setVoltage(double voltage) {
        top.setVoltage(voltage);
        bottom.setVoltage(voltage);
    }

    public double topVelocity() {
        return top.velocity();
    }

    public double bottomVelocity() {
        return bottom.velocity();
    }

    //run shooter
    public Command runShooter(double voltage) {
        return Commands.run(() -> top.setVoltage(voltage), bottom.setVoltage(voltage));
    }

    //stop shooter
    public Command stopShooter() {
        return Commands.run(top::stopMotors);
        return Commands.run(bottom::stopMotors);
    }
}