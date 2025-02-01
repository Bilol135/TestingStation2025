package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.ClosedLoopConfig;
import com.revrobotics.spark.config.SoftLimitConfig;
import com.revrobotics.spark.config.SoftLimitConfig;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import frc.robot.Configs.IntakeConfigs;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkClosedLoopController;

public class IntakeSparkMax implements IntakeIO {
    private final SparkMax intakeMotor;

    public IntakeSparkMax() {
        intakeMotor = new SparkMax(IntakeConstants.kIntakeMotorID, MotorType.kBrushless);
        intakeMotor.configure(IntakeConfigs.intakeConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        
    }

    @Override
    public void setIntakeSpeed(double speed) {
        intakeMotor.set(speed);
    }


/* 
    @Override
    public void setP(double p) {
        pivotController.se;
    }

    @Override
    public void setI(double i) {
        pivotController.setI(i);
    }

    @Override
    public void setD(double d) {
        pivotController.setD(d);
    }
    
    @Override
    public void setFF(double ff) {
        pivotController.setFF(ff);
    }

    @Override
    public double getFF() {
        return pivotController.getFF();
    }

    @Override
    public double getP() {
        return pivotController.getP();
    }

    @Override
    public double getI() {
        return pivotController.getI();
    }

    @Override
    public double getD() {
        return pivotController.getD();
    }
    */

    @Override
    public void reset() {
        
    }
}   


