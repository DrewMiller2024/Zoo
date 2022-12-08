public class MillerDrew extends Animal {
    private String color;
    private int legs;
    private String studentName;

    public MillerDrew() {
        this.studentName = "MillerDrew";
        this.color = "green";
        this.legs = 10;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getLegs() {
        return this.legs;
    }


    @Override
    public String getStudentName() {
        return this.studentName;
    }

    @Override
    public String speak() {
        return "beya-beya";
    }

    @Override
    public String getDisposition() {
        return "savage";
    }

    @Override
    public String getType() {
        return "Winged Gecko";
    }

    @Override
    public String getName() {
        return "Mr. Bellinger";
    }

}