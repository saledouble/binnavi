/*
Copyright 2011-2016 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.GraphWindows.Implementations;


import com.google.common.base.Preconditions;
import com.google.security.zynamics.binnavi.yfileswrap.zygraph.ZyGraph;

/**
 * Contains methods for freezing and unfreezing a graph.
 */
public final class CGraphFreezer {
  /**
   * You are not supposed to instantiate this class.
   */
  private CGraphFreezer() {
  }

  /**
   * Toggles the state of Frozen/Editable in the graph.
   *
   * @param graph Graph to be frozen or unfrozen.
   */
  public static void toogleProximityFrozen(final ZyGraph graph) {
    Preconditions.checkNotNull(graph, "IE01739: Graph argument can not be null");

    graph.getSettings().getProximitySettings().setProximityBrowsingFrozen(
        !graph.getSettings().getProximitySettings().getProximityBrowsingFrozen());
  }
}
