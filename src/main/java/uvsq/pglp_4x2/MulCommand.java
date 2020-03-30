package uvsq.pglp_4x2;



public class MulCommand extends OperationCommand {
	public MulCommand(Context context) {
		super(context);
	}

	@Override
	public void execute() {
		double total = this.getContext().getTotal();
		double value = this.getContext().popNumber();
		this.getContext().setTotal(total * value);
		this.rememberContext(total, value);
	}
}

