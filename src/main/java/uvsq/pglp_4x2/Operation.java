package uvsq.pglp_4x2;

public enum Operation {
	PLUS("+"){

		@Override
		public double eval(double x, double y) {
			return x + y;
		}

	}, 

	MOINS("-"){

		@Override
		public double eval(double x, double y) {
			return x - y;
		}

	},

	MULT("*"){

		@Override
		public double eval(double x, double y) {
			return x * y;
		}

	},

	DIV("/"){

		@Override
		public double eval(double x, double y) {
			if(y == 0) {
				throw new IllegalArgumentException();
			}
			return x / y;
		}

	};

	private String symbole;

	/**
	 * Initialisation de l'opération
	 * @param symbole
	 */
	private Operation(String symbole) {
		this.symbole = symbole; 
	}

	/**
	 * méthode d'évaluation abstraite (redéfinie pour chaque opération).
	 * @param x
	 * @param y
	 * @return
	 */
	public abstract double eval(double x , double y);

	/**
	 * récupération du symbole de l'opération 
	 * @return the symbole
	 */
	public String getSymbole() {
		return symbole;
	}


}

