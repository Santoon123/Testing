public class FinancialForecast {
      public static double forecastFutureValue(double initialAmount, double growthRate, int periods) {
            if (periods == 0) {
                  return initialAmount;
            }
            return forecastFutureValue(initialAmount, growthRate, periods - 1) * (1 + growthRate);
      }

      public static void main(String[] args) {
            double initialAmount = 1000.0;
            double growthRate = 0.05;
            int periods = 5;
            double futureValue = forecastFutureValue(initialAmount, growthRate, periods);
            System.out.println("Future Value after " + periods + " periods: $" + futureValue);
      }
}
