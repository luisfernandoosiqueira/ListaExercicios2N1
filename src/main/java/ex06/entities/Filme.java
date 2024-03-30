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
package ex06.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 30/03/2024
 * @brief Class Filme
 */
public class Filme {

    private String titulo;
    private Integer duracaoEmMinutos;

    public Filme() {
    }

    public Filme(String titulo, Integer duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(Integer duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDuracaoEmHoras() {
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;

        // Determinando a concordância de "hora(s)"
        String textoHoras = horas + " hora" + (horas != 1 ? "s" : "");

        // Determinando a concordância de "minuto(s)"
        String textoMinutos = minutos + " minuto" + (minutos != 1 ? "s" : "");

        // Exibindo o resultado
        System.out.println("O filme " + titulo + " possui " + textoHoras + " e " + textoMinutos + " de duração.");
    }

}
