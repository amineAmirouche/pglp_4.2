package uvsq.pglp_4x2;
import java.util.Stack;




abstract public class OperationCommand implements UndoableCommand {
	final private Context context;
	final private Stack<HistoryRow> history;

	private static class HistoryRow {
		Double total;
		Double valueOnTopOfStack;
		public HistoryRow(Double total, Double valueOnTopOfStack) {
			this.total = total;
			this.valueOnTopOfStack = valueOnTopOfStack;
		}
	}

	public OperationCommand(Context context) {
		this.context = context;
		this.history = new Stack<HistoryRow>();
	}

	final public Context getContext() {
		return this.context;
	}

	protected void rememberContext(Double total, Double valueOnTopOfStack) {
		history.push(new HistoryRow(total, valueOnTopOfStack));
	}

	@Override
	public void undo() {
		if (history.isEmpty()) {
			throw new IllegalStateException("La commande ne peut pas être annulée");
		}
		// restoration du context
		HistoryRow v = history.pop();
		this.getContext().setTotal(v.total);
		if (v.valueOnTopOfStack != null) {
			this.getContext().pushNumber(v.valueOnTopOfStack);
		}
	}
}
