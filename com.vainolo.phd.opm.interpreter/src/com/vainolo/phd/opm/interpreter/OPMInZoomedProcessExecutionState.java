package com.vainolo.phd.opm.interpreter;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.vainolo.phd.opm.model.OPMProcess;

class OPMInZoomedProcessExecutionState {
  // private Map<OPMProcess, OPMExecutableInstance> processToInstanceMapping =
  // Maps.newHashMap();
  private Map<OPMExecutableInstance, OPMProcess> instanceToProcessMapping = Maps.newHashMap();
  private List<OPMExecutableInstance> readyInstances = Lists.newArrayList();
  private List<OPMExecutableInstance> waitingInstances = Lists.newArrayList();

  private void addProcessToInstanceMapping(OPMProcess process, OPMExecutableInstance instance) {
    // processToInstanceMapping.put(process, instance);
    instanceToProcessMapping.put(instance, process);
  }

  public void addWaitingInstance(OPMProcess process, OPMExecutableInstance instance) {
    waitingInstances.add(instance);
    addProcessToInstanceMapping(process, instance);
  }

  public void addReadyInstance(OPMProcess process, OPMExecutableInstance instance) {
    readyInstances.add(instance);
    addProcessToInstanceMapping(process, instance);
  }

  public List<OPMExecutableInstance> getWaitingInstances() {
    return Collections.unmodifiableList(waitingInstances);
  }

  public List<OPMExecutableInstance> getReadyInstances() {
    return Collections.unmodifiableList(readyInstances);
  }

  public void makeWaitingInstanceReady(OPMExecutableInstance instance) {
    waitingInstances.remove(instance);
    readyInstances.add(instance);
  }

  public void makeWaitingInstancesReady(Set<OPMExecutableInstance> instances) {
    for(OPMExecutableInstance instance : instances) {
      makeWaitingInstanceReady(instance);
    }
  }

  public void makeReadyInstanceWaiting(OPMExecutableInstance instance) {
    readyInstances.remove(instance);
    waitingInstances.add(instance);
  }

  public OPMProcess getProcess(OPMExecutableInstance instance) {
    return instanceToProcessMapping.get(instance);
  }

  public void removeReadyInstance(OPMExecutableInstance instance) {
    OPMProcess process = instanceToProcessMapping.get(instance);
    // processToInstanceMapping.remove(process);
    instanceToProcessMapping.remove(instance);
    readyInstances.remove(instance);
  }

  public void removeWaitingInstance(OPMExecutableInstance instance) {
    OPMProcess process = instanceToProcessMapping.get(instance);
    // processToInstanceMapping.remove(process);
    instanceToProcessMapping.remove(instance);
    waitingInstances.remove(instance);
  }

  // public boolean isProcessWaitingOrReady(OPMProcess process) {
  // return processToInstanceMapping.containsKey(process);
  // }

  public boolean areThereWaitingOrReadyInstances() {
    return areThereWaitingInstances() || areThereReadyInstances();
  }

  public boolean areThereReadyInstances() {
    return readyInstances.size() > 0;
  }

  public boolean areThereWaitingInstances() {
    return waitingInstances.size() > 0;
  }

  public List<OPMProcess> getWaitingProcesses() {
    List<OPMProcess> ret = Lists.transform(getWaitingInstances(), new TransformInstanceToProcess());
    return ret;
  }

  public List<OPMProcess> getReadyProcesses() {
    List<OPMProcess> ret = Lists.transform(getReadyInstances(), new TransformInstanceToProcess());
    return ret;
  }

  private class TransformInstanceToProcess implements Function<OPMExecutableInstance, OPMProcess> {
    @Override
    public OPMProcess apply(OPMExecutableInstance input) {
      return getProcess(input);
    }
  }

}