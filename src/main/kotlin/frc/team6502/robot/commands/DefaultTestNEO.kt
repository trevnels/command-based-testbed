package frc.team6502.robot.commands

import edu.wpi.first.wpilibj2.command.CommandBase
import frc.team6502.robot.RobotContainer
import frc.team6502.robot.subsystems.TestNEO

class DefaultTestNEO: CommandBase() {

    init {
        addRequirements(TestNEO)
    }

    override fun initialize() {
        println("Starting DefaultTestNEO")
    }

    override fun execute() {
        TestNEO.setMotorSpeed(RobotContainer.leftX)
    }

    override fun isFinished(): Boolean {
        return false
    }

}