// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.TimedRobot;
 

public class Robot extends TimedRobot {
  private final Joystick m_stick = new Joystick(0);

  // DoubleSolenoid corresponds to a double solenoid.
  private final DoubleSolenoid m_doubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);

  static final int kDoubleSolenoidForwardButton = 2;
  static final int kDoubleSolenoidReverseButton = 3;

  @Override
  public void robotInit() {}

  @Override
  public void teleopPeriodic() {
    /*
     * GetRawButtonPressed will only return true once per press.
     * If a button is pressed, set the solenoid to the respective channel.
     */
    if (m_stick.getRawButtonPressed(kDoubleSolenoidForwardButton)) {
      m_doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    } else if (m_stick.getRawButtonPressed(kDoubleSolenoidReverseButton)) {
      m_doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
   }
}
