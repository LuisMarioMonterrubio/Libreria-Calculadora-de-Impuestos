/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Luis Mario
 */
public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        // Prueba de cálculo de IVA
        double monto1 = 1000.0;
        double iva = CalculadoraImpuestos.calcularIVA(monto1);
        System.out.println("Prueba IVA:");
        System.out.printf("Monto: $%.2f → IVA (16%%): $%.2f%n%n", monto1, iva);

        // Prueba de cálculo de ISR
        double ingresos = 20000.0;
        double deducciones = 5000.0;
        double isr = CalculadoraImpuestos.calcularISR(ingresos, deducciones);
        System.out.println("Prueba ISR:");
        System.out.printf("Ingresos: $%.2f%n", ingresos);
        System.out.printf("Deducciones: $%.2f%n", deducciones);
        System.out.printf("Base gravable: $%.2f%n", ingresos - deducciones);
        System.out.printf("ISR calculado: $%.2f%n%n", isr);

        // Prueba de cálculo de IEPS
        double monto2 = 1000.0;
        double tasa = 8.0;
        double ieps = CalculadoraImpuestos.calcularIEPS(monto2, tasa);
        System.out.println("Prueba IEPS:");
        System.out.printf("Monto: $%.2f%n", monto2);
        System.out.printf("Tasa: %.2f%%%n", tasa);
        System.out.printf("IEPS calculado: $%.2f%n%n", ieps);
        
        // Prueba de cálculo de ISN
        double nomina = 150000.0;
        double tasaISN = 3.0;
        double isn = CalculadoraImpuestos.calcularISN(nomina, tasaISN);
        System.out.println("Prueba ISN:");
        System.out.printf("Nómina total: $%.2f%n", nomina);
        System.out.printf("Tasa estatal: %.2f%%%n", tasaISN);
        System.out.printf("ISN calculado: $%.2f%n%n", isn);
        
        // Prueba de cálculo de Predial
        double valorCatastral = 750000.0;
        double tasaPredial = 0.5;
        double descuento = 15.0;
        double predial = CalculadoraImpuestos.calcularPredial(valorCatastral, tasaPredial, descuento);
        System.out.println("Prueba Predial:");
        System.out.printf("Valor catastral: $%.2f%n", valorCatastral);
        System.out.printf("Tasa municipal: %.2f%%%n", tasaPredial);
        System.out.printf("Descuento por pago anticipado: %.2f%%%n", descuento);
        System.out.printf("Predial calculado: $%.2f%n%n", predial);
        
        // Prueba de cálculo de ISAN
        double valorVehiculo = 950000.0;
        double isan = CalculadoraImpuestos.calcularISAN(valorVehiculo);
        System.out.println("Prueba ISAN:");
        System.out.printf("Valor del vehículo: $%.2f%n", valorVehiculo);
        System.out.printf("ISAN calculado: $%.2f%n%n", isan);

        System.out.println("---------- PRUEBAS DE VALIDACIONES ----------");
        
        // Validaciones para impuestos originales
        System.out.println("\nValidaciones para impuestos originales:");
        try {
            System.out.println("Intentando calcular IVA con monto negativo...");
            CalculadoraImpuestos.calcularIVA(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }
        
        try {
            System.out.println("Intentando calcular IEPS con tasa negativa...");
            CalculadoraImpuestos.calcularIEPS(100, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }
        
        try {
            System.out.println("Intentando calcular ISR con deducciones mayores que ingresos...");
            double resultado = CalculadoraImpuestos.calcularISR(1000, 1500);
            System.out.printf("ISR calculado (base negativa): $%.2f%n", resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }
        
        // Validaciones para nuevos impuestos
        System.out.println("\nValidaciones para nuevos impuestos:");
        try {
            System.out.println("Intentando calcular ISN con nómina negativa...");
            CalculadoraImpuestos.calcularISN(-50000, 2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }
        
        try {
            System.out.println("Intentando calcular Predial con descuento negativo...");
            CalculadoraImpuestos.calcularPredial(500000, 0.6, -10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }
        
        try {
            System.out.println("Intentando calcular ISAN con valor de vehículo negativo...");
            CalculadoraImpuestos.calcularISAN(-250000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }
        
        // Prueba de caso especial ISAN (valor exacto en límite de tramo)
        System.out.println("\nPrueba caso especial ISAN (valor exacto en límite de tramo):");
        double valorTesla = 500000.0;
        double isanTesla = CalculadoraImpuestos.calcularISAN(valorTesla);
        System.out.printf("Valor vehículo: $%.2f%n", valorTesla);
        System.out.printf("ISAN calculado: $%.2f%n", isanTesla);
        System.out.println("Detalle: 350,000 * 2% = 7,000 + 150,000 * 7% = 10,500 → Total 17,500");
        
        // Prueba de predial con descuento máximo
        System.out.println("\nPrueba predial con descuento máximo:");
        double predialMaxDesc = CalculadoraImpuestos.calcularPredial(300000, 0.7, 20.0);
        System.out.printf("Predial con 20%% descuento: $%.2f%n", predialMaxDesc);
    }
    }
    
