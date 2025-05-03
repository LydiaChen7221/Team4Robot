package robot;

public final class Ports {
    // Prevent instantiation
    private Ports() {}

    // Operator Interface (OI) ports
    public static final class OI {
        private OI() {}
        public static final int OPERATOR = 0;  // e.g., Xbox controller for operator
        public static final int DRIVER = 1;    // e.g., Xbox controller for driver
    }

    // Motor controller ports
    public static final class Motors {
        private Motors() {}
        public static final int LEFT_DRIVE =2;
        public static final int RIGHT_DRIVE = 3;
        public static final int LEFT_FRONT = 0;
        public static final int LEFT_BACK = 1;
        public static final int RIGHT_FRONT = 2;
        public static final int RIGHT_BACK = 3;
        public static final int ARM_MOTOR = 4;
    }
  

    // Sensor ports
    public static final class Sensors {
        private Sensors() {}
        public static final int GYRO = 0;       // e.g., SPI port 0
        public static final int ULTRASONIC = 1; // e.g., Analog input 1
        public static final int LIMIT_SWITCH = 2;
    }

    // Pneumatic channels
    public static final class Pneumatics {
        private Pneumatics() {}
        public static final int COMPRESSOR = 0;
        public static final int SOLENOID_FORWARD = 1;
        public static final int SOLENOID_REVERSE = 2;
    }
}
