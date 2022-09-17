public class Slizirin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slizirin(int magic, int teleport, String fullName) {
        super(magic, teleport, fullName);
    }

    public Slizirin(int magic, int teleport, String fullName, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(magic, teleport, fullName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }
    public void compareStudents(Slizirin studentSecond){
        int powerOne = this.cunning+ this.determination + this.ambition + this.resourcefulness + this.power;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambition + studentSecond.resourcefulness + studentSecond.power;
        if (powerOne>powerTwo){
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo>powerOne){
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        }else{
            System.out.println(studentSecond.fullName + " такой же сильный, как " + this.fullName);
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Студент факультета Слизирин. Навыки: " +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                ", magic=" + magic +
                ", teleport=" + teleport +
                ", Имя: " + fullName;
    }
}
