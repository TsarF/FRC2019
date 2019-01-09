package frc.team972.robot;

import frc.team972.robot.subsystems.Drive;
import frc.team972.robot.util.CoordinateDriveSignal;
import frc.team972.robot.util.DriveSignal;
import frc.team972.robot.util.MecanumHelper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriveTest {
    @Test
    public void testMecanum() {
        DriveSignal signal = MecanumHelper.cartesianCalculate(
                new CoordinateDriveSignal(1, 5, 20),
                30);
        //values generated on Lua test-bench
        assertEquals(signal.getLeftFront(), 23.196152422707, 0.0001);
        assertEquals(signal.getRightFront(), -13.535898384862, 0.0001);
        assertEquals(signal.getLeftBack(), 26.464101615138, 0.0001);
        assertEquals(signal.getRightBack(), -16.803847577293, 0.0001);
    }

    @Test
    public void testDriveMotorVoltage() {

        Drive.getInstance().setOpenLoop(new DriveSignal(0.1, 0.2, 0.3, 0.4));

        //Causes LinkError
    }
}
