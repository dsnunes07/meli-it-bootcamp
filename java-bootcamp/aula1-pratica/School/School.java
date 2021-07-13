public class School {

    public List<Estudante> criaEstudantes(int n) {
        List<Estudante> estudantes = new ArrayList<>();
        int i = 0;
        while (i < n) {
            Estudante e = new Estudante("Estudante " + i, 15, (int) Math.random() * 1000, 7);
            estudantes.add(e);
        }
    }

    public static void main(String[] args) {
        School s = new School();

    }
}