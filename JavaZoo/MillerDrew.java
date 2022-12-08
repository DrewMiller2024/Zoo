public class MillerDrew extends Animal {
    private String color;
    private int legs;
    private String studentName;

    public MillerDrew() {
        this.studentName = "MillerDrew";
        this.color = "blue";
        this.legs = 10;
    }

    /**
     * Getter for color
     */
    public String getColor() {
        return this.color;
    }

    /** 
     * Setter for color
     * 
     * @param color New color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for legs
     */
    public int getLegs() {
        return this.legs;
    }

    /** 
     * Setter for legs
     * 
     * @param legs New number of legs
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /** 
     * Getter for studentName
     * 
     * @return The student name
     */
    public String getStudentName() {
        return this.studentName;
    }

    /**
     * What does the animal say?  Descendant classes should override this
     * method or default speak will generate "Yaba-daba-doo"
     */
    public String speak() {
        return "beya-beya";
    }

    /**
     * This will return a String that describes the animal's general disposition.
     * Sample dispositions could be "mean" or "friendly".  Use different adjectives
     * in your method. The default disposition is "meh"
     * 
     * @return Disposition
     */
    public String getDisposition() {
        return "I can fly to catch flies. HAHA!!";
    }

    /**
     * This will return the type of animal (i.e. "Dog", "Cat", etc)
     * 
     * @return The type of the animal
     */
    public String getType() {
        return "WingedGecko";
    }

    /**
     * This will return the animal's name. What's the default name?
     * 
     * @return The name of the animal (i.e. "Fido", "Rover")
     */
    public String getName() {
        return "Mr. Bellinger";
    }

    /**
     * toString() is a method that all Java classes implement.  It's where you can 
     * generate a string that describes the object.  You should not override this
     * method unless you know what you're doing
     */
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("");
        buffer.append("It is a "+this.getType()+"\n");
        buffer.append("Its name is "+this.getName()+", it is "+this.getColor()+" with "+this.getLegs()+" legs\n");
        buffer.append("Its disposition is "+this.getDisposition()+" and it says "+this.speak()+"\n");
        return buffer.toString();
    }

}