package lib;

import static lib.FaultLogger.*;
import static lib.UnitTestingUtil.setupTests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;
import java.util.Set;
import lib.SparkUtils.Data;
import lib.SparkUtils.Sensor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SparkUtilsTest {

  @BeforeEach
  public void setup() {
    setupTests();
  }

  @Test
  void configure() {
    CANSparkFlex motor = new CANSparkFlex(1, MotorType.kBrushless);
    RelativeEncoder encoder = motor.getEncoder();

    check(motor, motor.restoreFactoryDefaults());
    check(
        motor,
        SparkUtils.configureFrameStrategy(
            motor,
            Set.of(Data.POSITION, Data.VELOCITY, Data.APPLIED_OUTPUT),
            Set.of(Sensor.INTEGRATED),
            false));
    check(motor, motor.setIdleMode(IdleMode.kBrake));
    check(motor, motor.setSmartCurrentLimit(30));
    check(motor, encoder.setPositionConversionFactor(0.5));
    check(motor, encoder.setVelocityConversionFactor(0.25));
    check(motor, encoder.setMeasurementPeriod(8));
    check(motor, encoder.setAverageDepth(2));
    check(motor, motor.burnFlash());

    assertEquals(IdleMode.kBrake, motor.getIdleMode());
    assertEquals(0.5, encoder.getPositionConversionFactor());
    assertEquals(0.25, encoder.getVelocityConversionFactor());
    assertEquals(8, encoder.getMeasurementPeriod());
    assertEquals(2, encoder.getAverageDepth());

    motor.close();
  }
}
