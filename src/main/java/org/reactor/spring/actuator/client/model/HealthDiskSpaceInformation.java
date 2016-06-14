package org.reactor.spring.actuator.client.model;

/**
 * @author grabslu
 */
public class HealthDiskSpaceInformation {

  private String status;
  private long total;
  private long free;
  private long threshold;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

  public long getFree() {
    return free;
  }

  public void setFree(long free) {
    this.free = free;
  }

  public long getThreshold() {
    return threshold;
  }

  public void setThreshold(long threshold) {
    this.threshold = threshold;
  }
}
