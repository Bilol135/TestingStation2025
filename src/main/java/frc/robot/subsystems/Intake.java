package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{
    private final IntakeIO intake;
    public Intake(IntakeIO intake){
        // Initialize the intake here
        this.intake = intake;
    }
    public Command intake(){
        // Code to intake the coral
        return startEnd(
            () -> intake.setIntakeSpeed(IntakeConstants.kIntakeInSpeed),
            () -> intake.setIntakeSpeed(0)
            );
    }
    public Command outtake(){
        // Code to outtake the coral
        return run(
            () -> intake.setIntakeSpeed(IntakeConstants.kIntakeOutSpeed));
    }
    public Command IntakeStop(){
        // Code to stop the intake
        return run(() -> intake.setIntakeSpeed(0));

    }
    public Command setIntakeSpeed(double speed){
        // Code to set the speed of the intake
        return run(() -> intake.setIntakeSpeed(speed));
    }
   
    @Override
    public void periodic(){
        // Code to run in the periodic block
    }
    
}
