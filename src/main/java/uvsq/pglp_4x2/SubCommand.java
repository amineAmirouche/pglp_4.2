package uvsq.pglp_4x2;

public class SubCommand extends OperationCommand {
	public SubCommand(Context context) {
		super(context);
	}

	@Override
	public void execute() {
		double total = this.getContext().getTotal();
		double value = this.getContext().popNumber();
		this.getContext().setTotal(value - total);
		this.rememberContext(total, value);
	}
}
