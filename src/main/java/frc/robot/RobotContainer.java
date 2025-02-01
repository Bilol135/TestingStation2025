// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Constants.IOConstants;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.IntakeConstants;
import frc.robot.subsystems.IntakeSparkMax;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  private final Intake intake = new Intake(new IntakeSparkMax());
  XboxController Controller = new XboxController(IOConstants.kOperatorControllerPort);
  DigitalInput CoralDetection = new DigitalInput(0);


  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(Controller, XboxController.Button.kA.value).onTrue(intake.intake());
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
  @Override
  public void robotPeriodic(){
    if(!CoralDetection.get()){
      intake.setIntakeSpeed(0);
    } else {
      intake.setIntakeSpeed(IntakeConstants.kIntakeInSpeed);
    }
  }
}
