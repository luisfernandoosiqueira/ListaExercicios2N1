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

package ex06.application;

import ex06.entities.Filme;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 30/03/2024
 * @brief Class Program
 */

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Filme filmeFavorito = new Filme();
        
        System.out.println("Informe o título do livro:");
        filmeFavorito.setTitulo(sc.nextLine());
        System.out.println("Informe a duração em minutos:");
        filmeFavorito.setDuracaoEmMinutos(sc.nextInt());
        
        filmeFavorito.exibirDuracaoEmHoras();
        
        
        
        sc.close();
    }
    
    
}
