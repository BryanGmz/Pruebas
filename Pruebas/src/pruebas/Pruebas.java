/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import org.codehaus.commons.compiler.CompilerFactoryFactory;
import org.codehaus.commons.compiler.IExpressionEvaluator;
import org.codehaus.groovy.tools.shell.Interpreter;

/**
 *
 * @author bryan
 */
public class Pruebas {

    public static String 
            id = "([a-z]+)",
            num = "((\\d)+)",
            dec = "([0-9]+((.)[0-9]+)?)",
            entrada, token;
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException, InstantiationException, IllegalAccessException, Exception {
//        int [][] hola = new int[6][5];
//        
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(" ( " + i + ", " + j + " )");
//            } System.out.println("");
//        }
            String entrada = ""
                    + "hola comop    esta;";
            String[]split=entrada.split(" ");
            System.out.println(Arrays.toString(split));
//        List<String> lista = new ArrayList<>();
//        lista.add("X -> Hola");
//        lista.add("Como");
//        lista.add("Esta");
//        lista.add("Buien");
//        lista.forEach((string) -> {
//            System.out.println("String " + string);
//        });
//       // IExpressionEvaluator evaluator =  CompilerFactoryFactory.getDefaultCompilerFactory().newExpressionEvaluator();
//        String[] particion = lista.get(0).split("->");
//        String primerProduccion = particion[0];
//        primerProduccion = primerProduccion.replaceAll(" ", "");
//        primerProduccion = "Ñ' -> " + primerProduccion + "$"; 
//        lista.add(0, primerProduccion);
//        System.out.println("\n\n\n");
//        lista.forEach((string) -> {
//            System.out.println("String " + string);
//        });
//        ejemplo();
//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.println("Entrada: ");
//            entrada = s.nextLine();
//            StringTokenizer st = new StringTokenizer(entrada);
//            while (st.hasMoreTokens()) {
//                token = st.nextToken();
//                System.out.println(getToken(token));
//            }
//            
//        }
    }

    private static String getToken(String entrada){
        System.out.println("Hola");
        if (entrada.matches(id) ) {
            return "Identificador";
        } else if (entrada.matches(num)) {
            return "Numero";
        } else  if(entrada.matches(dec)) {
            return "Decimal";
        } else {
            return "NULL";
        }
    }
    
    static void ejecutarComando() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        rt.exec("dot -Tpng archivo.dot -o imagen.png");
        Thread.sleep(1000);
        rt.exec("nohup display ./imagen.png");
    }
    
    private static void ejemplo() throws InstantiationException, IllegalAccessException{
        String claseAnalisis = "ClaseAnalisis";
        String codigoDeClase =
                "   import java.util.List;\n" +
                "   import java.util.Arrays;\n" +
                "   import java.util.ArrayList;\n" +
                "public class ClaseAnalisis {" + "\n" + 

                "   List<String> listString=new ArrayList<>();\n" +
                "   \n" +
                "   public void addString(String valor){\n" +
                "       listString.add(valor);\n" +
                "    }\n" +
                "\n" +
                "    public static void suma(int numero1){\n" +
                "        System.out.println(numero1);\n" +
                "    }\n" +
                "}";
        RuntimeCompiler r = new RuntimeCompiler();
        r.addClass(claseAnalisis, codigoDeClase);
        r.compile();
        
//        Class<?> c = r.getCompiledClass("ClaseAnalisis");
//        c.newInstance();
        
        MethodInvocationUtils.invokeStaticMethod(
            r.getCompiledClass(claseAnalisis), 
            "suma", "Integer.parseInt(6)");
        
//        Class<?> c = r.getCompiledClass("ExampleComparator");
//        
//        System.out.println(Arrays.toString(c.getMethods()));
    }
}
