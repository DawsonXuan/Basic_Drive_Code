package org.usfirst.frc.team972;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.*;

public class Robot extends IterativeRobot {
	
	WPI_TalonSRX motorLeft = new WPI_TalonSRX(1);
	WPI_TalonSRX motorSecondLeft = new WPI_TalonSRX(2);
	WPI_TalonSRX motorRight = new WPI_TalonSRX(5);
	WPI_TalonSRX motorSecondRight = new WPI_TalonSRX(6);

	Joystick joy = new Joystick(0);
	
	@Override
	public void teleopInit(){
		motorSecondLeft.set(ControlMode.Follower, 1);
		motorSecondRight.set(ControlMode.Follower, 4);
	}
	
	@Override
	public void teleopPeriodic() {
		
		/*double leftIn = joy.getRawAxis(1) * 0.8;
		double rightIn = joy.getRawAxis(2) * 0.8;
		
		double leftOut = leftIn - rightIn * 0.25;
		double rightOut = leftIn + rightIn * 0.25;*/
		
		motorLeft.set(ControlMode.PercentOutput, -0.4);
		motorRight.set(ControlMode.PercentOutput, 0.4);
	}
}



