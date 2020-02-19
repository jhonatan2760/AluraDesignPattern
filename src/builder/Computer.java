package src.builder;

public class Computer {

    private String name;
    private int storage;

    public String getName(){
        return this.name;
    }

    public int getStorage(){
        return this.storage;
    }

    private Computer(ComputerBuilder builder){
        this.name = builder.name;
        this.storage = builder.storage;
    }

    public static class ComputerBuilder {

        private String name;
        private int storage;

        public ComputerBuilder(){
            
        }

        public ComputerBuilder withName(String name){
            this.name = name;
            return this;
        }

        public ComputerBuilder withStorage(int storage){
            this.storage = storage;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }


}