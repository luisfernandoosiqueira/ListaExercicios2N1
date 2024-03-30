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
package ex03.application;

import ex03.entities.Funcionario;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 28/03/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Instanciação da classe Funcionário
        Funcionario funcionario = new Funcionario();

//Atribuindo valores aos objeto criado
        funcionario.setNome("Luis");
        funcionario.setSobrenome("Silva");
        funcionario.setHorasTrabalhadas(10);
        funcionario.setValorPorHora(25.50);

        funcionario.NomeCompleto();
        funcionario.calcularSalario();
        funcionario.incrementarHoras(8);
        funcionario.calcularSalario();

        // Criação de um ArrayList para armazenar objetos do tipo Funcionario
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(funcionario); // Atribuindo o funcionário que já havia sido criado acima à ArrayList

        // Instanciação de outros nove funcionários
        Funcionario funcionario2 = new Funcionario();

//Atribuindo valores ao funcionário2
        funcionario2.setNome("Maria");
        funcionario2.setSobrenome("Pereira");
        funcionario2.setHorasTrabalhadas(7);
        funcionario2.setValorPorHora(40.50);

        funcionario2.NomeCompleto();
        funcionario2.calcularSalario();
        funcionario2.incrementarHoras(2);
        funcionario2.calcularSalario();

        Funcionario funcionario3 = new Funcionario();

//Atribuindo valores ao funcionário3
        funcionario3.setNome("João");
        funcionario3.setSobrenome("Ribeiro");
        funcionario3.setHorasTrabalhadas(12);
        funcionario3.setValorPorHora(30.50);

        funcionario3.NomeCompleto();
        funcionario3.calcularSalario();
        funcionario3.incrementarHoras(6);
        funcionario3.calcularSalario();

        Funcionario funcionario4 = new Funcionario();

//Atribuindo valores ao funcionário4
        funcionario4.setNome("Paulo");
        funcionario4.setSobrenome("Borges");
        funcionario4.setHorasTrabalhadas(15);
        funcionario4.setValorPorHora(30);

        funcionario4.NomeCompleto();
        funcionario4.calcularSalario();
        funcionario4.incrementarHoras(5);
        funcionario4.calcularSalario();

        Funcionario funcionario5 = new Funcionario();

//Atribuindo valores ao funcionário5
        funcionario5.setNome("Roberto");
        funcionario5.setSobrenome("Oliveira");
        funcionario5.setHorasTrabalhadas(40);
        funcionario5.setValorPorHora(23.12);

        funcionario5.NomeCompleto();
        funcionario5.calcularSalario();
        funcionario5.incrementarHoras(9);
        funcionario5.calcularSalario();

        Funcionario funcionario6 = new Funcionario();

//Atribuindo valores ao funcionário6
        funcionario6.setNome("Joana");
        funcionario6.setSobrenome("Torres");
        funcionario6.setHorasTrabalhadas(14);
        funcionario6.setValorPorHora(28);

        funcionario6.NomeCompleto();
        funcionario6.calcularSalario();
        funcionario6.incrementarHoras(3);
        funcionario6.calcularSalario();

        Funcionario funcionario7 = new Funcionario();

//Atribuindo valores ao funcionário7
        funcionario7.setNome("Cristina");
        funcionario7.setSobrenome("Barros");
        funcionario7.setHorasTrabalhadas(60);
        funcionario7.setValorPorHora(32);

        funcionario7.NomeCompleto();
        funcionario7.calcularSalario();
        funcionario7.incrementarHoras(1);
        funcionario7.calcularSalario();

        Funcionario funcionario8 = new Funcionario();

//Atribuindo valores ao funcionário8
        funcionario8.setNome("André");
        funcionario8.setSobrenome("Soares");
        funcionario8.setHorasTrabalhadas(17);
        funcionario8.setValorPorHora(23.5);

        funcionario8.NomeCompleto();
        funcionario8.calcularSalario();
        funcionario8.incrementarHoras(9);
        funcionario8.calcularSalario();

        Funcionario funcionario9 = new Funcionario();

//Atribuindo valores ao funcionário9
        funcionario9.setNome("Mateus");
        funcionario9.setSobrenome("Sousa");
        funcionario9.setHorasTrabalhadas(50);
        funcionario9.setValorPorHora(26.5);

        funcionario9.NomeCompleto();
        funcionario9.calcularSalario();
        funcionario9.incrementarHoras(6);
        funcionario9.calcularSalario();

        Funcionario funcionario10 = new Funcionario();

//Atribuindo valores ao funcionário10
        funcionario10.setNome("Marina");
        funcionario10.setSobrenome("Andrade");
        funcionario10.setHorasTrabalhadas(18);
        funcionario10.setValorPorHora(22.50);

        funcionario10.NomeCompleto();
        funcionario10.calcularSalario();
        funcionario10.incrementarHoras(8);
        funcionario10.calcularSalario();

        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        funcionarios.add(funcionario6);
        funcionarios.add(funcionario7);
        funcionarios.add(funcionario8);
        funcionarios.add(funcionario9);
        funcionarios.add(funcionario10);

        /* Exemplo de loop for each para imprimir a ArrayList
        
        //for (TipoDaVariavel nomeDaVariavel : colecao) {
        // Código a ser executado para cada elemento da coleção
        }
        
        int num = 1;
        
        for (Funcionario func : funcionarios) {
                 
            System.out.println("Dados do " + num + "º " + "funcionário:");
            func.NomeCompleto();
            func.calcularSalario(); // Esta linha imprime o valor do salário de cada funcionário
            System.out.println();
           
            num++;
        }

        
        //Exemplo de for tradicional
                
        int num = 1;

        for (int i = 0; i < funcionarios.size(); i++) {
        
            Funcionario func = funcionarios.get(i); // Acessando o funcionário na posição i da lista
    
            System.out.println("Dados do " + num + "º " + "funcionário:");
            func.NomeCompleto(); // Assume que este método imprime o nome completo do funcionário
            func.calcularSalario(); // Este método imprime o valor do salário do funcionário
            System.out.println();
   
            num++;
        }
        
         */
        
        sc.close();
    }

}
