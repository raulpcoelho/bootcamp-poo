package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
        super();
        this.data = LocalDate.now();
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", data=" + data + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((data == null) ? 0 : data.hashCode());
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
        Mentoria other = (Mentoria) obj;
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
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

    

}
