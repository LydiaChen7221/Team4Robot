package robot.Intake;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class Intake {
    private final IntakeIO hardware;

    public Intake(IntakeIO hardware) {
        this.hardware = hardware;
    }

    public static Intake create(MotorController leftRoller, MotorController rightRoller, Servo joint) {
        return new Intake(new RealIntake(leftRoller, rightRoller, joint));  // Use real hardware
    }

    public static Intake none() {
        return new Intake(new NoIntake());  
    }
    // run
    public Command runIntake(double power) {
        return Commands.run(() -> hardware.setRollerPower(power));
    }
    // stop
    public Command stopIntake() {
        return Commands.run(hardware::stopRollers);
    }
    // collapse
    public Command collapseIntake() {
        return Commands.run(() -> hardware.setJointPosition(IntakeConstants.JOINT_COLLAPSED_POSITION));
    }

    // deploy :3
    public Command extendIntake() {
        return Commands.run(() -> hardware.setJointPosition(IntakeConstants.JOINT_EXTENDED_POSITION));
    }
}
