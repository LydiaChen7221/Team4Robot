package robot.Drive;

public class RealDrive implements DriveIO {
    @Override
    public void setSpeeds(double leftSpeed, double rightSpeed) {
        // Placeholder set motor speeds 
    }

    @Override
    public void stop() {
        // Placeholder stop motors 
    }

    @Override
    public double getLeftVelocity() {
        return 0; // Placeholder return actual encoder velocity
    }

    @Override
    public double getRightVelocity() {
        return 0; // Placeholder
    }
}
