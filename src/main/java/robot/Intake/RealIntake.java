package robot.Intake;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;  
import edu.wpi.first.wpilibj.Servo; 

public class RealIntake implements IntakeIO {
    private final MotorController leftRollerMotor;
    private final MotorController rightRollerMotor;
    private final Servo intakeJoint;  

    public RealIntake(MotorController leftRoller, MotorController rightRoller, Servo joint) {
        this.leftRollerMotor = leftRoller;
        this.rightRollerMotor = rightRoller;
        this.intakeJoint = joint;
    }

    @Override
    public void setRollerPower(double power) {
        // Set power left and right intake rollers
        leftRollerMotor.set(power); 
        rightRollerMotor.set(power);
    }

    @Override
    public void stopRollers() {
        // Stop intake rollers
        leftRollerMotor.set(0);  // Stops by setting power to 0
        rightRollerMotor.set(0);
    }

    @Override
    public void setJointPosition(double position) {
        intakeJoint.set(position); 
    }

    @Override
    public double getJointPosition() {
        // Return current position of the joint 
        return intakeJoint.get(); 
    }
}