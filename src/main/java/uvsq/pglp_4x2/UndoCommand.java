package uvsq.pglp_4x2;
import java.util.Stack;


public class UndoCommand implements Command {
	private final Stack<UndoableCommand> historique;

	public UndoCommand(Stack<UndoableCommand> historique) {
		this.historique = historique;
	}

	@Override
	public void execute() {
		if (historique.isEmpty()) {
			throw new IllegalStateException("Pas de commande à annuler!");
		}
		historique.pop().undo();
	}
}
