# 📚 Librería Calculadora de Impuestos Mexicanos

<div align="center">

![Java](https://img.shields.io/badge/Java-SE%2017-orange?style=for-the-badge\&logo=java)
![NetBeans](https://img.shields.io/badge/NetBeans-25-blue?style=for-the-badge\&logo=apache-netbeans-ide)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Version](https://img.shields.io/badge/Version-1.0-red?style=for-the-badge)

*Componente JavaBean para cálculo preciso de impuestos mexicanos con validación robusta*

[Características](#-características) •
[Instalación](#-instalación) •
[Uso](#-uso) •
[API](#-documentación-de-la-api) •
[Validaciones](#-validaciones) •
[Autores](#-autores)

</div>

---

## 🎓 Proyecto de Tópicos Avanzados de Programación (TAP)

Este proyecto presenta un **componente gráfico reutilizable y visualmente configurable**, desarrollado en Java utilizando **NetBeans 25** y el enfoque de **JavaBeans**. El componente se integra fácilmente en la paleta de diseño de NetBeans, permitiendo a los desarrolladores arrastrarlo, configurarlo y utilizarlo visualmente en cualquier formulario Swing.

---

## 📋 Tabla de Contenidos

* [🚀 Características](#-características)
* [📦 Instalación](#-instalación)
* [💻 Uso](#-uso)
* [📖 Documentación de la API](#-documentación-de-la-api)
* [🛡 Validaciones](#-validaciones)
* [🎥 Video Explicativo](#-video-explicativo)
* [👥 Autores](#-autores)
* [📄 Licencia](#-licencia)

---

## 🚀 Características

### ✨ Funcionalidades Principales

* ✅ *Validación de entrada* y control de errores robusto
* 📦 *Distribuido como .jar* reutilizable
* 🔧 *Estilos visuales* configurables desde NetBeans
* ⚙ *Propiedad `modoconversion`* con editor desplegable
* 🔄 *Conversión automática* al ingresar un solo valor

### 🛠 Tecnologías y Herramientas

| Herramienta             | Uso Principal                        |
| ----------------------- | ------------------------------------ |
| *Java SE 17*            | Lógica del componente y POO          |
| *Swing (JavaBeans)*     | Diseño de interfaces gráficas        |
| *NetBeans 25*           | Desarrollo y construcción del .jar   |
| *Editor de propiedades* | Configuración visual desde el editor |
| *Git y GitHub*          | Control de versiones y documentación |

---

## 📦 Instalación

### Paso 1: Descargar el archivo JAR

1. Ve al repositorio del proyecto en GitHub
2. Dirígete a la sección *Releases*
3. Descarga el archivo `Libreria_Impuestos.jar`

### Paso 2: Agregar JAR a tu proyecto Java (NetBeans)

```plaintext
Proyecto → Libraries → Add JAR/Folder → Seleccionar Libreria_Impuestos.jar → Aplicar cambios
```

### Paso 3: Importar en tu código

```java
import calculadora.CalculadoraImpuestos;
```

---

## 💻 Uso

### Ejemplo Básico

```java
import calculadora.CalculadoraImpuestos;

public class EjemploUso {
    public static void main(String[] args) {
        try {
            // Calcular IVA
            double iva = CalculadoraImpuestos.calcularIVA(1000.0);
            System.out.println("IVA calculado: $" + iva);

            // Calcular ISR
            double isr = CalculadoraImpuestos.calcularISR(50000.0, 5000.0);
            System.out.println("ISR calculado: $" + isr);

            // Calcular ISN
            double isn = CalculadoraImpuestos.calcularISN(50000.0, 2.5);
            System.out.println("ISN calculado: $" + isn);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```

### Ejemplo con Manejo de Errores

```java
public class EjemploValidacion {
    public static void main(String[] args) {
        try {
            // Esto lanzará una excepción
            double iva = CalculadoraImpuestos.calcularIVA(-100.0);
        } catch (IllegalArgumentException e) {
            System.err.println("Error de validación: " + e.getMessage());
        }
    }
}
```

---

## 📖 Documentación de la API

### 📋 Métodos Disponibles

| Método          | Parámetros                                                                     | Retorno | Descripción                         |
| --------------- | ------------------------------------------------------------------------------ | ------- | ----------------------------------- |
| calcularIVA     | monto (double)                                                                 | double  | Calcula IVA al 16%                  |
| calcularISR     | ingresos (double), deducciones (double)                                        | double  | Calcula ISR con tasa progresiva     |
| calcularIEPS    | monto (double), tasa (double)                                                  | double  | Calcula IEPS con tasa personalizada |
| calcularISN     | totalNomina (double), tasaPorcentual (double)                                  | double  | Calcula ISN sobre nómina            |
| calcularPredial | valorCatastral (double), tasaPorcentual (double), descuentoPorcentual (double) | double  | Calcula predial con descuento       |
| calcularISAN    | valorVehiculo (double)                                                         | double  | Calcula ISAN con tasas progresivas  |

### 📊 Variables y Parámetros

| Variable            | Tipo   | Alcance   | Descripción                         |
| ------------------- | ------ | --------- | ----------------------------------- |
| monto               | double | Parámetro | Base para cálculo de IVA/IEPS       |
| ingresos            | double | Parámetro | Ingresos gravables para ISR         |
| deducciones         | double | Parámetro | Deducciones autorizadas para ISR    |
| tasa                | double | Parámetro | Tasa personalizada para IEPS (%)    |
| totalNomina         | double | Parámetro | Total de nómina gravable para ISN   |
| tasaPorcentual      | double | Parámetro | Tasa aplicable para ISN/Predial (%) |
| valorCatastral      | double | Parámetro | Valor oficial del inmueble          |
| descuentoPorcentual | double | Parámetro | Descuento por pago anticipado (%)   |
| valorVehiculo       | double | Parámetro | Valor de factura del vehículo       |

---

## 🛡 Validaciones

| Método          | Validación                              | Mensaje de Error                                 | Ejemplo de Error                              |
| --------------- | --------------------------------------- | ------------------------------------------------ | --------------------------------------------- |
| calcularIVA     | monto >= 0                              | "El monto no puede ser negativo"                 | calcularIVA(-100) → Excepción                 |
| calcularISR     | ingresos >= 0 && deducciones >= 0       | "Ingresos o deducciones no pueden ser negativos" | calcularISR(-500, 0) → Excepción              |
| calcularIEPS    | monto >= 0 && tasa >= 0                 | "Monto y tasa no pueden ser negativos"           | calcularIEPS(100, -5) → Excepción             |
| calcularISN     | totalNomina >= 0 && tasaPorcentual >= 0 | "Nómina y tasa no pueden ser negativas"          | calcularISN(-1000, 3) → Excepción             |
| calcularPredial | Todos los parámetros >= 0               | "Valores no pueden ser negativos"                | calcularPredial(-200000, 0.5, 10) → Excepción |
| calcularISAN    | valorVehiculo >= 0                      | "Valor de vehículo no puede ser negativo"        | calcularISAN(-500000) → Excepción             |

### Ejemplo de Implementación de Validación

```java
public static double calcularIVA(double monto) {
    if (monto < 0) {
        throw new IllegalArgumentException("El monto no puede ser negativo");
    }
    return monto * 0.16;
}
```

---

## 🎥 Video Explicativo

🔗 [Ver en YouTube](https://youtu.be/sArp10JAIaM?si=rrlFWsZgoFCe_PSi)

---

## 👥 Autores

**Equipo 14 - TAP Verano**

```text
* 🧑‍💻 Monterrubio Díaz Luis Mario
* 👨‍💻 Santiago Espinoza Sócrates Emiliano
```

---

## 📄 Licencia

Distribuido bajo licencia MIT. Consulta el archivo `LICENSE` para más información.
