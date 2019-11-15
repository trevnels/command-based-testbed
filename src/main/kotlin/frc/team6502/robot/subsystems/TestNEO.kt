package frc.team6502.robot.subsystems

import edu.wpi.first.wpilibj2.command.SubsystemBase
import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkMaxLowLevel
import frc.team6502.robot.SPARK_CAN_ID
import frc.team6502.robot.commands.DefaultTestNEO

object TestNEO: SubsystemBase() {

    init {
        defaultCommand = DefaultTestNEO()
    }

    private val spark = CANSparkMax(SPARK_CAN_ID, CANSparkMaxLowLevel.MotorType.kBrushless)

    fun setMotorSpeed(speed: Double) {
        spark.set(speed)
    }

}