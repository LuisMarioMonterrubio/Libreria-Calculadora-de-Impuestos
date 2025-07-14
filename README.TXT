<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Librería Calculadora de Impuestos Mexicanos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/mermaid@10.0.2/dist/mermaid.min.js"></script>
    <style>
        :root {
            --primary: #2c3e50;
            --secondary: #3498db;
            --accent: #e74c3c;
            --light: #ecf0f1;
            --dark: #34495e;
        }
        
        body {
            background-color: #f8f9fa;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: var(--dark);
        }
        
        .header {
            background: linear-gradient(135deg, var(--primary), var(--secondary));
            color: white;
            padding: 3rem 0;
            margin-bottom: 2rem;
            border-radius: 0 0 1rem 1rem;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }
        
        .feature-card {
            transition: transform 0.3s, box-shadow 0.3s;
            border: none;
            border-radius: 0.75rem;
            overflow: hidden;
            margin-bottom: 1.5rem;
        }
        
        .feature-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 20px rgba(0,0,0,0.1);
        }
        
        .feature-card .card-header {
            background-color: var(--secondary);
            color: white;
            font-weight: bold;
            border-bottom: none;
        }
        
        .card-title {
            color: var(--primary);
            font-weight: 600;
        }
        
        .card {
            border: none;
            box-shadow: 0 4px 8px rgba(0,0,0,0.05);
            border-radius: 0.75rem;
            margin-bottom: 1.5rem;
        }
        
        .section-title {
            position: relative;
            padding-bottom: 0.75rem;
            margin-bottom: 1.5rem;
            color: var(--primary);
            font-weight: 700;
        }
        
        .section-title::after {
            content: '';
            position: absolute;
            bottom: 0;
            left: 0;
            width: 80px;
            height: 4px;
            background: var(--secondary);
            border-radius: 2px;
        }
        
        .list-group-item {
            border: none;
            padding: 1rem 1.25rem;
            border-bottom: 1px solid rgba(0,0,0,0.05);
        }
        
        .list-group-item:last-child {
            border-bottom: none;
        }
        
        .table th {
            background-color: var(--secondary);
            color: white;
            font-weight: 600;
        }
        
        .table-hover tbody tr:hover {
            background-color: rgba(52, 152, 219, 0.05);
        }
        
        .code-block {
            background-color: #2d2d2d;
            color: #f8f8f2;
            border-radius: 0.5rem;
            padding: 1.5rem;
            overflow-x: auto;
            font-family: 'Consolas', monospace;
        }
        
        .code-keyword {
            color: #f92672;
        }
        
        .code-method {
            color: #a6e22e;
        }
        
        .code-comment {
            color: #75715e;
        }
        
        .mermaid-container {
            background-color: white;
            padding: 1.5rem;
            border-radius: 0.75rem;
            box-shadow: 0 4px 8px rgba(0,0,0,0.05);
            margin-bottom: 1.5rem;
        }
        
        .team-card {
            text-align: center;
            padding: 1.5rem;
        }
        
        .team-card img {
            width: 100px;
            height: 100px;
            object-fit: cover;
            border-radius: 50%;
            margin-bottom: 1rem;
            border: 4px solid var(--secondary);
        }
        
        footer {
            background-color: var(--primary);
            color: white;
            padding: 2rem 0;
            margin-top: 3rem;
            border-radius: 1rem 1rem 0 0;
        }
        
        .video-container {
            position: relative;
            padding-bottom: 56.25%;
            height: 0;
            overflow: hidden;
            border-radius: 0.75rem;
            box-shadow: 0 8px 16px rgba(0,0,0,0.1);
        }
        
        .video-container iframe {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            border: none;
        }
        
        .badge-feature {
            background-color: var(--accent);
            font-size: 0.8rem;
            padding: 0.4rem 0.75rem;
            border-radius: 2rem;
            margin-right: 0.5rem;
            margin-bottom: 0.5rem;
        }
    </style>
