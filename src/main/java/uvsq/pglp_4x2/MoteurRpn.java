package uvsq.pglp_4x2;
import java.util.Scanner;


public class MoteurRpn extends Interpreteur {
	public MoteurRpn() {
		super();
		this.registerCommand("+", new AddCommand(this.getContext()));
		this.registerCommand("-", new SubCommand(this.getContext()));

		Command mul = new MulCommand(this.getContext());
		this.registerCommand("x", mul);
		this.registerCommand("X", mul);
		this.registerCommand("*", mul);
	}

	@Override
	protected Command getCommand(String s) {
		Command c = super.getCommand(s);
		if (c == null) {
			try {
				double d = Double.parseDouble(s);
				c = new PushNumberCommand(this.getContext(), d);
			} catch (NumberFormatException e) {
				return null;
			}
		}
		return c;
	}
}

