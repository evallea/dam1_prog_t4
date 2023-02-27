package com.mycompany.cargoseducativos;

/**
 *
 * @author Enrique Valle Alcega
 */
public class EquipoDirectivo extends Profesor {

    String cargo;
    double plus;

    public EquipoDirectivo(String nombre, int edad, double sueldo, String cargo, double plus) {
        super(nombre, edad, sueldo);
        this.cargo = cargo;
        this.plus = plus;
    }

    public String getCargo() {
        return cargo;
    }

    public double getPlus() {
        return plus;
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() + plus;
    }
}
