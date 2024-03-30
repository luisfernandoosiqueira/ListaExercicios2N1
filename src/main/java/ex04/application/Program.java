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

package ex04.application;

import ex04.entities.Livro;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 29/03/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o título do livro");
        String titulo = sc.nextLine();
                System.out.println("Quantas páginas tem o livro?");
        int qtdPaginas = sc.nextInt();
                        System.out.println("Quantas páginas você já leu?");
        int paginasLidas = sc.nextInt();
        
        Livro livro = new Livro(titulo, qtdPaginas, paginasLidas);
        
        livro.verificarProgresso();
        
        sc.close();
        
    }
    
}
