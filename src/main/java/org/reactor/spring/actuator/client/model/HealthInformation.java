package org.reactor.spring.actuator.client.model;

/**
 * @author grabslu
 */
public class HealthInformation {

  private String status;
  private HealthDatabaseInformation db;
  private HealthDiskSpaceInformation diskSpace;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HealthDatabaseInformation getDb() {
    return db;
  }

  public void setDb(HealthDatabaseInformation db) {
    this.db = db;
  }

  public HealthDiskSpaceInformation getDiskSpace() {
    return diskSpace;
  }

  public void setDiskSpace(HealthDiskSpaceInformation diskSpace) {
    this.diskSpace = diskSpace;
  }
}
