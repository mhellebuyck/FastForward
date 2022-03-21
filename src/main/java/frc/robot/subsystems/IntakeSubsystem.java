// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap.PWM;

public class IntakeSubsystem extends SubsystemBase {

  Spark intakeMotor = new Spark(PWM.LIFT_RAISE);
  Spark liftPull = new Spark(PWM.LIFT_PULL);



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
        
    public IntakeSubsystem() {
        System.out.println("Created lift object.");
    }

    /**
     * Set the speed of the motor.
     * 
     * @param value
     */
    public void LiftBot() {
        liftPull.set(1);
    }

    /**
     * Set the speed of the motor.
     * 
     * @param value
     */
    public void LowerBot() {
        liftPull.set(-1);
    }

    /**
     * Stop all motors for the lift.
     */
    public void outtake() {
        // intakeMotor.set(0.50);
        intakeMotor.set(Constants.INTAKE_COLLECT_POWER);
    }

    /**
     * Set the speed of the motor.
     * 
     * @param value
     */
    public void intake() {
        //intakeMotor.set(-0.75);
        intakeMotor.set(Constants.INTAKE_PUSH_POWER);
    }

    /**
     * Set the speed of the motor.
     * 
     * @param value
     */
    public void StopLift() {
        liftPull.stopMotor();
    }

    /**
     * Stop all motors for the lift.
     */
    public void stop() {
        intakeMotor.stopMotor();
    }
}