package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Intake;

public class IntakeCommand extends CommandBase {
    private Intake intake;

    public IntakeCommand(Intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
   
    public void execute() {
        if(intake.isBallDetected()) {
            intake.acquire();
        } else {
            intake.stop(); 
        }
    }
}