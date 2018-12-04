public class TemperatureConverter {
  // Celsisus
  // Fahrenheit
  // Kelvin

  String inputUnit;
  String outputUnit;
  double inputValue;
  double outputValue;

  public double selectUnitsOfConversion(String inputUnit, String outputUnit) {
    return 0.0;
  }

  // F = C * (9/5) + 32
  public double celsiusToFahrenheit(double input) {
    return input * (9/5) + 32;
  }

  // C = (F - 32) * (9/5)
  public double fahrenheitToCelsius(double input) {
    return (input - 32) * (9/5);
  }

  // K = C + 273.15
  public double celsiusToKelvin(double input) {
    return input + 273.15;
  }

  // C = K - 273.15
  public double kelvinToCelsius(double input) {
    return 0.0;
  }

  // K = (F + 459.67) * (5/9)
  public double fahrenheitToKelvin(double input) {
    return (input + 459.67) * (5/9);
  }

  // F = K * (9/5) - 459.67
  public double kelvinToFahrenheit(double input) {
    return input * (9/5) - 459.67;
  }

}
