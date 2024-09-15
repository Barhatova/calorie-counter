public class MonthData {

	int[] days = new int[30];

	void printDaysAndStepsFromMonth() {
		for (int i = 0; i < days.length; i++) {
			System.out.println((i + 1) + " день:" + days[i]); // вывод элементов массива в нужном формате
		}
	}

	int sumStepsFromMonth() {
		int sumSteps = 0;
		for (int i = 0; i < days.length; i++) {
			sumSteps = sumSteps + days[i]; // подсчёт суммы элементов массива days[]
		}
		return sumSteps;
	}

	int maxSteps() {
		int maxSteps = 0;
		for (int i = 0; i < days.length; i++) {
			if (days[i] > maxSteps) { // поиск максимального элемента
				maxSteps = days[i];
			}
		}
		return maxSteps;
	}

	int bestSeries(int goalByStepsPerDay) {
		int currentSeries = 0;
		int finalSeries = 0;
		for (int i = 0; i < days.length; i++) {
			if (days[i] >= goalByStepsPerDay) { // поиск максимальной серии
				currentSeries = currentSeries + 1;
				if (currentSeries > finalSeries) {
					finalSeries = currentSeries;
				}
			} else {
				currentSeries = 0;
				}
			}
			return finalSeries;
	}

	int averageValue(int sumSteps) {
		int averageValueSteps = sumSteps / days.length;
		return averageValueSteps;
	}
}








