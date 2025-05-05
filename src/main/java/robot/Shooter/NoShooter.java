package robot.Shooter;

public class NoShooter implements ShooterIO {
    @Override
    public void setVoltage(double voltage) {
        // Does nothing
    }

    @Override
    public void stopMotors() {
        // Does nothing
    }

    @Override
    public double voltage() {
        return 0.0; // Default value for simulation
    }

    @Override
    public double velocity() {
        return 0.0;  // Default value for simulation
    }
}