package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    public Curso() {
        super();
        this.cargaHoraria = 0;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria="
                + this.cargaHoraria + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + cargaHoraria;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (super.getTitulo() == null) {
            if (other.getTitulo() != null)
                return false;
        } else if (!super.getTitulo().equals(other.getTitulo()))
            return false;
        if (super.getDescricao() == null) {
            if (other.getDescricao() != null)
                return false;
        } else if (!super.getDescricao().equals(other.getDescricao()))
            return false;
        if (this.cargaHoraria != other.cargaHoraria)
            return false;
        return true;
    }

    

}
