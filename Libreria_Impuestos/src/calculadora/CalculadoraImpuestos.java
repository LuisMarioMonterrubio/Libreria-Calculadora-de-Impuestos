
package calculadora;

/**
 * Calculadora de impuestos mexicanos (IVA, ISR, IEPS, ISN, Predial, ISAN)
 * 
 * <p>Proporciona métodos estáticos para calcular los principales impuestos mexicanos
 * con validación de entradas y manejo de errores.</p>
 * 
 * @author Luis Mario
 * @version 2.0
 */

public class CalculadoraImpuestos {
     // Constructor privado para evitar instanciación
    private CalculadoraImpuestos() {}
    
    /**
     * Valida que un valor numérico sea positivo
     * 
     * @param valor Valor a validar
     * @throws IllegalArgumentException Si el valor es negativo
     */
    private static void validarEntrada(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("El valor debe ser positivo");
        }
    }
    
    // --- IMPUESTOS ORIGINALES (1.0) ---
    
    /**
     * Calcula el Impuesto al Valor Agregado (IVA)
     * 
     * <p>Aplica la tasa general del 16% sobre el monto proporcionado</p>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * double iva = calcularIVA(1000); // Retorna 160.0
     * </pre>
     * 
     * @param monto Monto base sobre el cual se calculará el impuesto
     * @return Valor del IVA calculado
     * @throws IllegalArgumentException Si el monto es negativo
     */
    public static double calcularIVA(double monto) {
        validarEntrada(monto);
        return monto * 0.16;
    }
    
    /**
     * Calcula el Impuesto Sobre la Renta (ISR)
     * 
     * <p>Calcula el impuesto aplicando una tasa progresiva sobre la base gravable
     * (ingresos menos deducciones):</p>
     * 
     * <ul>
     *   <li>Hasta $10,000: 10%</li>
     *   <li>$10,001 - $50,000: 20%</li>
     *   <li>Más de $50,000: 30%</li>
     * </ul>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * double isr = calcularISR(20000, 5000); // Retorna 3000.0
     * // Explicación: Base gravable = 15,000 → Tasa 20% = 3,000
     * </pre>
     * 
     * @param ingresos Total de ingresos gravables
     * @param deducciones Deducciones autorizadas por la ley
     * @return Valor del ISR calculado
     * @throws IllegalArgumentException Si los ingresos o deducciones son negativos
     */
    public static double calcularISR(double ingresos, double deducciones) {
        validarEntrada(ingresos);
        validarEntrada(deducciones);
        
        double baseGravable = ingresos - deducciones;
        if (baseGravable <= 0) return 0;
        
        if (baseGravable <= 10000) return baseGravable * 0.10;
        if (baseGravable <= 50000) return baseGravable * 0.20;
        return baseGravable * 0.30;
    }
    
    /**
     * Calcula el Impuesto Especial sobre Producción y Servicios (IEPS)
     * 
     * <p>Aplica una tasa personalizada (expresada en porcentaje) sobre el monto base</p>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * double ieps = calcularIEPS(1000, 8.0); // Retorna 80.0
     * </pre>
     * 
     * @param monto Monto base sobre el cual se calculará el impuesto
     * @param tasa Porcentaje de IEPS a aplicar (ej. 8.0 para 8%)
     * @return Valor del IEPS calculado
     * @throws IllegalArgumentException Si el monto o la tasa son negativos
     */
    public static double calcularIEPS(double monto, double tasa) {
        validarEntrada(monto);
        validarEntrada(tasa);
        return monto * (tasa / 100);
    }
    
    // --- NUEVOS IMPUESTOS (2.0) ---
    
    /**
     * Calcula el Impuesto sobre Nóminas (ISN)
     * 
     * <p>Aplica la tasa estatal específica sobre el total de la nómina</p>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * double isn = calcularISN(100000, 3.0); // Retorna 3000.0
     * </pre>
     * 
     * @param totalNomina Monto total de la nómina gravable
     * @param tasaPorcentual Tasa aplicable en porcentaje (ej. 3.0 para 3%)
     * @return Valor del ISN calculado
     * @throws IllegalArgumentException Si la nómina o tasa son negativas
     */
    public static double calcularISN(double totalNomina, double tasaPorcentual) {
        validarEntrada(totalNomina);
        validarEntrada(tasaPorcentual);
        return totalNomina * (tasaPorcentual / 100);
    }
    
    /**
     * Calcula el Impuesto Predial (versión básica)
     * 
     * <p>Aplica la tasa municipal sobre el valor catastral, considerando
     * posible descuento por pago anticipado</p>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * double predial = calcularPredial(500000, 0.5, 10.0); // Retorna 2250.0
     * // Explicación: 500000 * 0.5% = 2500 → 10% descuento = 2250
     * </pre>
     * 
     * @param valorCatastral Valor oficial del inmueble
     * @param tasaPorcentual Tasa aplicable en porcentaje (ej. 0.5 para 0.5%)
     * @param descuentoPorcentual Descuento por pago anticipado (ej. 10.0 para 10%)
     * @return Valor del predial con descuento aplicado
     * @throws IllegalArgumentException Si cualquier valor es negativo
     */
    public static double calcularPredial(double valorCatastral, double tasaPorcentual, double descuentoPorcentual) {
        validarEntrada(valorCatastral);
        validarEntrada(tasaPorcentual);
        validarEntrada(descuentoPorcentual);
        
        double impuestoBase = valorCatastral * (tasaPorcentual / 100);
        return impuestoBase * (1 - descuentoPorcentual / 100);
    }
    
    /**
     * Calcula el Impuesto sobre Automóviles Nuevos (ISAN)
     * 
     * <p>Aplica tasas progresivas según el valor del vehículo:</p>
     * <ul>
     *   <li>Hasta $350,000: 2%</li>
     *   <li>$350,001 - $500,000: 7%</li>
     *   <li>$500,001 - $1,000,000: 9%</li>
     *   <li>Más de $1,000,000: 17%</li>
     * </ul>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * double isan = calcularISAN(800000); // Retorna 44500.0
     * // Explicación: 
     * //   Primer tramo: 350000 * 2% = 7,000
     * //   Segundo tramo: (500000-350000) = 150000 * 7% = 10,500
     * //   Tercer tramo: (800000-500000) = 300000 * 9% = 27,000
     * //   Total = 7,000 + 10,500 + 27,000 = 44,500
     * </pre>
     * 
     * @param valorVehiculo Valor de factura del vehículo nuevo
     * @return Valor del ISAN calculado
     * @throws IllegalArgumentException Si el valor es negativo
     */
    public static double calcularISAN(double valorVehiculo) {
        validarEntrada(valorVehiculo);
        
        double impuesto = 0;
        double resto = valorVehiculo;
        
        // Tramo 1: Hasta $350,000
        if (resto > 350_000) {
            impuesto += 350_000 * 0.02;
            resto -= 350_000;
        } else {
            return resto * 0.02;
        }
        
        // Tramo 2: $350,001 - $500,000
        if (resto > 150_000) {
            impuesto += 150_000 * 0.07;
            resto -= 150_000;
        } else {
            return impuesto + (resto * 0.07);
        }
        
        // Tramo 3: $500,001 - $1,000,000
        if (resto > 500_000) {
            impuesto += 500_000 * 0.09;
            resto -= 500_000;
        } else {
            return impuesto + (resto * 0.09);
        }
        
        // Tramo 4: Más de $1,000,000
        impuesto += resto * 0.17;
        
        return impuesto;
    }
}
