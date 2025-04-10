package robot.Intake;

public interface IntakeIO {
    // Sets power for intake rollers
    void setRollerPower(double power);

    // Stop intake rollers
    void stopRollers();

    // Set joint position (collapsed/extended)
    void setJointPosition(double position);

    // Get joint position (collapsed/extended)
    double getJointPosition();
}
