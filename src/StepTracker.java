import java.util.Scanner;

public class StepTracker {
	Scanner scanner;

	MonthData[] monthToData = new MonthData[12];

	int goalByStepsPerDay = 10000;

	Converter converter = new Converter();
	MonthData monthData = new MonthData();

	StepTracker(Scanner scan) {
		scanner = scan;

		for (int i = 0; i < monthToData.length; i++) {
			monthToData[i] = new MonthData();
		}
	}
		void addNewNumberStepsPerDay() {

			System.out.println("Введите номер месяца");
			int month = scanner.nextInt(); // ввод и проверка номера месяца
			if (month < 1 || month > 12) {
				System.out.println("Введено некорректное значение");
				return;
			}

			System.out.println("Введите день");
			int day = scanner.nextInt(); // ввод и проверка дня
			if (day < 1 || day > 31) {
				System.out.println("Введено некорректное значение");
				return;
			}

			System.out.println("Введите количество шагов");
			int steps = scanner.nextInt(); // ввод и проверка количества шагов
			if (steps < 0) {
				System.out.println("Введено некорректное значение");
				return;
			}

			MonthData monthData = monthToData[month - 1]; // получение соответствующего объекта MonthData из массива
			monthData.days[day - 1] = steps; // сохранение полученных данных
	    }

		void changeStepGoal() {
			int steps = scanner.nextInt();
			if (steps < 0) {
				System.out.println("Введено некорректное значение");
			} else {
				goalByStepsPerDay = steps;
			}
	    }

		void printStatistic() {
			System.out.println("Введите число месяца");
			int month = scanner.nextInt(); // ввод и проверка номера месяца
			if (month < 1 || month > 12) {
			System.out.println("Введено некорректное значение");
				return;
			}

			monthData = monthToData[month - 1]; // получение соответствующего месяца //
			int	sumSteps = monthData.sumStepsFromMonth(); // получение суммы шагов за месяц
			System.out.println("Количество пройденных шагов по дням:"); // вывод общей статистики по дням
			monthData.printDaysAndStepsFromMonth();
			System.out.println("Общее количество шагов за месяц: " + monthData.sumStepsFromMonth()); // вывод суммы шагов за месяц
			System.out.println("Максимальное количество шагов в месяце: " + monthData.maxSteps()); // вывод максимального пройденного количества шагов за месяц
			System.out.println("Среднее количество шагов за месяц: " + monthData.averageValue(sumSteps)); // вывод среднего пройденного количества шагов за месяц
			System.out.println("За месяц пройдено: " + converter.convertToKm(sumSteps) + " км"); // вывод пройденной за месяц дистанции в километрах
			System.out.println("За месяц сожжено: " + converter.convertStepsToKilocalories(sumSteps) + " ККал"); // вывод количества сожжённых килокалорий за месяц
			System.out.println("Лучшая серия: максимальное количество подряд идущих дней, " +
					"в течение которых количество шагов за день было равно или выше целевого: " +
					monthData.bestSeries(goalByStepsPerDay)); // вывод лучшей серии
			System.out.println(); // дополнительный перенос строки
		}
	}







