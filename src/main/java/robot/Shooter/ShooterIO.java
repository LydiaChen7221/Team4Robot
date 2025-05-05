package robot.Shooter;

public interface ShooterIO {
    //Sets voltage for shooter motors
    void setVoltage(double voltage);

    //Stop shooter motors
    void stopMotors();

    //Get shooter motor voltage
    double voltage();

    //Get shooter motor velocity
    double velocity();
}