</head>
<body>
    <!-- Encabezado -->
    <header class="header text-center">
        <div class="container">
            <h1 class="display-4 fw-bold">📚 Librería Calculadora de Impuestos Mexicanos</h1>
            <p class="lead">Componente JavaBean para cálculo preciso de impuestos con validación robusta</p>
            <div class="mt-4">
                <a href="#features" class="btn btn-light btn-lg me-2">Características</a>
                <a href="#usage" class="btn btn-outline-light btn-lg">Cómo Usar</a>
            </div>
        </div>
    </header>

    <div class="container">
        <!-- Sección de características clave -->
        <section id="features" class="mb-5">
            <h2 class="section-title">Características clave</h2>
            
            <div class="row">
                <div class="col-md-6">
                    <div class="feature-card card">
                        <div class="card-header">Funcionalidades Principales</div>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item d-flex align-items-center">
                                <input class="form-check-input me-3" type="checkbox" disabled>
                                Conversión automática al ingresar un solo valor
                            </li>
                            <li class="list-group-item d-flex align-items-center">
                                <input class="form-check-input me-3" type="checkbox" checked disabled>
                                Validación de entrada y control de errores
                            </li>
                            <li class="list-group-item d-flex align-items-center">
                                <input class="form-check-input me-3" type="checkbox" disabled>
                                Estilos visuales configurables desde NetBeans
                            </li>
                            <li class="list-group-item d-flex align-items-center">
                                <input class="form-check-input me-3" type="checkbox" disabled>
                                Propiedad modoconversion con editor desplegable
                            </li>
                            <li class="list-group-item d-flex align-items-center">
                                <input class="form-check-input me-3" type="checkbox" checked disabled>
                                Distribuido como .jar reutilizable
                            </li>
                        </ul>
                    </div>
                </div>
                
                <div class="col-md-6">
                    <div class="feature-card card">
                        <div class="card-header">Tecnologías y herramientas</div>
                        <div class="card-body">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>Herramienta</th>
                                        <th>Uso principal</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Java SE 17</td>
                                        <td>Lógica del componente y POO</td>
                                    </tr>
                                    <tr>
                                        <td>Swing (JavaBeans)</td>
                                        <td>Diseño de interfaces gráficas</td>
                                    </tr>
                                    <tr>
                                        <td>NetBeans 25</td>
                                        <td>Desarrollo y construcción del .jar</td>
                                    </tr>
                                    <tr>
                                        <td>Editor de propiedades</td>
                                        <td>Configuración visual desde el editor</td>
                                    </tr>
                                    <tr>
                                        <td>Git y GitHub</td>
                                        <td>Control de versiones y documentación</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Explicación del código -->
        <section class="mb-5">
            <h2 class="section-title">🔍 Explicación del Código</h2>
            <div class="card">
                <div class="card-body">
                    <p>La librería proporciona métodos estáticos para calcular 6 impuestos mexicanos clave con validaciones robustas:</p>
                    
                    <div class="mermaid-container">
                        <div class="mermaid">
                            flowchart TD
                                A[Cliente] --> B[Llamar método]
                                B --> C{Validar parámetros}
                                C -->|Válidos| D[Calcular impuesto]
                                C -->|Inválidos| E[Lanzar excepción]
                                D --> F[Retornar resultado]
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Métodos y variables -->
        <div class="row mb-5">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header bg-primary text-white">📋 Tabla de Métodos</div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>Método</th>
                                        <th>Parámetros</th>
                                        <th>Retorno</th>
                                        <th>Descripción</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>calcularIVA</td>
                                        <td>monto (double)</td>
                                        <td>double</td>
                                        <td>Calcula IVA al 16%</td>
                                    </tr>
                                    <tr>
                                        <td>calcularISR</td>
                                        <td>ingresos (double), deducciones (double)</td>
                                        <td>double</td>
                                        <td>Calcula ISR con tasa progresiva</td>
                                    </tr>
                                    <tr>
                                        <td>calcularIEPS</td>
                                        <td>monto (double), tasa (double)</td>
                                        <td>double</td>
                                        <td>Calcula IEPS con tasa personalizada</td>
                                    </tr>
                                    <tr>
                                        <td>calcularISN</td>
                                        <td>totalNomina (double), tasaPorcentual (double)</td>
                                        <td>double</td>
                                        <td>Calcula ISN sobre nómina</td>
                                    </tr>
                                    <tr>
                                        <td>calcularPredial</td>
                                        <td>valorCatastral (double), tasaPorcentual (double), descuentoPorcentual (double)</td>
                                        <td>double</td>
                                        <td>Calcula predial con descuento</td>
                                    </tr>
                                    <tr>
                                        <td>calcularISAN</td>
                                        <td>valorVehiculo (double)</td>
                                        <td>double</td>
                                        <td>Calcula ISAN con tasas progresivas</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header bg-primary text-white">📊 Tabla de Variables</div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>Variable</th>
                                        <th>Tipo</th>
                                        <th>Alcance</th>
                                        <th>Descripción</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>monto</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Base para cálculo de IVA/IEPS</td>
                                    </tr>
                                    <tr>
                                        <td>ingresos</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Ingresos gravables para ISR</td>
                                    </tr>
                                    <tr>
                                        <td>deducciones</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Deducciones autorizadas para ISR</td>
                                    </tr>
                                    <tr>
                                        <td>tasa</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Tasa personalizada para IEPS (%)</td>
                                    </tr>
                                    <tr>
                                        <td>totalNomina</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Total de nómina gravable para ISN</td>
                                    </tr>
                                    <tr>
                                        <td>tasaPorcentual</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Tasa aplicable para ISN/Predial (%)</td>
                                    </tr>
                                    <tr>
                                        <td>valorCatastral</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Valor oficial del inmueble</td>
                                    </tr>
                                    <tr>
                                        <td>descuentoPorcentual</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Descuento por pago anticipado (%)</td>
                                    </tr>
                                    <tr>
                                        <td>valorVehiculo</td>
                                        <td>double</td>
                                        <td>Parámetro</td>
                                        <td>Valor de factura del vehículo</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- Validaciones -->
        <section class="mb-5">
            <h2 class="section-title">🛡 Tabla de Validaciones</h2>
            <div class="card">
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Método</th>
                                    <th>Validación</th>
                                    <th>Mensaje de Error</th>
                                    <th>Ejemplo de Error</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>calcularIVA</td>
                                    <td>monto >= 0</td>
                                    <td>"Monto no puede ser negativo"</td>
                                    <td>calcularIVA(-100) → Excepción</td>
                                </tr>
                                <tr>
                                    <td>calcularISR</td>
                                    <td>ingresos >= 0 && deducciones >= 0</td>
                                    <td>"Ingresos o deducciones no pueden ser negativos"</td>
                                    <td>calcularISR(-500, 0) → Excepción</td>
                                </tr>
                                <tr>
                                    <td>calcularIEPS</td>
                                    <td>monto >= 0 && tasa >= 0</td>
                                    <td>"Monto y tasa no pueden ser negativos"</td>
                                    <td>calcularIEPS(100, -5) → Excepción</td>
                                </tr>
                                <tr>
                                    <td>calcularISN</td>
                                    <td>totalNomina >= 0 && tasaPorcentual >= 0</td>
                                    <td>"Nómina y tasa no pueden ser negativas"</td>
                                    <td>calcularISN(-1000, 3) → Excepción</td>
                                </tr>
                                <tr>
                                    <td>calcularPredial</td>
                                    <td>Todos los parámetros >= 0</td>
                                    <td>"Valores no pueden ser negativos"</td>
                                    <td>calcularPredial(-200000, 0.5, 10) → Excepción</td>
                                </tr>
                                <tr>
                                    <td>calcularISAN</td>
                                    <td>valorVehiculo >= 0</td>
                                    <td>"Valor de vehículo no puede ser negativo"</td>
                                    <td>calcularISAN(-500000) → Excepción</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Instrucciones para importar -->
        <section id="usage" class="mb-5">
            <h2 class="section-title">📥 Instrucciones para Importar el JAR</h2>
            
            <div class="row">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header bg-success text-white">Paso 1: Descargar el archivo JAR</div>
                        <div class="card-body">
                            <ol>
                                <li>Ve al repositorio del proyecto en GitHub</li>
                                <li>Dirígete a la sección <strong>Releases</strong></li>
                                <li>Descarga el archivo <code>Libreria_Impuestos.jar</code></li>
                            </ol>
                        </div>
                    </div>
                    
                    <div class="card mt-4">
                        <div class="card-header bg-success text-white">Paso 2: Agregar JAR a tu proyecto Java (NetBeans)</div>
                        <div class="card-body">
                            <div class="mermaid-container">
                                <div class="mermaid">
                                    graph LR
                                        A[Proyecto] --> B[Libraries]
                                        B --> C[Add JAR/Folder]
                                        C --> D[Seleccionar Libreria_Impuestos.jar]
                                        D --> E[Aplicar cambios]
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header bg-success text-white">Paso 3: Usar la librería en tu código</div>
                        <div class="card-body">
                            <div class="code-block">
                                <span class="code-keyword">import</span> calculadora.CalculadoraImpuestos;<br><br>
                                
                                <span class="code-keyword">public class</span> MiClase {<br>
                                &nbsp;&nbsp;&nbsp;&nbsp;<span class="code-keyword">public static void</span> main(String[] args) {<br>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="code-comment">// Ejemplo de uso</span><br>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="code-keyword">double</span> iva = CalculadoraImpuestos.<span class="code-method">calcularIVA</span>(1000.0);<br>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println(<span class="code-comment">"IVA calculado: "</span> + iva);<br><br>
                                
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="code-keyword">double</span> isn = CalculadoraImpuestos.<span class="code-method">calcularISN</span>(50000.0, 2.5);<br>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println(<span class="code-comment">"ISN calculado: "</span> + isn);<br>
                                &nbsp;&nbsp;&nbsp;&nbsp;}<br>
                                }
                            </div>
                        </div>
                    </div>
                    
                    <div class="card mt-4">
                        <div class="card-header bg-success text-white">Paso 4: Compilar y ejecutar</div>
                        <div class="card-body">
                            <p>Ejecuta tu proyecto normalmente. NetBeans incluirá automáticamente la librería en el classpath.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Ejemplo de validación -->
        <section class="mb-5">
            <h2 class="section-title">🧪 Ejemplo de Validación en Código</h2>
            <div class="card">
                <div class="card-body">
                    <div class="code-block">
                        <span class="code-keyword">public static double</span> <span class="code-method">calcularIVA</span>(<span class="code-keyword">double</span> monto) {<br>
                        &nbsp;&nbsp;&nbsp;&nbsp;<span class="code-keyword">if</span> (monto < 0) {<br>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="code-keyword">throw new</span> IllegalArgumentException(<span class="code-comment">"El monto no puede ser negativo"</span>);<br>
                        &nbsp;&nbsp;&nbsp;&nbsp;}<br>
                        &nbsp;&nbsp;&nbsp;&nbsp;<span class="code-keyword">return</span> monto * 0.16;<br>
                        }
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Diagrama de flujo de validaciones -->
        <section class="mb-5">
            <h2 class="section-title">📌 Diagrama de Flujo de Validaciones</h2>
            <div class="mermaid-container">
                <div class="mermaid">
                    flowchart TB
                        Start[Inicio método] --> Check{Parámetros >= 0?}
                        Check -->|Sí| Calculate[Realizar cálculo]
                        Check -->|No| Error[Lanzar IllegalArgumentException]
                        Calculate --> Return[Retornar resultado]
                        Error --> End[Fin con error]
                        Return --> End[Fin exitoso]
                </div>
            </div>
        </section>
        
        <!-- Equipo y video -->
        <div class="row mb-5">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header bg-info text-white">👥 Elaborado por:</div>
                    <div class="card-body">
                        <div class="text-center">
                            <p class="lead fw-bold">Equipo 14-TAP verano</p>
                            <div class="d-flex justify-content-around mt-4">
                                <div class="team-card">
                                    <div class="bg-secondary rounded-circle d-flex align-items-center justify-content-center" style="width: 100px; height: 100px; margin: 0 auto 1rem;">
                                        <span class="text-white fs-1">LM</span>
                                    </div>
                                    <h5>Monterrubio Diaz Luis Mario</h5>
                                </div>
                                <div class="team-card">
                                    <div class="bg-secondary rounded-circle d-flex align-items-center justify-content-center" style="width: 100px; height: 100px; margin: 0 auto 1rem;">
                                        <span class="text-white fs-1">SE</span>
                                    </div>
                                    <h5>Santiago Espinoza Sócrates Emiliano</h5>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header bg-info text-white">🎥 Video Explicativo</div>
                    <div class="card-body">
                        <div class="video-container">
                            <iframe src="https://www.youtube.com/embed/UxPEz3DOm34" title="Video Explicativo" allowfullscreen></iframe>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Pie de página -->
    <footer class="text-center">
        <div class="container">
            <p class="mb-0">© 2023 - Equipo 14-TAP verano - Todos los derechos reservados</p>
            <p class="mb-0">Librería Calculadora de Impuestos Mexicanos - Versión 1.0</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        // Inicializar Mermaid
        mermaid.initialize({
            startOnLoad: true,
            theme: 'default',
            securityLevel: 'loose',
            flowchart: {
                useMaxWidth: false,
                htmlLabels: true,
                curve: 'basis'
            }
        });
    </script>
</body>
</html>

