public class Kogtevran extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(int magic, int teleport, String fullName) {
        super(magic, teleport, fullName);
    }

    public Kogtevran(int magic, int teleport, String fullName, int intelligence, int wisdom, int wit, int creativity) {
        super(magic, teleport, fullName);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public void compareStudents(Kogtevran studentSecond){
        int powerOne = this.intelligence + this.wisdom + this.wit + this.creativity;
        int powerTwo = studentSecond.intelligence + studentSecond.wisdom + studentSecond.wit + studentSecond.creativity;
        if (powerOne>powerTwo){
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo>powerOne){
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        }else{
            System.out.println(studentSecond.fullName + " такой же сильный, как " + this.fullName);
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Студент факультета Когтевран. Навыки: " +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", magic=" + magic +
                ", teleport=" + teleport +
                ", Имя: " + fullName;
    }
}
