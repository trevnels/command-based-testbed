package frc.team6502.robot.commands

import edu.wpi.first.wpilibj.Timer
import edu.wpi.first.wpilibj2.command.CommandBase
import frc.team6502.robot.subsystems.TestNEO

class StopNEO: CommandBase() {

    private val timer = Timer()

    init {
        addRequirements(TestNEO)
    }

    override fun initialize() {
        timer.reset()
        timer.start()
        println("Started StopNEO")
    }

    override fun execute() {
        TestNEO.setMotorSpeed(0.0)
    }

    override fun isFinished() = timer.get() > 5.0

}