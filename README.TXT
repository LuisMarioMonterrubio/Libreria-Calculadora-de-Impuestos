
# 📚 Librería Calculadora de Impuestos Mexicanos

> Componente JavaBean para cálculo preciso de impuestos con validación robusta.

---

## 📌 Índice

- [Características](#características)
- [Tecnologías Usadas](#tecnologías-usadas)
- [Explicación del Código](#explicación-del-código)
- [Métodos y Variables](#métodos-y-variables)
- [Validaciones](#validaciones)
- [Uso del JAR](#uso-del-jar)
- [Ejemplo de Validación](#ejemplo-de-validación)
- [Equipo y Créditos](#equipo-y-créditos)
- [Video Explicativo](#video-explicativo)

---

## ✅ Características

### Funcionalidades principales

- [x] Validación de entrada y control de errores  
- [x] Distribuido como `.jar` reutilizable  
- [ ] Conversión automática al ingresar un solo valor  
- [ ] Estilos visuales configurables desde NetBeans  
- [ ] Propiedad `modoConversion` con editor desplegable  

---

## 🛠 Tecnologías Usadas

| Herramienta         | Uso principal                      |
|---------------------|------------------------------------|
| Java SE 17          | Lógica del componente y POO        |
| Swing (JavaBeans)   | Diseño de interfaces gráficas      |
| NetBeans 25         | Desarrollo y construcción del `.jar` |
| Editor de propiedades | Configuración visual desde NetBeans |
| Git y GitHub        | Control de versiones y documentación |

---

## 🔍 Explicación del Código

La librería proporciona métodos estáticos para calcular 6 impuestos mexicanos clave, validando entradas antes de realizar los cálculos.

flowchart TD
    A[Cliente] --> B[Llamar método]
    B --> C{Validar parámetros}
    C -->|Válidos| D[Calcular impuesto]
    C -->|Inválidos| E[Lanzar excepción]
    D --> F[Retornar resultado]
````

---

## 📋 Métodos y Variables

### Métodos disponibles

| Método            | Parámetros                                                     | Retorno | Descripción                         |
| ----------------- | -------------------------------------------------------------- | ------- | ----------------------------------- |
| `calcularIVA`     | `monto (double)`                                               | double  | Calcula IVA al 16%                  |
| `calcularISR`     | `ingresos (double), deducciones (double)`                      | double  | Calcula ISR con tasa progresiva     |
| `calcularIEPS`    | `monto (double), tasa (double)`                                | double  | Calcula IEPS con tasa personalizada |
| `calcularISN`     | `totalNomina (double), tasaPorcentual (double)`                | double  | Calcula ISN sobre nómina            |
| `calcularPredial` | `valorCatastral, tasaPorcentual, descuentoPorcentual (double)` | double  | Calcula predial con descuento       |
| `calcularISAN`    | `valorVehiculo (double)`                                       | double  | Calcula ISAN con tasas progresivas  |

### Variables clave

| Variable              | Tipo   | Alcance   | Descripción                      |
| --------------------- | ------ | --------- | -------------------------------- |
| `monto`               | double | Parámetro | Base para IVA/IEPS               |
| `ingresos`            | double | Parámetro | Ingresos gravables para ISR      |
| `deducciones`         | double | Parámetro | Deducciones autorizadas para ISR |
| `tasa`                | double | Parámetro | Tasa personalizada IEPS (%)      |
| `totalNomina`         | double | Parámetro | Total nómina gravable para ISN   |
| `tasaPorcentual`      | double | Parámetro | Tasa ISN o Predial (%)           |
| `valorCatastral`      | double | Parámetro | Valor oficial del inmueble       |
| `descuentoPorcentual` | double | Parámetro | Descuento por pronto pago (%)    |
| `valorVehiculo`       | double | Parámetro | Valor del vehículo para ISAN     |

---

## 🛡 Validaciones

| Método            | Validación                          | Mensaje de Error                                 | Ejemplo de Error                    |
| ----------------- | ----------------------------------- | ------------------------------------------------ | ----------------------------------- |
| `calcularIVA`     | `monto >= 0`                        | "Monto no puede ser negativo"                    | `calcularIVA(-100)` → Excepción     |
| `calcularISR`     | `ingresos >= 0 && deducciones >= 0` | "Ingresos o deducciones no pueden ser negativos" | `calcularISR(-500, 0)`              |
| `calcularIEPS`    | `monto >= 0 && tasa >= 0`           | "Monto y tasa no pueden ser negativos"           | `calcularIEPS(100, -5)`             |
| `calcularISN`     | `totalNomina >= 0 && tasa >= 0`     | "Nómina y tasa no pueden ser negativas"          | `calcularISN(-1000, 3)`             |
| `calcularPredial` | `Todos >= 0`                        | "Valores no pueden ser negativos"                | `calcularPredial(-200000, 0.5, 10)` |
| `calcularISAN`    | `valorVehiculo >= 0`                | "Valor no puede ser negativo"                    | `calcularISAN(-500000)`             |

---

## 📥 Uso del JAR

### 1. Descargar

* Ve al repositorio de GitHub
* Entra en **Releases**
* Descarga `Libreria_Impuestos.jar`

### 2. Importar en NetBeans

graph LR
    A[Proyecto] --> B[Libraries]
    B --> C[Add JAR/Folder]
    C --> D[Seleccionar JAR]
    D --> E[Aplicar cambios]
```

### 3. Usar la librería

```java
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
```

### 4. Compilar y ejecutar

NetBeans incluirá automáticamente la librería al compilar el proyecto.

---

## 🧪 Ejemplo de Validación

```java
public static double calcularIVA(double monto) {
    if (monto < 0) {
        throw new IllegalArgumentException("El monto no puede ser negativo");
    }
    return monto * 0.16;
}
```

---

## 📌 Diagrama de Flujo de Validación

```mermaid
flowchart TB
    Start[Inicio método] --> Check{Parámetros >= 0?}
    Check -->|Sí| Calculate[Realizar cálculo]
    Check -->|No| Error[Lanzar IllegalArgumentException]
    Calculate --> Return[Retornar resultado]
    Error --> End[Fin con error]
    Return --> End[Fin exitoso]
```

---

## 👥 Equipo y Créditos

**Proyecto desarrollado por el equipo 14-TAP Verano**

| Nombre                              | Iniciales |
| ----------------------------------- | --------- |
| Monterrubio Diaz Luis Mario         | `LM`      |
| Santiago Espinoza Sócrates Emiliano | `SE`      |

---

## 🎥 Video Explicativo

[![Video explicativo en YouTube](https://img.youtube.com/vi/UxPEz3DOm34/0.jpg)](https://www.youtube.com/watch?v=UxPEz3DOm34)

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

---

```

¿Deseas que te lo genere como archivo `.md` para descarga directa? Puedo preparártelo.
```
