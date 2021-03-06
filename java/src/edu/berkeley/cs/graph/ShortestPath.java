package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Stack;

public class ShortestPath {
  private Edge[] edgeTo;
  private double[] distTo;

  public ShortestPath(Graph graph, int s) {
    // TODO: complete this function
  }

  public double distTo(int v) {
    return distTo[v];
  }

  public boolean hasPathTo(int v) {
    return distTo[v] < Integer.MAX_VALUE;
  }

  public Iterable<Edge> pathTo(int v) {
    if (!hasPathTo(v)) {
      return null;
    }

    Stack<Edge> stack = new Stack<>();

    Edge edge = edgeTo[v];
    while (edge != null) {
      stack.push(edge);
      edge = edgeTo[edge.to()];
    }

    return stack;
  }
}
