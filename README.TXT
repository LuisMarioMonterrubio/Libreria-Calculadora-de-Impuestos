📚 Librería Calculadora de Impuestos Mexicanos

🔍 Explicación del Código
La librería proporciona métodos estáticos para calcular 6 impuestos mexicanos clave con validaciones robustas:
flowchart TD
    A[Cliente] --> B[Llamar método]
    B --> C{Validar parámetros}
    C -->|Válidos| D[Calcular impuesto]
    C -->|Inválidos| E[Lanzar excepción]
    D --> F[Retornar resultado]

📋 Tabla de Métodos
Método	Parámetros	Retorno	Descripción
calcularIVA	monto (double)	double	Calcula IVA al 16%
calcularISR	ingresos (double), deducciones (double)	double	Calcula ISR con tasa progresiva
calcularIEPS	monto (double), tasa (double)	double	Calcula IEPS con tasa personalizada
calcularISN	totalNomina (double), tasaPorcentual (double)	double	Calcula ISN sobre nómina
calcularPredial	valorCatastral (double), tasaPorcentual (double), descuentoPorcentual (double)	double	Calcula predial con descuento
calcularISAN	valorVehiculo (double)	double	Calcula ISAN con tasas progresivas

📊 Tabla de Variables
Variable	Tipo	Alcance	Descripción
monto	double	Parámetro	Base para cálculo de IVA/IEPS
ingresos	double	Parámetro	Ingresos gravables para ISR
deducciones	double	Parámetro	Deducciones autorizadas para ISR
tasa	double	Parámetro	Tasa personalizada para IEPS (%)
totalNomina	double	Parámetro	Total de nómina gravable para ISN
tasaPorcentual	double	Parámetro	Tasa aplicable para ISN/Predial (%)
valorCatastral	double	Parámetro	Valor oficial del inmueble
descuentoPorcentual	double	Parámetro	Descuento por pago anticipado (%)
valorVehiculo	double	Parámetro	Valor de factura del vehículo

🛡️ Tabla de Validaciones
Método	Validación	Mensaje de Error	Ejemplo de Error
calcularIVA	monto >= 0	"Monto no puede ser negativo"	calcularIVA(-100) → Excepción
calcularISR	ingresos >= 0 && deducciones >= 0	"Ingresos o deducciones no pueden ser negativos"	calcularISR(-500, 0) → Excepción
calcularIEPS	monto >= 0 && tasa >= 0	"Monto y tasa no pueden ser negativos"	calcularIEPS(100, -5) → Excepción
calcularISN	totalNomina >= 0 && tasaPorcentual >= 0	"Nómina y tasa no pueden ser negativas"	calcularISN(-1000, 3) → Excepción
calcularPredial	Todos los parámetros >= 0	"Valores no pueden ser negativos"	calcularPredial(-200000, 0.5, 10) → Excepción
calcularISAN	valorVehiculo >= 0	"Valor de vehículo no puede ser negativo"	calcularISAN(-500000) → Excepción

📥 Instrucciones para Importar el JAR
Paso 1: Descargar el archivo JAR
Ve al repositorio del proyecto en GitHub

Dirígete a la sección Releases

Descarga el archivo Libreria_Impuestos.jar

Paso 2: Agregar JAR a tu proyecto Java (NetBeans)

graph LR
    A[Proyecto] --> B[Libraries]
    B --> C[Add JAR/Folder]
    C --> D[Seleccionar Libreria_Impuestos.jar]
    D --> E[Aplicar cambios]
Abre tu proyecto en NetBeans

Haz clic derecho en la carpeta Libraries

Selecciona Add JAR/Folder...

Busca y selecciona Libreria_Impuestos.jar

Haz clic en Abrir

Paso 3: Usar la librería en tu código
java
import calculadora.CalculadoraImpuestos;

public class MiClase {
    public static void main(String[] args) {
        // Ejemplo de uso
        double iva = CalculadoraImpuestos.calcularIVA(1000.0);
        System.out.println("IVA calculado: " + iva);
        
        double isn = CalculadoraImpuestos.calcularISN(50000.0, 2.5);
        System.out.println("ISN calculado: " + isn);
    }
}
Paso 4: Compilar y ejecutar
Ejecuta tu proyecto normalmente

NetBeans incluirá automáticamente la librería en el classpath


🧪 Ejemplo de Validación en Código
java
public static double calcularIVA(double monto) {
    if (monto < 0) {
        throw new IllegalArgumentException("El monto no puede ser negativo");
    }
    return monto * 0.16;
}

📌 Diagrama de Flujo de Validaciones
flowchart TB
    Start[Inicio método] --> Check{Parámetros >= 0?}
    Check -->|Sí| Calculate[Realizar cálculo]
    Check -->|No| Error[Lanzar IllegalArgumentException]
    Calculate --> Return[Retornar resultado]
    Error --> End[Fin con error]
    Return --> End[Fin exitoso]
👥 Elaborado por:
Monterrubio Diaz Luis Mario

Santiago Espinoza Sócrates Emiliano

🎥 Video Explicativo
https://youtu.be/UxPEz3DOm34?feature=shared
