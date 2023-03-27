public class Calculate {
  public static String bmi(double weight, double height) {
    var bmi = weight / height / height;
    return bmi <= 18.5 ? "Underweight" : bmi <= 25.0 ? "Normal" : bmi <= 30.0 ? "Overweight" : "Obese";
  }
}