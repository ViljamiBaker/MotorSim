public class Motor {
    double theta;
    double omega;
    double alpha;

    public Motor(double theta,double omega,double alpha){
        this.theta = theta;
        this.omega = omega;
        this.alpha = alpha;
    }

    public void update(double deltaTime){
        omega += alpha * deltaTime;
        theta += omega * deltaTime;
    }

    @Override
    public String toString(){
        return String.format("Theta: %.2f, Omega: %.2f, Alpha: %.2f",theta,omega,alpha);
    }

    public static void main(String[] args) throws Exception {
        Motor motor = new Motor(0, -1, 1);

        for (int i = 0; i < 100; i++) {
            motor.update(1.0/60.0);
            System.out.println("Time: " + i + " " + motor.toString());
        }
    }
}
