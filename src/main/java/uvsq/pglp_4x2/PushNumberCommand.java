package uvsq.pglp_4x2;

import java.util.Stack;
public class PushNumberCommand implements UndoableCommand {
	final private Context context;
	final private double value;

	public PushNumberCommand(Context context, double value) {
		this.context = context;
		this.value = value;
	}

	@Override
	public void execute() {
		this.context.pushNumber(this.value);
	}

	@Override
	public void undo() {
		double value = this.context.popNumber();
		if (value != this.value) {
			this.context.pushNumber(value);
			throw new IllegalStateException("Erreur lors de l'annulation de la commande!");
		}
	}
}

