package src.builder;

public class ComputerTestBuilder {

    public static void main (String [] args){
        Computer pc = new Computer.ComputerBuilder()
                                        .withName("Pentium Dual Core")
                                        .withStorage(256).build();

        System.out.println(pc.getName());
    }

}