/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ex05;

import ex04.entities.Livro;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 29/03/2024
 * @brief Class Program
 */
public class TestarLivros {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Livro livroFavorito = new Livro();

        /* // Opção para solicitar os dados ao usuário
        
        System.out.println("Informe o título do livro");
        livroFavorito.setTitulo(sc.nextLine());
        System.out.println("Quantas páginas tem o livro?");
        livroFavorito.setQtdPaginas(sc.nextInt());
        System.out.println("Quantas páginas você já leu?");
        livroFavorito.setPaginasLidas(sc.nextInt());
         */
        livroFavorito.setTitulo("O Pequeno Príncipe");
        livroFavorito.setQtdPaginas(98);
        System.out.println("O livro "
                + livroFavorito.getTitulo()
                + " possui " + livroFavorito.getQtdPaginas()
                + " páginas.");
        livroFavorito.setPaginasLidas(20);
        livroFavorito.verificarProgresso();
        livroFavorito.setPaginasLidas(50);
        livroFavorito.verificarProgresso();
        System.out.println();

        Livro novoLivro1 = new Livro();
        novoLivro1.setTitulo("Memórias Póstumas de Brás Cubas");
        novoLivro1.setQtdPaginas(160);
        System.out.println("O livro "
                + novoLivro1.getTitulo()
                + " possui " + novoLivro1.getQtdPaginas()
                + " páginas.");
        novoLivro1.setPaginasLidas(78);
        novoLivro1.verificarProgresso();
        novoLivro1.setPaginasLidas(230);
        novoLivro1.verificarProgresso();
        System.out.println();

        Livro novoLivro2 = new Livro();
        novoLivro2.setTitulo("Dom Casmurro");
        novoLivro2.setQtdPaginas(240);
        System.out.println("O livro "
                + novoLivro2.getTitulo()
                + " possui " + novoLivro2.getQtdPaginas()
                + " páginas.");
        novoLivro2.setPaginasLidas(130);
        novoLivro2.verificarProgresso();
        novoLivro2.setPaginasLidas(220);
        novoLivro2.verificarProgresso();
        System.out.println();

        Livro novoLivro3 = new Livro();
        novoLivro3.setTitulo("Grande Sertão: Veredas");
        novoLivro3.setQtdPaginas(600);
        System.out.println("O livro "
                + novoLivro3.getTitulo()
                + " possui " + novoLivro3.getQtdPaginas()
                + " páginas.");
        novoLivro3.setPaginasLidas(359);
        novoLivro3.verificarProgresso();
        novoLivro3.setPaginasLidas(425);
        novoLivro3.verificarProgresso();
        System.out.println();

        Livro novoLivro4 = new Livro();
        novoLivro4.setTitulo("Vidas Secas");
        novoLivro4.setQtdPaginas(176);
        System.out.println("O livro "
                + novoLivro4.getTitulo()
                + " possui " + novoLivro4.getQtdPaginas()
                + " páginas.");
        novoLivro4.setPaginasLidas(80);
        novoLivro4.verificarProgresso();
        novoLivro4.setPaginasLidas(150);
        novoLivro4.verificarProgresso();
        System.out.println();

        Livro novoLivro5 = new Livro();
        novoLivro5.setTitulo("O Cortiço");
        novoLivro5.setQtdPaginas(260);
        System.out.println("O livro "
                + novoLivro5.getTitulo()
                + " possui " + novoLivro5.getQtdPaginas()
                + " páginas.");
        novoLivro5.setPaginasLidas(137);
        novoLivro5.verificarProgresso();
        novoLivro5.setPaginasLidas(255);
        novoLivro5.verificarProgresso();
        System.out.println();

        Livro novoLivro6 = new Livro();
        novoLivro6.setTitulo("Macunaíma");
        novoLivro6.setQtdPaginas(160);
        System.out.println("O livro "
                + novoLivro6.getTitulo()
                + " possui " + novoLivro6.getQtdPaginas()
                + " páginas.");
        novoLivro6.setPaginasLidas(55);
        novoLivro6.verificarProgresso();
        novoLivro6.setPaginasLidas(101);
        novoLivro6.verificarProgresso();
        System.out.println();

        Livro novoLivro7 = new Livro();
        novoLivro7.setTitulo("Capitães da Areia");
        novoLivro7.setQtdPaginas(256);
        System.out.println("O livro "
                + novoLivro7.getTitulo()
                + " possui " + novoLivro7.getQtdPaginas()
                + " páginas.");
        novoLivro7.setPaginasLidas(158);
        novoLivro7.verificarProgresso();
        novoLivro7.setPaginasLidas(256);
        novoLivro7.verificarProgresso();
        System.out.println();

        Livro novoLivro8 = new Livro();
        novoLivro8.setTitulo("O Quinze");
        novoLivro8.setQtdPaginas(200);
        System.out.println("O livro "
                + novoLivro8.getTitulo()
                + " possui " + novoLivro8.getQtdPaginas()
                + " páginas.");
        novoLivro8.setPaginasLidas(100);
        novoLivro8.verificarProgresso();
        novoLivro8.setPaginasLidas(190);
        novoLivro8.verificarProgresso();
        System.out.println();

        Livro novoLivro9 = new Livro();
        novoLivro9.setTitulo("Claro Enigma");
        novoLivro9.setQtdPaginas(100);
        System.out.println("O livro "
                + novoLivro9.getTitulo()
                + " possui " + novoLivro9.getQtdPaginas()
                + " páginas.");
        novoLivro9.setPaginasLidas(37);
        novoLivro9.verificarProgresso();
        novoLivro9.setPaginasLidas(72);
        novoLivro9.verificarProgresso();
        System.out.println();

        Livro novoLivro10 = new Livro();
        novoLivro10.setTitulo("O Guarani");
        novoLivro10.setQtdPaginas(320);
        System.out.println("O livro "
                + novoLivro10.getTitulo()
                + "possui" + novoLivro10.getQtdPaginas()
                + " páginas.");
        novoLivro10.setPaginasLidas(179);
        novoLivro10.verificarProgresso();
        novoLivro10.setPaginasLidas(320);
        novoLivro10.verificarProgresso();
        System.out.println();

        sc.close();

    }

}
