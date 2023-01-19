public class BmiService {
    public double calculate(double weight, double height) {
        double BodyMassIndex = weight / (height * height);

        return BodyMassIndex;

    }

}

