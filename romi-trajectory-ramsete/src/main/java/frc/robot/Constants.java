// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.geometry.Translation2d;

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
  }

  public static final class AutoConstants {
    public static final double kMaxSpeedMetersPerSecond = 0.8; 
    public static final double kMaxAccelerationMetersPerSecondSquared = 0.8;

    // Reasonable baseline values for a RAMSETE follower in units of meters and seconds
    public static final double kRamseteB = 2;
    public static final double kRamseteZeta = 0.7;
  }

  public static class FieldGeometry {
    public static final Pose2d SLALOM_START = new Pose2d(30, 30, new Rotation2d());
    public static final Pose2d SLALOM_END = new Pose2d(30, 90, new Rotation2d(Math.PI/2));
    public static final Translation2d SLALOM_POINT_1 = new Translation2d(90,60);
    public static final Translation2d SLALOM_POINT_2 = new Translation2d(120,90);
    public static final Translation2d SLALOM_POINT_3 = new Translation2d(250,90);
    public static final Translation2d SLALOM_POINT_4 = new Translation2d(270,60);
    public static final Translation2d SLALOM_POINT_5 = new Translation2d(300,30);
    public static final Translation2d SLALOM_POINT_6 = new Translation2d(330,60);
    public static final Translation2d SLALOM_POINT_7 = new Translation2d(300,90);
    public static final Translation2d SLALOM_POINT_8 = new Translation2d(270,60);
    public static final Translation2d SLALOM_POINT_9 = new Translation2d(240,30);
    public static final Translation2d SLALOM_POINT_10 = new Translation2d(120,30);
    public static final Translation2d SLALOM_POINT_11 = new Translation2d(90,60);
    public static final Translation2d SLALOM_POINT_12 = new Translation2d(60,90);


    public static final Pose2d RED_INNER_POWER_PORT_LOCATION = new Pose2d(15.98 + 0.78, 2.42, new Rotation2d());
    public static final double OUTER_PORT_TO_LINE = 3.04;
//        public static final Pose2d BLUE_OUTER_POWER_PORT_LOCATION = new Pose2d(0, 5.79, new Rotation2d()); // The opponent location is (x: 0, y: 2.4).
//        public static final Pose2d BLUE_INNER_POWER_PORT_LOCATION = new Pose2d(-0.78, 5.79, new Rotation2d()); // The opponent location is (x: -0.78, y: 2.4).

    public static final double PORT_HEIGHT = 2.4;
  } 
}
