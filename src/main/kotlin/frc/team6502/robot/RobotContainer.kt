package frc.team6502.robot

import edu.wpi.first.wpilibj.GenericHID
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj2.command.button.JoystickButton
import frc.team6502.robot.commands.StopNEO
import frc.team6502.robot.subsystems.TestNEO

/**
 * Initialize devices and subsystems here
 */
object RobotContainer {

    var joystick = Joystick(0)

    init {
        // initialize subsystems here:
        TestNEO

        JoystickButton(joystick, 1).whenPressed(StopNEO())
    }


    val leftX: Double
        get() = joystick.getX(GenericHID.Hand.kLeft)

}