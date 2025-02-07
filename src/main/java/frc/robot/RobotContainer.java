// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Constants.IOConstants;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.IntakeConstants;
import frc.robot.subsystems.IntakeSparkMax;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  private static final Intake intake = new Intake(new IntakeSparkMax());
  static XboxController Controller = new XboxController(IOConstants.kOperatorControllerPort);
  static DigitalInput CoralDetection = new DigitalInput(0);
  
  
    public RobotContainer() {
      configureBindings();
    }
  
    private void configureBindings() {
      this.robotPeriodic();
    }
   
    public Command getAutonomousCommand() {
      return Commands.print("No autonomous command configured");
    }
    
    public static void robotPeriodic(){

    new JoystickButton(Controller, XboxController.Button.kA.value).and(CoralDetection::get).whileTrue(intake.intake());
    
    SmartDashboard.putBoolean("DigPinSatus", CoralDetection.get());
  }
}
