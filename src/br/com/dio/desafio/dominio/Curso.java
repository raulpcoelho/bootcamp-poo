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

}
