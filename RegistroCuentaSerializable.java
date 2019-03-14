package pruebacreararchivosecuencial;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Janeth Ruiz
 */
public class RegistroCuentaSerializable implements Serializable 
{
 private int cuenta;
 private String primerNombre;
 private String apellidoPaterno;
 private double saldo;

 // el constructor sin argumentos llama al otro constructor con valores predeterminados
 public RegistroCuentaSerializable()
 {
 this( 0, "", "", 0 );
 } // fin del constructor de RegistroCuentaSerializable sin argumentos

 // el constructor con cuatro argumentos inicializa un registro
 public RegistroCuentaSerializable(
 int cta, String nombre, String apellido, double sal )
 {
 establecerCuenta( cta );
 establecerPrimerNombre( nombre );
 establecerApellidoPaterno( apellido );
 establecerSaldo( sal );
 } // fin del constructor de RegistroCuentaSerializable con cuatro argumentos

 // establece el número de cuenta
 public void establecerCuenta( int cta )
 {
 cuenta = cta;
 } // fin del método establecerCuenta

 // obtiene el número de cuenta
 public int obtenerCuenta()
 {
 return cuenta;
 } // fin del método obtenerCuenta

 // establece el primer nombre
 public void establecerPrimerNombre( String nombre )
 {
 primerNombre = nombre;
 } // fin del método establecerPrimerNombre

 // obtiene el primer nombre
 public String obtenerPrimerNombre()
 {
 return primerNombre;
 } // fin del método obtenerPrimerNombre

 // establece el apellido paterno
 public void establecerApellidoPaterno( String apellido )
 {
 apellidoPaterno = apellido;
 } // fin del método establecerApellidoPaterno

 // obtiene el apellido paterno
 public String obtenerApellidoPaterno()
 {
 return apellidoPaterno;
 } // fin del método obtenerApellidoPaterno

 // establece el saldo
 public void establecerSaldo( double sal )
 {
 saldo = sal;
 } // fin del método establecerSaldo

 // obtiene el saldo
 public double obtenerSaldo()
 {
 return saldo;
 } // fin del método obtenerSaldo
}
