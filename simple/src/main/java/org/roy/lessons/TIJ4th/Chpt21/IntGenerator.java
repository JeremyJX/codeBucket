package org.roy.lessons.TIJ4th.Chpt21;

public abstract class IntGenerator {
	private volatile boolean canceled = false;
	  public abstract int next();
	  // Allow this to be canceled:
	  public void cancel() { canceled = true; }
	  public boolean isCanceled() { return canceled; }
}
