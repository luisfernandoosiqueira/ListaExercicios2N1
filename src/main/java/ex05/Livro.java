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

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 29/03/2024
 * @brief Class Livro
 */
public class Livro {

    private String titulo;
    private Integer qtdPaginas;
    private Integer paginasLidas;

    public Livro() {
    }

    public Livro(String titulo, Integer qtdPaginas, Integer paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Integer getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(Integer paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void verificarProgresso() {

        if (qtdPaginas > 0) {
            double porcentagem = (double) paginasLidas * 100 / qtdPaginas;
            System.out.println("Você já leu " + String.format("%.0f", porcentagem) + "% do livro.");
        } else {
            System.out.println("Número total de páginas não pode ser zero.");
        }
    }

}
