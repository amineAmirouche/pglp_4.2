package uvsq.pglp_4x2;



public class ExceptionManip {
		
		private static final double MIN_VALUE = 100000;
		private static final double MAX_VALUE = 100000;
		
		public void handleMinMax(double nb) {
			if(nb > MAX_VALUE || nb < -MIN_VALUE) {
				throw new MinMaxException();
			}
		}
		
		public static void ControlTaille(int tailleActuel, int tailleVoulu) {
			if(tailleActuel < tailleVoulu) {
				throw new ArgumentPileException();
			}
		}

	}

