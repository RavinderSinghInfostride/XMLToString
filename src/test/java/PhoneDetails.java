public class PhoneDetails {
    private String name;
    private int displaySize;
    private String memory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " displaySize: " + this.displaySize + "Memory: " + this.memory;
    }
}