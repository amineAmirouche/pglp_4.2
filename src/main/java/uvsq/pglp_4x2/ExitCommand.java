package uvsq.pglp_4x2;
import java.util.Stack;


public class ExitCommand implements Command {
	@Override
	public void execute() {
		System.exit(0);
	}
}
