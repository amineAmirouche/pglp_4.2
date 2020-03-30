package uvsq.pglp_4x2;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Interpreteur {
	private final Map<String, Command> commands;
	private final Context context;
	private final Stack<UndoableCommand> historique;

	// Le constructeur doit être visible par les classes filles (donc protected ou public)
	protected Interpreteur() {
		this.commands = new HashMap<>();
		this.context = new Context();
		this.historique = new Stack<>();

		registerCommand("undo", new UndoCommand(historique));
		registerCommand("exit", new ExitCommand());
	}

	final protected void registerCommand(String s, Command command) {
		this.commands.put(s, command);
	}

	protected Command getCommand(String s) {
		if (this.commands.containsKey(s)) {
			return this.commands.get(s);
		}
		return null;
	}

	final public Context getContext() {
		return context;
	}

	public void executeCommand(String name) {
		Command c = this.getCommand(name);
		if (c == null) {
			throw new IllegalArgumentException("La commande " + name + " n'est pas recconnue.");
		}
		c.execute();
		if (c instanceof UndoableCommand) {
			this.historique.push((UndoableCommand) c);
		} else {
			// une commande non annulable : donc on ne peut aller plus loin dans l'historique
			this.historique.clear();
		}
	}
}