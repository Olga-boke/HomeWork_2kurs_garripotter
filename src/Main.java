public class Main {
    public static void main(String[] args) {
        Griffindor germiona = new Griffindor(10, 5, "Гермиона Грейнджер", 11, 8, 5);
        Griffindor garri = new Griffindor(7, 5,"Гарри Поттер", 11, 5, 15);
        Griffindor ron = new Griffindor(2, 3, "Рон Уизли", 2, 5, 11);
        Puffenduy sedrik = new Puffenduy(2, 5,"Седрик Дигорри",5,5,7 );
        Puffenduy zaxariya = new Puffenduy(4,6,"Захария Смитт",5,6,2);
        Kogtevran choy = new Kogtevran(2,6,"Чжоу Чанг",2,6,1,1);
        Kogtevran palumna = new Kogtevran(2,6,"Палумна Лагвуд",2,6,4,1);
        Slizirin drako = new Slizirin(4,8,"Драко Малфой",5,6,6,1,1);
        Slizirin krab =new Slizirin(1,1,"Крэб Гоил", 1,1,1,1,1);
        System.out.println(garri);
        System.out.println(drako);
        System.out.println(sedrik);
        garri.compareStudents(ron);
        Hogwarts.compareStudents(garri,drako);
        sedrik.compareStudents(zaxariya);
        Hogwarts.compareStudents(sedrik,palumna);

    }
}