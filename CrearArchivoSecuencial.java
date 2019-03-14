package pruebacreararchivosecuencial;
import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.ObjectOutputStream;
 import java.util.NoSuchElementException;
 import java.util.Scanner;
public class CrearArchivoSecuencial {

    private ObjectOutputStream salida; 
 public void abrirArchivo()
 {
 try 
 {
 salida = new ObjectOutputStream(
 new FileOutputStream( "Corredor.ser" ) );
 } 
 catch ( IOException ioException )
 {
 System.err.println( "Error al abrir el archivo." );
 } 
 } 

 public void agregarRegistros()
 {
 RegistroCuentaSerializable registro; 
 int numeroCuenta = 0; 
 String primerNombre; 
 String apellidoPaterno; 
 int saldo = 0; 

 Scanner entrada = new Scanner( System.in );

 System.out.printf( ">>>>>\n  " );

 System.out.printf( "%s\n%s",
 "Escriba el numero de corredor , Nombre, Apellido y CantidadRecorrida (km).",
 ">> " );

 for(int  i =0 ; i<=2 ;i++ ) 
 {
 try 
 {
 numeroCuenta = entrada.nextInt(); 
 primerNombre = entrada.next(); 
 apellidoPaterno = entrada.next(); 
 saldo = entrada.nextInt(); 

 if ( numeroCuenta > 0 )
 {
 registro = new RegistroCuentaSerializable( numeroCuenta,
 primerNombre, apellidoPaterno, saldo );
 salida.writeObject( registro ); 
 } 
 else
 {
 System.out.println(
 "El numero de cuenta debe ser mayor de 0." );
 } 
 } 
 catch ( IOException ioException )
 {
 System.err.println( "Error al escribir en el archivo." );
 return;
 } // fin de catch
 catch ( NoSuchElementException elementException )
 {
 System.err.println( "Entrada invalida. Intente de nuevo." );
 entrada.nextLine(); 
 } 
 
 System.out.printf( "%s %s\n%s", "Escriba el numero corredor ,",
 "Nombre, Apellido  y CantidadRecorrida (km).", "? " );
 }  } 

 public void cerrarArchivo()
 {
 try // cierra el archivo
 {
 if ( salida != null )
 salida.close();
 } // fin de try
 catch ( IOException ioException )
 {
 System.err.println( "Error al cerrar el archivo." );
 System.exit( 1 );
 } 
 } 

   
}
