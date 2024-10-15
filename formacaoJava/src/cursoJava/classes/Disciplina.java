package cursoJava.classes;

/*
 * Essa CLASSE disciplina servirá para todos os OBJETOS e INSTÂNCIAS de notas e disciplinas.
 */
public class Disciplina {

    private double nota;
    private String disciplina;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(nota);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disciplina other = (Disciplina) obj;
        if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
            return false;
        if (disciplina == null) {
            if (other.disciplina != null)
                return false;
        } else if (!disciplina.equals(other.disciplina))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
    }

}
