package br.com.desafio;
import java.time.LocalDate;


import br.com.desafio.Mentoria;
import br.com.desafio.Curso;



public class Principal {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrição("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescrição("Descrição curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria curso java e js");
        mentoria.setDescrição("Descrição mentoria curso java e js");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);



    }

}
