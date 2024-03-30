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
package ex02.application;

import ex02.entities.Circulo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 25/03/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Circulo novoCirculo = new Circulo();

        novoCirculo.setRaio(10.0);
        novoCirculo.CalcularArea();
        novoCirculo.CalcularPerimetro();

        novoCirculo.setRaio(4.0);
        novoCirculo.CalcularArea();
        novoCirculo.CalcularPerimetro();
        
        Circulo novoCirculo2 = new Circulo();

        novoCirculo2.setRaio(15.0);
        novoCirculo2.CalcularArea();
        novoCirculo2.CalcularPerimetro();

        novoCirculo2.setRaio(5.0);
        novoCirculo2.CalcularArea();
        novoCirculo2.CalcularPerimetro();
        
        Circulo novoCirculo3 = new Circulo();

        novoCirculo3.setRaio(16.0);
        novoCirculo3.CalcularArea();
        novoCirculo3.CalcularPerimetro();

        novoCirculo3.setRaio(6.0);
        novoCirculo3.CalcularArea();
        novoCirculo3.CalcularPerimetro();
        
        Circulo novoCirculo4 = new Circulo();

        novoCirculo4.setRaio(17.0);
        novoCirculo4.CalcularArea();
        novoCirculo4.CalcularPerimetro();

        novoCirculo4.setRaio(7.0);
        novoCirculo4.CalcularArea();
        novoCirculo4.CalcularPerimetro();
        
        Circulo novoCirculo5 = new Circulo();

        novoCirculo5.setRaio(18.0);
        novoCirculo5.CalcularArea();
        novoCirculo5.CalcularPerimetro();

        novoCirculo5.setRaio(8.0);
        novoCirculo5.CalcularArea();
        novoCirculo5.CalcularPerimetro();
        
        Circulo novoCirculo6 = new Circulo();

        novoCirculo6.setRaio(19.0);
        novoCirculo6.CalcularArea();
        novoCirculo6.CalcularPerimetro();

        novoCirculo6.setRaio(9.0);
        novoCirculo6.CalcularArea();
        novoCirculo6.CalcularPerimetro();
        
        sc.close();

    }

}
