public abstract class Hogwarts {
     int magic;
     int teleport;
     String fullName;

    public static void compareStudents(Hogwarts studentFirst, Hogwarts studentSecond){
       int powerOne = studentFirst.magic + studentFirst.teleport;
       int powerTwo = studentSecond.magic + studentSecond.teleport;
       if (powerOne>powerTwo){
           System.out.println(studentFirst.fullName + " сильнее чем " + studentSecond.fullName);
       } else if (powerTwo>powerOne){
           System.out.println(studentSecond.fullName + " сильнее чем " + studentFirst.fullName);
       }else{
           System.out.println(studentSecond.fullName + " такой же сильный, как " + studentFirst.fullName);
       }
    }

    public Hogwarts(int magic, int teleport, String fullName) {
        this.magic = magic;
        this.teleport = teleport;
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (teleport <0 || teleport >100){
        throw new RuntimeException("Введено неверное значение");
    }
        this.magic = magic;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setTeleport(int teleport) {
        if (teleport <0 || teleport >100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.teleport = teleport;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
