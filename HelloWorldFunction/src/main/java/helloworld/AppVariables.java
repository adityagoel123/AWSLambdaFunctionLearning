package helloworld;

public class AppVariables {

    private Double instanceVariable = Math.random();
    private static Double sampleStaticVariable = Math.random();

    public AppVariables() {
        System.out.println("Inside constructor.");
    }

    static {
        System.out.println("Static Block executed.");
    }

    public void coldStatrtBasics() {
        Double localVariable = Math.random();
        System.out.println("Instance variable: " + instanceVariable +
                           "Static variable: " + sampleStaticVariable +
                           "Instance variable: " + localVariable);
    }

}


