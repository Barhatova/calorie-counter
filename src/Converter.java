public class Converter {

	static final double STEP_LENGHT_KM = 0.00075;
	static final double STEP_ENERGY_KCAL = 0.05;

	double convertToKm(int sumSteps) {
		double distance = sumSteps * STEP_LENGHT_KM; // перевод количества шагов в километры
		return distance;
	}

	double convertStepsToKilocalories(int sumSteps) {
		double amountOfCaloriesSteps = sumSteps * STEP_ENERGY_KCAL; // перевод количества шагов в килокалории
		return amountOfCaloriesSteps;
	}
}

