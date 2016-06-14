package org.reactor.spring.actuator.client.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author grabslu
 */
public class MetricsInformation {

  @SerializedName("mem")
  private long memoryTotal;

  @SerializedName("mem.free")
  private long memoryFree;

  private int processors;

  public long getMemoryTotal() {
    return memoryTotal;
  }

  public void setMemoryTotal(long memoryTotal) {
    this.memoryTotal = memoryTotal;
  }

  public long getMemoryFree() {
    return memoryFree;
  }

  public void setMemoryFree(long memoryFree) {
    this.memoryFree = memoryFree;
  }

  public int getProcessors() {
    return processors;
  }

  public void setProcessors(int processors) {
    this.processors = processors;
  }
}
