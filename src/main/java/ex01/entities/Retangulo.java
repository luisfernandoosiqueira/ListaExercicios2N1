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
package ex01.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 25/03/2024
 * @brief Class Retangulo
 */
public class Retangulo {

    private Float lado1;
    private Float lado2;
    private Float area;
    private Float perimetro;

    public Retangulo() {
    }

    public Retangulo(Float lado1, Float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Float getLado1() {
        return lado1;
    }

    public void setLado1(Float lado1) {
        this.lado1 = lado1;
    }

    public Float getLado2() {
        return lado2;
    }

    public void setLado2(Float lado2) {
        this.lado2 = lado2;
    }

      
        
    public void CalcularArea() {
        double area = lado1 * lado2;
        System.out.println("Área: " + area);
        
    }

    public void CalcularPerimetro() {
        double perimetro = lado1 + lado2 + lado1 + lado2;
        System.out.println("Perímetro " + perimetro);
        
    }
               

    }
