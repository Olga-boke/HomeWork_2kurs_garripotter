public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(int magic, int teleport, String fullName) {
        super(magic, teleport, fullName);

    }

    public Griffindor(int magic, int teleport, String fullName, int nobility, int honor, int bravery) {
        super(magic, teleport, fullName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public void compareStudents(Griffindor studentSecond){
        int powerOne = this.nobility + this.honor + this.bravery;
        int powerTwo = studentSecond.honor + studentSecond.bravery + studentSecond.nobility;
        if (powerOne>powerTwo){
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo>powerOne){
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        }else{
            System.out.println(studentSecond.fullName + " такой же сильный, как " + this.fullName);
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return " Студент факультета Гриффиндор. Навыки: " +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", magic=" + magic +
                ", teleport=" + teleport +
                ", Имя: " + fullName;
    }
}

