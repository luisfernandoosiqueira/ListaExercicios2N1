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
package ex01.application;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 25/03/2024
 * @brief Class Program
 */
import ex01.entities.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo novoRetangulo = new Retangulo();

        novoRetangulo.setLado1(10f);
        novoRetangulo.setLado2(5f);

        novoRetangulo.CalcularArea();

        novoRetangulo.CalcularPerimetro();

        novoRetangulo.setLado2(7f);

        novoRetangulo.CalcularArea();

        novoRetangulo.CalcularPerimetro();
        System.out.println();

        Retangulo Retangulo2 = new Retangulo();

        Retangulo2.setLado1(12f);
        Retangulo2.setLado2(5f);

        Retangulo2.CalcularArea();

        Retangulo2.CalcularPerimetro();

        Retangulo2.setLado2(4f);

        Retangulo2.CalcularArea();

        Retangulo2.CalcularPerimetro();
        System.out.println();

        Retangulo Retangulo3 = new Retangulo();

        Retangulo3.setLado1(14f);
        Retangulo3.setLado2(7f);

        Retangulo3.CalcularArea();

        Retangulo3.CalcularPerimetro();

        Retangulo3.setLado2(5f);

        Retangulo3.CalcularArea();

        Retangulo3.CalcularPerimetro();
        System.out.println();

        Retangulo Retangulo4 = new Retangulo();

        Retangulo4.setLado1(15f);
        Retangulo4.setLado2(6f);

        Retangulo4.CalcularArea();

        Retangulo4.CalcularPerimetro();

        Retangulo4.setLado2(8f);

        Retangulo4.CalcularArea();

        Retangulo4.CalcularPerimetro();
        System.out.println();

        Retangulo Retangulo5 = new Retangulo();

        Retangulo5.setLado1(16f);
        Retangulo5.setLado2(9f);

        Retangulo5.CalcularArea();

        Retangulo5.CalcularPerimetro();

        Retangulo5.setLado2(5f);

        Retangulo5.CalcularArea();

        Retangulo5.CalcularPerimetro();
        System.out.println();

        Retangulo Retangulo6 = new Retangulo();

        Retangulo6.setLado1(18f);
        Retangulo6.setLado2(10f);

        Retangulo6.CalcularArea();

        Retangulo6.CalcularPerimetro();

        Retangulo6.setLado2(7f);

        Retangulo6.CalcularArea();

        Retangulo6.CalcularPerimetro();
        System.out.println();

        sc.close();

    }

}
