package robot.Drive;

public class NoDrive implements DriveIO {
    @Override
    public void setSpeeds(double leftSpeed, double rightSpeed) {
        // Does nothing
    }

    @Override
    public void stop() {
        // Does nothing
    }

    @Override
    public double getLeftVelocity() {
        return 0; // Returns zero it's not actually running
    }

    @Override
    public double getRightVelocity() {
        return 0;
    }
}

