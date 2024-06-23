import javax.xml.crypto.Data;
package br.com.desafio;

public class Mentoria {

    private String titulo;
    private String descrição;
    private Data data;

    
    public Mentoria(String titulo, String descrição, Data data) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.data = data;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescrição() {
        return descrição;
    }


    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }


    public Data getData() {
        return data;
    }


    public void setData(Data data) {
        this.data = data;
    }

    

}
