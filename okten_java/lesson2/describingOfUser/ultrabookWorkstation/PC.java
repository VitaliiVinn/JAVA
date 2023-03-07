package okten_java.lesson2.describingOfUser.ultrabookWorkstation;

public class PC {
    private int memory;
    private int screenSize;
    private String processor;

    public PC(int memory, int screenSize, String processor) {
        this.memory = memory;
        this.screenSize = screenSize;
        this.processor = processor;
    }
    public PC(){

    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    @Override
    public String toString(){
        return "\nComputerGadget {" +
                "memory: " + memory +
                "\n'screensize: " + screenSize +
                "\n'processor: " + processor + "\n}";
    }
}
