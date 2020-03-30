package uvsq.pglp_4x2;


public class AddCommand extends OperationCommand {
	public AddCommand(Context context) {
		super(context);
	}

	@Override
	public void execute() {
		double total = this.getContext().getTotal();
		double value = this.getContext().popNumber();
		this.getContext().setTotal(total + value);
		this.rememberContext(total, value);
	}
}

