/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacreararchivosecuencial;

/**
 *
 * @author Janeth Ruiz
 */
public class PruebaCrearArchivoSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CrearArchivoSecuencial aplicacion = new CrearArchivoSecuencial();

        aplicacion.abrirArchivo();
        aplicacion.agregarRegistros();
        aplicacion.cerrarArchivo();

        LeerArchivoSecuencial app = new LeerArchivoSecuencial();

        app.abrirArchivo();
        app.leerRegistros();
        app.cerrarArchivo();
    }

}
