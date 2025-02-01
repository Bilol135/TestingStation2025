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
        return run(
            () -> intake.setIntakeSpeed(IntakeConstants.kIntakeInSpeed));
    }
    public void outtake(){
        // Code to outtake the coral
    }
    public void stop(){
        // Code to stop the intake
    }
    public void setIntakeSpeed(double speed){
        // Code to set the speed of the intake
    }
    @Override
    public void periodic(){
        // Code to run in the periodic block
    }
    
}
