package uvsq.pglp_4x2;

public class QuitCommand implements Command {
	
	/** # RECEVEUR: Switch **/
	
	private Switch i;
	
	public QuitCommand(Switch i) {
		this.i = i;
	}

	@Override
	public void apply() {
		i.turnOff();
	}
}
