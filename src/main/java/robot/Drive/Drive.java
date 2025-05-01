package robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drive {
    private final PWMMotorController leftFront = new PWMMotorController(robot.Ports.Motors.LEFT_FRONT);
    private final PWMMotorController leftBack = new PWMMotorController(robot.Ports.Motors.LEFT_BACK);
    private final PWMMotorController rightFront = new PWMMotorController(robot.Ports.Motors.RIGHT_FRONT);
    private final PWMMotorController rightBack = new PWMMotorController(robot.Ports.Motors.RIGHT_BACK);

    private final MotorControllerGroup leftMotors = new MotorControllerGroup(leftFront, leftBack);
    private final MotorControllerGroup rightMotors = new MotorControllerGroup(rightFront, rightBack);
    private final DifferentialDrive differentialDrive = new DifferentialDrive(leftMotors, rightMotors);

    public Drive() {
        rightMotors.setInverted(true); // Adjust if needed
    }

    public void arcadeDrive(double speed, double rotation) {
        differentialDrive.arcadeDrive(speed, rotation);
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        differentialDrive.tankDrive(leftSpeed, rightSpeed);
    }

    public void stop() {
        differentialDrive.stopMotor();
    }

    public void setMaxOutput(double maxOutput) {
        differentialDrive.setMaxOutput(maxOutput);
    }
}


