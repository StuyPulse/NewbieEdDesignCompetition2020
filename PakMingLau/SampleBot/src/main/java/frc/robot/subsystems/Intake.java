/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

  CANSparkMax motor;
  DoubleSolenoid piston;
  DigitalInput button1;

  public Intake() {
    motor = new CANSparkMax(Constants.INTAKE_MOTOR);
    piston = new DoubleSolenoid(Constants.INTAKE_PORT_A_DOUBLESOLENOID, Constants.INTAKE_PORT_B_DOUBLESOLENOID);
    button1 = new DigitalInput(Constants.INTAKE_BUTTON1);
  }

  public void acquire() {
    motor.set(1);
  }
  
  public void deacquire() {
    motor.set(-1);
  }

  public void stop() {
    motor.set(0);
  }

  public void extend() {
    piston.set(Value.kForward);
  }

  public void retract() {
    piston.set(Value.kReverse);
  }

  public boolean isBallDetected() {
    return button1.get();
  }

  public void periodic() {
    // This method will be called once per scheduler run
  }
}
