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
package ex07.application;

import ex07.entities.Filme;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 30/03/2024
 * @brief Class Program
 */
public class TestarFilme {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Filme filme1 = new Filme();

        filme1.setTitulo("Vingadores");
        filme1.setDuracaoEmMinutos(142);

        filme1.exibirDuracaoEmHoras();
        System.out.println();

        Filme filme2 = new Filme();

        filme2.setTitulo("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos(93);

        filme2.exibirDuracaoEmHoras();
        System.out.println();

        System.out.println("Os filmes em cartaz são "
                + filme1.getTitulo()
                + " e "
                + filme2.getTitulo()
                + ".");
        System.out.println();

        Filme filme3 = new Filme();

        filme3.setTitulo("O Poderoso Chefão");
        filme3.setDuracaoEmMinutos(175);

        filme3.exibirDuracaoEmHoras();
        System.out.println();

        System.out.println("Os filmes em cartaz são "
                + filme1.getTitulo()
                + ", "
                + filme2.getTitulo()
                + " e "
                + filme3.getTitulo()
                + ".");
        System.out.println();

        Filme filme4 = new Filme();

        filme4.setTitulo("Amor para Recordar");
        filme4.setDuracaoEmMinutos(101);

        filme4.exibirDuracaoEmHoras();
        System.out.println();

        System.out.println("Os filmes em cartaz são "
                + filme1.getTitulo()
                + ", "
                + filme2.getTitulo()
                + ", "
                + filme3.getTitulo()
                + " e "
                + filme4.getTitulo()
                + ".");
        System.out.println();

        Filme filme5 = new Filme();

        filme5.setTitulo("Die Hard (Duro de Matar)");
        filme5.setDuracaoEmMinutos(132);

        filme5.exibirDuracaoEmHoras();
        System.out.println();

        System.out.println("Os filmes em cartaz são "
                + filme1.getTitulo()
                + ", "
                + filme2.getTitulo()
                + ", "
                + filme3.getTitulo()
                + ", "
                + filme4.getTitulo()
                + " e "
                + filme5.getTitulo()
                + ".");
        System.out.println();

        Filme filme6 = new Filme();

        filme6.setTitulo("O Top Gun: Maverick");
        filme6.setDuracaoEmMinutos(130);

        filme6.exibirDuracaoEmHoras();
        System.out.println();

        System.out.println("Os filmes em cartaz são "
                + filme1.getTitulo()
                + ", "
                + filme2.getTitulo()
                + ", "
                + filme3.getTitulo()
                + ", "
                + filme4.getTitulo()
                + ", "
                + filme5.getTitulo()
                + " e "
                + filme6.getTitulo()
                + ".");
        System.out.println();

        Filme filme7 = new Filme();

        filme7.setTitulo("Parker");
        filme7.setDuracaoEmMinutos(118);

        filme7.exibirDuracaoEmHoras();
        System.out.println();

        System.out.println("Os filmes em cartaz são "
                + filme1.getTitulo()
                + ", "
                + filme2.getTitulo()
                + ", "
                + filme3.getTitulo()
                + ", "
                + filme4.getTitulo()
                + ", "
                + filme5.getTitulo()
                + ", "
                + filme6.getTitulo()
                + " e "
                + filme7.getTitulo()
                + ".");
        System.out.println();

        sc.close();
    }

}
