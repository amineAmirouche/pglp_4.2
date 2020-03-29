package uvsq.pglp_4x2;
import java.util.Stack;

import javax.faces.context.ExceptionHandler;
public class UndoCommand implements Command {
	
	/**
	 * # RECEIVER: historique et commande
	 */
	
	private UndoableCommand lastCommand;
	
	public UndoCommand(Stack<UndoableCommand> historique) {
		ExceptionManip.ControlTaille(historique.size(), 1);
		this.lastCommand = historique.pop();
	}

	@Override
	public void apply() {
		lastCommand.undo();		
	}
}
