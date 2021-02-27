// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    
    //Ks -- from Characterization
    public static final double ksVolts = 0.957;

    //Kv -- from Characterization
    public static final double kvVoltSecondsPerMeter = 6.44;
    
    // Ka -- from Characterization
    public static final double kaVoltSecondsSquaredPerMeter = 0.0389;
    public static final double kPDriveVel = 0.085;

    // Track Width -- from Characterization
    public static final double kTrackwidthMeters = 0.142072613; 
    public static final DifferentialDriveKinematics kDriveKinematics =
        new DifferentialDriveKinematics(kTrackwidthMeters);

    // Look at the http://wpilib.local  to find the current voltage and put that 
    // in here
    public static final double kBatteryVoltage = 8;
  }

  public static final class AutoConstants {
    public static final double kMaxSpeedMetersPerSecond = 0.8; 
    public static final double kMaxAccelerationMetersPerSecondSquared = 0.8;

    // Reasonable baseline values for a RAMSETE follower in units of meters and seconds
    public static final double kRamseteB = 2;
    public static final double kRamseteZeta = 0.7;
  }
}
