package org.example.validaciones.utilidades;

public enum Mensajes {


    SUPERA_NUMERO_CARACTERES("El nombre supera los caracteres permitidos"),
    EDAD_NEGATIVA("El valor de la edad no puede ser negativa"),
    EDAD_MAYOR("Si eres mayor de 90 comunícate al 0180001111"),
    COBERTURA_INCORRECTA("Solo se aceptan montos hasta 1500 millones de pesos"),
    BENEFICIARIO_LONGITUD("Longitud máxima, 50 caracteres"),
    BENEFICIARIO_FORMATO("Solo se aceptan letras"),
    FECHA_INCORRECTA("Formato de fecha incorrecta");





    private String Mensaje;

    Mensajes(String mensaje) {
        Mensaje = mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

}