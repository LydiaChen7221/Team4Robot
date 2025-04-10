package robot.Drive;

public interface DriveIO {
    // Set motor speeds
    void setSpeeds(double leftSpeed, double rightSpeed);

    // Stop drivetrain
    void stop();

    // left encoder velocity
    double getLeftVelocity();

    // right encoder velocity
    double getRightVelocity();
}
