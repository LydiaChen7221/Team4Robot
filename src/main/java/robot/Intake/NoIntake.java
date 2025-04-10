package robot.Intake;

public class NoIntake implements IntakeIO {
    @Override
    public void setRollerPower(double power) {
        // Does nothing
    }

    @Override
    public void stopRollers() {
        // Does nothing
    }

    @Override
    public void setJointPosition(double position) {
        // Does nothing
    }

    @Override
    public double getJointPosition() {
        return 0.0;  // Default value for simulation
    }
}
