package uvsq.pglp_4x2;

import java.util.Stack;

public class Context {
	private final Stack<Double> pile;
	private Double total;

	public Context() {
		super();
		this.pile = new Stack<Double>();
		this.total = null;
	}

	final public double getTotal() {
		if (total == null) {
			total = this.popNumber();
		}
		return total;
	}

	public double popNumber() {
		if (pile.isEmpty()) {
			throw new IllegalStateException("Pas de nombres dans la pile");
		}
		return pile.pop().doubleValue();
	}

	public void pushNumber(double d) {
		pile.push(Double.valueOf(d));
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
