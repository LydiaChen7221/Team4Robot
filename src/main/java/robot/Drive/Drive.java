package robot.Drive;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class Drive {
    private final DriveIO hardware;

    public Drive(DriveIO hardware) {
        this.hardware = hardware;
    }

    public static Drive create() {
        return new Drive(new RealDrive());
    }

    public static Drive none() {
        return new Drive(new NoDrive());
    }

    public Command driveCommand(double leftSpeed, double rightSpeed) {
        return Commands.run(() -> hardware.setSpeeds(leftSpeed, rightSpeed));
    }

    public Command stopCommand() {
        return Commands.run(hardware::stop);
    }
}
