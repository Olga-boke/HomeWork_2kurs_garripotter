public class Puffenduy extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(int magic, int teleport, String fullName) {
        super(magic, teleport, fullName);
    }

    public Puffenduy(int magic, int teleport, String fullName, int diligence, int loyalty, int honesty) {
        super(magic, teleport, fullName);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public void compareStudents(Puffenduy studentSecond){
        int powerOne = this.diligence + this.loyalty + this.honesty;
        int powerTwo = studentSecond.diligence + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne>powerTwo){
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo>powerOne){
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        }else{
            System.out.println(studentSecond.fullName + " такой же сильный, как " + this.fullName);
        }
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент факультета Пуффендуй.Навыки: " +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", magic=" + magic +
                ", teleport=" + teleport +
                ", Имя: " + fullName;
    }
}
