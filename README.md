# Informe TB1
**Universidad Peruana de Ciencias Aplicadas**

**Ingeniería de Software**

**Desarrollo de Aplicaciones Open Source- SW51**

**Docente:** Angel Augusto Velasquez Nuñez

**Startup**: Integradis

**Producto**: Greenhouse

## Team members:
| Nombre |Código|
|:-------:|:----------:|
|Comettant Rubiños, Jessica Elizabeth|U20211C009|
|Espinoza Rodriguez, Nicolas Antonio|U202110278|
|Galavis Du Bois, Alan Enrique|U202110223|
|Seminario Garbin, Carlo Luca|U20211A475|
|Soto Kong Requena, Andres Eduardo|U202116113|

**Ciclo 2023-02**

## Registro de versiones del informe

| Versión |Fecha|Autor|Descripción de modificación |
|:-------:|:----------:|:---------------------------------------------:|:--------------------:|
|1.0|15/08/2023|Comettant, Espinoza, Galavis, Seminario, Soto|Creación del documento de trabajo en formato markdown|

## Contenido

1. **Capítulo I: Introducción.**
    1. Startup Profile.
        1. Descripción del startup.
        2. Perfiles de los integrantes del equipo.
    2. Solution Profile.
        1. Antecedentes y Problemática.
        2. Lean UX Process.
            1. Lean UX Problem Statements.
            2. Lean UX Assumptions.
            3. Lean UX Hypothesis Statements.
            4. Lean UX Canvas.
    3. Segmentos objetivo.
2. **Capítulo II: Requirements Elicitation & Analysis.**
    1. Competidores.
        1. Análisis competitivo.
        2. Estrategias y tácticas frente a competidores.
    2. Entrevistas.
        1. Diseño de entrevistas.
        2. Registro de entrevistas.
        3. Análisis de entrevistas.
    3. Needfinding.
        1. User Personas.
        2. User Task Matrix.
        3. User Journey Mapping.
        4. Empathy Mapping.
        5. As-is Scenario Mapping.
4. **Capítulo III: Requirements Specification.**
    1. To-Be Scenario Mapping.
    2. User Stories.
    3. Impact Mapping.
    4. Product Backlog.
9. **Capítulo IV: Product Design.**
    1. Style Guidelines.
        1. General Style Guidelines.
        2. Web Style Guidelines.
    2. Information Architecture.
        1. Organization Systems.
        2. Labeling Systems.
        3. SEO Tags and Meta Tags
        4. Searching Systems.
        5. Navigation Systems.
    3. Landing Page UI Design.
        1. Landing Page Wireframe.
        2. Landing Page Mock-up.
    4. Web Applications UX/UI Design.
        1. Web Applications Wireframes.
        2. Web Applications Wireflow Diagrams.
        3. Web Applications Mock-ups.
        4. Web Applications User Flow Diagrams.
    5. Web Applications Prototyping.
    6. Domain-Driven Software Architecture.
        1. Software Architecture Context Diagram.
        2. Software Architecture Container Diagrams.
        3. Software Architecture Components Diagrams.
    7. Software Object-Oriented Design.
        1. Class Diagrams.
        2. Class Dictionary.
    8. Database Design.
        1. Database Diagram.
11. **Capítulo V: Product Implementation, Validation & Deployment.**
    1. Software Configuration Management.
        1. Software Development Environment Configuration.
        2. Source Code Management.
        3. Source Code Style Guide & Conventions.
        4. Software Deployment Configuration.
    2. Landing Page, Services & Applications Implementation.
        1. Sprint 1
            1. Sprint Planning 1.
            2. Sprint Backlog 1.
            3. Development Evidence for Sprint Review.
            4. Testing Suite Evidence for Sprint Review.
            5. Execution Evidence for Sprint Review.
            6. Services Documentation Evidence for Sprint Review.
            7. Software Deployment Evidence for Sprint Review.
            8. Team Collaboration Insights during Sprint.
12. **Conclusiones.**
13. **Bibliografía.**
14. **Anexos.**



## Capítulo I: Introducción.

### 1. **Startup Profile.**
En esta sección se presenta la descripción del startup y los perfiles de los miembros del equipo.
####     1.1. Descripción del startup
La startup, presentada con el nombre de “Integradis”,se enfoca en ofrecer una solución de índole tecnológica avanzada a la industria champiñonera del Perú. Para ello, implementa una plataforma encargada de segmentar el proceso de producción del cultivo de champiñones en determinadas fases. Estas involucran la elaboración del compost, fase de cocina (cocción, pasteurización y acondicionamiento del búnker), la recolección y siembra, la administración de procesos, entre otros. Así mismo, se establece un análisis efectivo entre datos históricos de previo registro y actualizados a tiempo real para la trazabilidad de metas a largo plazo como agroempresa. Es así que, se evalúan los costos operativos actuales, la demanda de exportaciones y se toman futuras decisiones dentro del mercado. Nuestra misión es revolucionar la forma en que las fábricas de champiñones monitorean, registran y optimizan sus procesos de producción a través de una aplicación web intuitiva y poderosa. 

Misión: Revolucionar la documentación de los procesos fundamentales de las fábricas enfocadas en la producción de champiñones del Perú.

Visión: GreenHouse se direcciona a ser la plataforma más destacada dentro del mercado respecto al registro de procesos para los próximos tres años. 
Integradis busca ser reconocido como un modelo de negocio sostenible y comprometido en brindar un servicio de calidad capaz de satisfacer las necesidades de los usuarios.

##### Logotipo de la Startup:
![logotipo_start](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/105735491/e6a54426-ae3c-4f8f-a684-a6bfcc53ee35)
##### Logotipo del servicio
![logotipo_servicio](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/105735491/24685994-1b60-4a6e-9c38-0380e92027d8)
####     1.2. Perfiles de los integrantes del equipo


| Perfiles de los integrantes del equipo |        |
| :--------| :--------: |
| Mi nombre es **Nicolás Antonio Espinoza Rodriguez**. Tengo 19 años y estoy estudiando la carrera de ingeniería de software en la UPC desde el año 2021. Soy una persona creativa e imaginativa, lo que me ayuda a aportar soluciones para resolver los problemas en común. También, me considero empático y colaborativo, lo que facilita el trabajo en equipo con mis compañeros. Finalmente, me considero una persona ordenada y con ambición, lo que ayuda a trazar metas posibles y significativas para la solución que queremos presentar como equipo. Soy competente en los lenguajes de programación C++, Python y Javascript. Además, tengo conocimiento de tecnologías ágiles y software de control de versiones.|<img src="https://hackmd.io/_uploads/H1dUSaqhn.png" alt="Nicolas Espinoza" width="250px" />
| Mi nombre es **Alan Enrique Galavis Du Bois**, tengo 20 años y actualmente curso el sexto ciclo de la carrera de ingeniería de software en la UPC (Universidad Peruana de Ciencias Aplicadas). Considero que soy organizado, perseverante y creativo, cualidades que me serán de gran utilidad al momento de trabajar en equipo. Me apasiona encontrar soluciones innovadoras a problemas relacionados con la computación. Al haber crecido en la era digital, estoy familiarizado con el uso de tecnologías de la información y la comunicación.|![](https://hackmd.io/_uploads/S1znb692n.png)|
Mi nombre es **Carlo Luca Seminario Garbín** tengo 19 años de edad y actualmente curso el sexto ciclo de la carrera de ingeniería de software en la Universidad Peruana de Ciencias Aplicadas (UPC). Considero que soy una persona que es capaz de trabajar bajo presión, además de ser responsable y perseverante. En cuanto a cualidades para la realización del trabajo considero que soy bueno identificando problemáticas y proponiendo soluciones, a lo que le puedo sumar los conocimientos previos de los ciclos anteriores en cursos de programación y conocimientos adquiridos mediante mi aprendizaje autónomo.|![](https://hackmd.io/_uploads/SJvfXTq22.png)|
Mi nombre es **Andrés Eduardo Soto Kong Requena**, soy estudiante de ingeniería de software de la UPC (Universidad Peruana de Ciencias Aplicadas). Me gusta generar soluciones para problemas digitales, es por ello que elegí dicha carrera. Además, me considero bueno para trabajar en situaciones bajo estrés. De la misma forma, considero que las situaciones de mi vida personal me han preparado para afrontar una gran variedad de situaciones en las áreas, tanto laboral como social. Finalmente, soy una persona responsable, lo cual me ha ayudado en una gran cantidad de ocasiones en el momento de la entrega de trabajos.|![](https://hackmd.io/_uploads/r1eHSaq32.png)|
Mi nombre es **Jessica Elizabeth Comettant Rubiños** y tengo 19 años. Soy estudiante de la carrera de ingeniería de software de la UPC (Universidad Peruana de Ciencias Aplicadas). Estoy en el quinto ciclo de mi carrera. Gracias a las asignaturas correspondientes a la malla curricular de mi carrera, cuento con las habilidades intelectuales propicias para el desarrollo del proyecto. Asimismo, mi personalidad se encuentra basada en la autonomía. Por lo tanto, he sido capaz de extender mis conocimientos de programación con mayor material de estudio. Finalmente, destaco de mi personalidad la empatía, la responsabilidad, la amabilidad y la capacidad de trabajar en equipo.|![](https://hackmd.io/_uploads/HkXOtvkCh.png)

### 2. **Solution Profile.**
####     2.1. Antecedentes y Problemática
##### ¿Cuáles son las 5W?
###### What (Qué)
###### ¿Cuál es el problema?
 El problema radica en la ausencia de una herramienta cuya capacidad sea proporcionar al personal técnico, de supervisión y administrativo, un registro digital de los procesos involucrados en el crecimiento y 
 elaboración de cultivos de industrias champiñoneras en el Perú. A pesar del uso de sistemas manuales para el registro de procesos, es un sistema propenso a fallos relacionados con errores humanos y resultan 
 difíciles de navegar cuando se necesitan registros puntuales.

###### When (Cuando)
###### ¿Cuándo sucede el problema?
El dilema principal surge cuando se percibe la necesidad de entablar un análisis ágil y eficiente de la producción de cultivos en las industrias champiñoneras a partir de los factores ambientales y económicos dentro del contexto interno de la empresa. Asimismo, se comprende la escasez de innovación tecnológica (automatización) en el registro de cultivos.

###### Where (Dónde)
###### ¿A dónde se dirige?
El servicio está direccionado a ser agente de solución hacia las fábricas que incorporan el sector industria champiñonera del Perú.

###### ¿Dónde surge el problema?
El problema se manifiesta durante el desarrollo de las fases transcurridas para el registro de cultivos en las industrias champiñoneras. Es así que se involucra tanto al área de producción, siembra, cocción y pasteurización.

###### Who (Quién)
###### ¿Quiénes están involucrados? ¿Quién lo utilizará?
Los usuarios del sistema serían los técnicos encargados de la supervisión de los cultivos y los administradores de las fábricas champiñoneras en Perú. El personal técnico utilizaría la aplicación para registrar y monitorear en tiempo real los datos de crecimiento, humedad, temperatura, y otros aspectos cruciales en la producción de champiñones. Por otro lado, los administradores emplearían la plataforma para acceder a información clave generada por los técnicos y, así, realizar un seguimiento más amplio de la producción. Los datos recopilados en la aplicación les permitirán tomar decisiones estratégicas informadas como la asignación de recursos, la programación de tareas y la identificación de áreas de mejora en la producción.

###### Why (Por qué)
###### ¿Cuál es la causa del problema?
La causa principal del problema es la dificultad de incluir un sistema digital a una industria manual ya establecida. Muchos trabajadores de las fábricas champiñoneras no manejan eficientemente los medios digitales, por consiguiente, la optimización del registro de procesos vía un software de gestión resultaría ser un cambio complicado y costoso de realizar para la empresa. 

##### ¿Cuáles son las 2H?
###### How (Cómo)
###### ¿Cómo se utilizará el producto?
El producto será empleado para el registro de cultivos de champiñones. A partir de ello, se segmenta este proceso en determinadas fases y se consignan los insumos o elementos esenciales, agrícolas o ambientales, en la aplicación web para propiciar la adecuada producción de los champiñones.

###### ¿Cómo lograremos desarrollar la correcta gestión de cultivos de champiñones dentro de la plataforma?
Los técnicos y administradores acceden a la aplicación web a través de un navegador. La aplicación les permitirá registrar datos de producción en formularios digitales específicos para cada proceso, como la preparación del sustrato (compost), la siembra, el proceso del túnel, entre otros. Los datos se almacenan en una base de datos segura y se presentan en gráficos y tablas de entendimiento dinámico para el usuario.

###### How (Cómo)
###### ¿Cómo se utilizará el producto?
El producto será empleado para el registro de cultivos de champiñones. A partir de ello, se segmenta este proceso en determinadas fases y se consignan los insumos o elementos esenciales, agrícolas o ambientales, en la aplicación web para propiciar la adecuada producción de los champiñones.

###### How much (Cuánto)
###### ¿Cuál es la magnitud del problema?
Según AgroPerú (2023), en el año 2022, el Perú exportó 850 toneladas de champiñones secos por un valor de USD 7,1 millones. Ello representó un aumento del 11 % en volumen y 4 % en valor más que en el año 2021. Si bien el número de exportaciones aparenta ser próspero, se requiere un proceso de automatización adecuado para agilizar y monitorear el registro de las fases involucradas en la producción de cultivos de estas industrias. De acuerdo con The Yield Lab (2019), el reto para las startups de la industria agrícola es alcanzar soluciones para la producción de alimentos de una forma más sustentable y eficiente debido al incremento de la demanda en Latinoamérica. Es ahí que se ve implicada Greenhouse como alternativa de solución.

###### ¿Qué porcentaje del personal de la industria champiñonera se verá beneficiado por el servicio?
El sistema puede ser utilizado por múltiples técnicos, supervisores y administradores que incorporan al personal de las fábricas champiñoneras. No hay un límite específico en cuanto al número de usuarios. Sin embargo, se establece una estimación de un 35% de usuarios beneficiarios dentro de este sector.

####     2.2. Lean UX Process
#####         **2.2.1.Lean UX Problem Statements.**
###### **Problem Statement:** 
El propósito de GreenHouse es proporcionar a las fábricas champiñoneras del Perú un sistema de monitoreo de cultivos ágil mediante el cual técnicos supervisores y administradores del personal trabajador podrán registrar los procesos productivos implicados en la producción de champiñones.

El problema está presente al momento de realizar el registro de características en constante desarrollo durante el proceso de crecimiento de champiñones. Esta ineficiencia del registro y la dependencia del personal técnico y de supervisión hacia métodos manuales, como registros en papel y hojas de cálculo digitales conlleva a un aumento significativo en el margen de error. En primer lugar, se percibe un incremento en la cantidad de errores dentro del ingreso de datos de manera manual que incluyen omisiones, errores de transcripción y falta de consistencia en la información, relevante para la gestión de las fases posteriores de cultivo.

Hemos observado que los prejuicios hacia la calidad del monitoreo productivo de los cultivos de champiñones es un derivado principal del problema previo. La falta de precisión en la recopilación y supervisión de datos altera la capacidad de tomar decisiones informadas en tiempo real lo que repercute en la eficiencia de la producción. En adición a ello, esta ausencia de confiabilidad en los datos resulta en impactos negativos dentro de la certificación de calidad, la trazabilidad y, en última instancia, la competitividad de la industria champiñonera peruana en los mercados nacionales e internacionales.

¿Cómo podríamos monitorear de forma automatizada la información proveniente de los procesos productivos que implican los cultivos de champiñones sin generar pérdidas de datos relevantes?

#####         **2.2.2.Lean UX Assumptions.**
###### **Business Assumptions:**
1.  **Creemos que nuestros usuarios necesitan** una forma más eficiente de registrar y  monitorear los procesos productivos implicados en el cultivo industrial de champiñones.
2.  **Estas necesidades se pueden satisfacer** con el desarrollo de una plataforma que permitirá el acceso oportuno y confiable a los datos registrados por el personal técnico y administrativo de las fábricas champiñoneras del Perú.
3.  **Nuestros clientes iniciales serán** los supervisores y administradores de las fábricas champiñoneras que dispongan de aparatos tecnológicos (computadoras, tablets o teléfonos móviles).
4.  **El valor más importante que un cliente quiere de nuestros servicios es** registrar los insumos relevantes involucrados en cada fase productiva dentro del cultivo de champiñones y visualizar los datos registrados a lo largo del tiempo.
5.  **El cliente también va a obtener** diversos beneficios adicionales como visualizar gráficos estadísticos dentro de la aplicación con datos actuales e históricos.
6.  **Vamos a obtener la mayoría de los clientes mediante** publicidad en línea y campañas de retención en las fábricas del sector productivo de champiñones en el Perú.
7.  **Vamos a obtener ingresos mediante** el modelo de suscripción con diferentes niveles para el uso de la aplicación por parte de las empresas.
8.  **Nuestra competencia en el mercado serán** las plataformas propias de agroempresas direccionadas al monitoreo o control de cultivos agrícolas.
9.  **Vamos a tener ventaja frente a nuestra competencia debido a** que la plataforma incluye el registro de procesos productivos de cultivos a partir de la segmentación de fases involucradas en el desarrollo exclusivamente de la industria de champiñones.
10.  **El mayor riesgo del servicio es** que el segmento objetivo no se muestre dispuesto e interesado en automatizar los procesos productivos de cultivo. Las razones vendrían a ser de un contexto interno social: problemas de adaptación, pensamiento estático y manejo de herramientas tecnológicas.
11.  **Lo resolveremos realizando** un diseño dinámico y llamativo de la plataforma. De igual forma, se realizará una revisión constante de la plataforma y actualizaciones en caso de inserción de funcionalidades adicionales o mejoras.

###### **User Assumptions:**
###### **¿Quién es el usuario?**   
Los usuarios son, en primera parte, el personal técnico supervisor y administrativo que incorporan las fábricas champiñoneras del Perú. Sin embargo, si la plataforma tiene éxito en este primer sector, se plantea extender para la implementación de toda la industria agrícola. En cuestión, sería adaptar la segmentación de fases al proceso productivo de la agroempresa.

###### **¿Qué problemas tiene nuestro producto? ¿Resolver?**
Un problema, que enfrenta actualmente la aplicación, radica en la ausencia de la identificación automática de etapas de crecimiento involucradas dentro de los cultivos de champiñones. En ese sentido, los técnicos supervisores deben realizar dicha especificación de manera manual, es decir, cuando un cultivo debe ser trasladado de una fase de búnker a una fase de túnel y, posteriormente, a la fase de germinación.

###### **¿Qué características son importantes?**
Las características más importantes de la plataforma son: el registro y monitoreo de las fases productivas e insumos involucradas en los cultivos de champiñones, las cuales parten desde la siembra, la recolección, la producción, la administración, entre otros. Así mismo, se automatiza el análisis efectivo de datos históricos y actualizados a tiempo real, es así que se evitan pérdidas financieras y se trazan proyecciones como prósperas agroempresas dentro del mercado.

###### **¿Dónde encaja nuestro producto en su trabajo o vida?**
El producto encaja en la mejora de la gestión de procesos para el cultivo de champiñones lo que culmina en la eficiencia operativa, la rentabilidad y disminución de costos.

###### **¿Cuándo y cómo es nuestro producto? ¿Usado?**
El servicio será utilizado por el segmento objetivo cuando surja la necesidad de registrar la información relevante involucrada en los procesos de producción de champiñones o en el análisis de datos históricos para la trazabilidad de metas a largo plazo como agroempresa. Es así que se evalúan los costos operativos actuales, la demanda de exportaciones y se toman decisiones a futuro dentro del mercado.

###### **¿Cómo debe verse nuestro producto y cómo debe comportarse?**
El producto debe integrar una interfaz sencilla, inclusiva y dinámica. Debe entablar y maximizar la conexión entre todo el personal de la fábrica, sin generar retrasos ni deficiencia comunicativa. El diseño debe ser llamativo, capaz de captar la atención del segmento objetivo y otorgar una experiencia acogedora. Finalmente, el comportamiento se direcciona a los términos de privacidad y seguridad de datos personales de los usuarios así como de la agroempresa.
   
#####         **2.2.3.Lean UX Hypothesis Statements.**
* **Hypothesis Statement 01:**
    
    **Creemos que** los técnicos supervisores y administradores de las fábricas champiñoneras estarán dispuestos a adoptar la aplicación para llevar un registro digital de los procesos productivos involucrados en el cultivo de champiñones.
    
    **Sabremos** que hemos tenido éxito.
    
    **Cuando** la tasa de adopción de la aplicación en los usuarios objetivo se encuentre alrededor del 80% dentro del primer trimestre de lanzamiento.
  
* **Hypothesis Statement 02:**
    
    **Creemos que** la aplicación fomentará una mejor comunicación y colaboración entre los técnicos supervisores y administradores al proporcionar una plataforma que exponga información resumida de los últimos procesos dentro de la fábrica.
    
    **Sabremos** que hemos tenido éxito.
    
    **Cuando** se perciba un aumento del 30% en la frecuencia de interacciones entre los diferentes equipos/segmentos del personal a través de la plataforma.

* **Hypothesis Statement 03:**
    
    **Creemos que** la disponibilidad de datos en tiempo real y análisis históricos a través de la aplicación web permitirá a los administradores tomar decisiones más informadas y estratégicas sobre la asignación de recursos y mejoras en la producción.
    
    **Sabremos** que hemos tenido éxito.
    
    **Cuando** al menos un 70% de las decisiones claves, tomadas por los administradores, se basan en análisis proporcionados por la aplicación web.

* **Hypothesis Statement 04:**
    
    **Creemos que** la aplicación web mejorará la calidad de los datos de producción al reducir errores en los datos de entrada y registros inconsistentes en comparación con métodos manuales.
    
    **Sabremos** que hemos tenido éxito.
    
    **Cuando** se perciba una reducción del 50% en el margen de error de registro de datos de procesos productivos dentro de la plataforma.  

#####         **2.2.4.Lean UX Canvas.**
A continuación se presenta el Lean UX Canvas trabajado por el equipo a través de la herramienta digital **Mural**:

![Integradis_Lean Canvas](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/105735491/901dcbe9-c395-4f62-9fb0-bf32980a4ba8)
**Fuente:** https://app.mural.co/t/integradis6182/m/integradis6182/1693601172741/46f0026bfe73d12af59e3bc71c203bee710eb32a?sender=ufdf66b413172c812625a4806 

### 3. **Segmento objetivo.**
Según AgroPerú (2023), en el año 2022, el Perú exportó 850 toneladas de champiñones secos por un valor de USD 7,1 millones. Ello representó un aumento del 11 % en volumen y 4 % en valor que en el año 2021. Si bien el número de exportaciones fluctúa ser próspero, se requiere un proceso de automatización para agilizar y monitorear el registro de las fases involucradas en la producción de cultivos de estas industrias. Así mismo, en los próximos treinta años, la demanda de alimentos se incrementará en un 70 %. Ello implica mejoras en la  gestión y producción de alimentos. El uso de herramientas tecnológicas e incluso disciplinas como la inteligencia artificial pueden ayudar a cumplir este objetivo mediante la creación de granjas virtuales que permiten planificar las actividades agrícolas y monitorear la evolución de los cultivos a través del registro de procesos y factores meteorológicos, ambientales y de cultivos involucrados. La automatización reduciría las dificultades exclamadas por el personal de las agroempresas en cuanto al registro de datos en herramientas manuales.
Finalmente, en relación a las principales empresas exportadoras de champiñones se comprenden a Novos Distribución y Exportación del Perú con un 52,5% de los envíos totales y un monto de US$ 387,5 mil; C & M Aromatic Group S.A.C., con unos envíos por valor de US$ 200,5 mil; Export Aromático S.A.C., con US$ 149,8 mil; y Andean Trading Corporation S.A.C, con US$ 172. Lo último entablaría una alta tasa de inversionistas y usuarios para la plataforma.

#### 3.1 **Stakeholders:**
* **Stakelholder Internos:** Equipo Integradis y resto de integrantes del equipo de desarrollo
* **Stakelholder Externos:** Personal técnico supervisor y administrador de las industrias enfocadas en el cultivo de champiñones, estudiantes y/o profesionales en carreras involucradas en agronomía, gerencia de agroempresas comerciales.

![Stakeholders Externos](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/105735491/b28e7264-8fe6-4da1-9275-59a114145d72)

## Capítulo II: Requirements Elicitation & Analysis
### 1. **Competidores.**
####     1.1. Análisis competitivo.
Lorem ipsum dolor sit amet
####     1.2. Estrategias y tácticas frente a competidores.
En base al análisis competitivo efectuado anticipadamente, se logró identificar con exactitud las fortalezas, oportunidades, debilidades y amenazas destacadas de los competidores. Dicha información resulta ser clave para trazar estrategias y tácticas  de superación hacia la competencia, cuando el servicio entre al mercado (lanzamiento rentable). A continuación, se brindará una serie de estrategias y tácticas trazadas para alcanzar esta meta:

**Afrontando las fortalezas de nuestros competidores:**
* Gestión de costos por cada actividad agrícola involucrada en diferentes tipo de cultivo
* Adecuada supervisión para el personal técnico a través de una vista satelital que muestra a tiempo real una mejor percepción de los campos agrícolas
* Cálculos estables basados en herramientas de Microsoft
* Permite trabajar con contratos, aplicaciones, liquidaciones, operaciones empresariales, de logística y de inventarios.

**Comprendemos que nuestras fortalezas son:**
* Comunicación flexible entre el personal supervisor y administrativo de las plantas agrícolas
* Registro y monitoreo eficiente de los procesos productivos de los cultivos de champiñones

Entonces, podemos aplicar las siguientes estrategias y tácticas:

**Estrategias**
* Brindar al cliente un enfoque logístico de los registros realizados dentro de la plataforma.

**Tácticas**
* Incluir herramientas avanzadas de análisis de costos, perceptibles a la vista y comprensibles como gráficos, informes y comparaciones históricas


**Afrontando las debilidades de nuestros competidores:**
* Errores en la recepción de información para la creación de cuenta del usuario (interfaz).
* Errores en el formulario de registro de información para entrar en contacto con la empresa
* Algunas plataformas web aún no se internacionalizaron ni insertaron al  mercado norteamericano.

**Comprendemos que nuestras debilidades son:**
* Desconocimiento del sector agrícola y productivo del cultivo de champiñones

Entonces, podemos aplicar las siguientes estrategias y tácticas:

**Estrategias**
* Mantener constantes actualizaciones y verificación de errores dentro de la plataforma.

**Tácticas**
* Implementar un agente de soporte en donde el usuario registre alguna falla de la plataforma
* Realizar constantes actualizaciones de las funcionalidades dentro de la plataforma en paralelo con los procesos productivos dentro de las fases de cultivo de los champiñones
* Proporcionar tutoriales para el uso de la aplicación web como herramienta de interacción para nuestros usuarios.

**Afrontando las oportunidades de nuestros competidores:**
* Implementación de una interfaz agradable y visual para el usuario
* Administración y planificación visual del departamento de producción de cultivos
* Combina inteligencia artificial e IoT para mitigar el cambio climático y gestionar cultivos agrícolas
  
**Comprendemos que nuestras oportunidades son:**
* Mejorar las funcionalidades deficientes de nuestros competidores en el mercado
* Baja presencia de competidores en el mercado
* Alta demanda en exportaciones peruanas de cultivos de champiñones hacia el exterior.

Entonces, podemos aplicar las siguientes estrategias y tácticas:

**Estrategias**
* Desarrollar la interfaz de la plataforma en base a una experiencia de usuario acogedora y sostenible

**Tácticas**
* Aplicar los conceptos de psicología del color para la selección y diseño de la interfaz de usuario de la plataforma.
* Aplicar pruebas de usabilidad y recolección de comentarios para garantizar la atracción hacia la plataforma.
* Implementar una sección de información al usuario sobre  el impacto ambiental y mitigación al cambio climático

**Afrontando las amenazas de nuestros competidores:**
* La interfaz no puede centralizarse en el desarrollo de procesos productivos para solo un tipo de cultivos. Es decir, la interfaz ha sido creada de forma generalizada.
* Bajas demandas al no contar con una aplicación móvil
* Dilema del cambio climático en continuo agudizamiento

**Comprendemos que nuestras amenazas son:**
* Inflación e inestabilidad económica del Perú

Entonces, podemos aplicar las siguientes estrategias y tácticas:

**Estrategias**
* Potenciar las funcionalidades de la plataforma web

**Tácticas**
* Mantener actualizaciones continuas de la plataforma y agilizar la atención al registro de errores por los usuarios
* Desarrollar webinars para destacar la facilidad de planificación y administración visual para optimizar operaciones que ofrece nuestra plataforma (demostraciones prácticas)

### 2. **Entrevistas.**
La sección abarca el proceso de investigación de nuestros segmentos objetivos mediante la recolección de información en base a entrevistas.
####     2.1. Diseño de entrevistas.
_Preguntas dirigidas al personal técnico supervisor de las fábricas de champiñones._
___
- Preguntas principales:
  1. ¿Podrías proporcionarnos tu nombre completo y tu edad?
  2. ¿Cuanto tiempo de experiencia posees en la industria de producción de champiñones y que rol desempeñas en la fábrica?
  3. ¿Qué actividades desempeñas dentro de la fábrica?
  4. ¿Cómo interactúas con el equipo a tu cargo para asegurarte de que las operaciones en la fábrica sean eficientes y exitosas? ¿Qué estrategias utilizas para mantener un ambiente de trabajo colaborativo y motivador?
  5. ¿Podrías proporcionar una descripción general del proceso de cultivo de champiñones?
  6. ¿Con que frecuencia registras los procesos de la fábrica?
  7. ¿Consideras tedioso el registro de procesos? ¿Cómo consideras que podría agilizarse u optimizarse este proceso?
  8. ¿Han habido casos de confusiones, imprecisiones o fallos en la comunicación al momento de reportar de los procesos de la fábrica? ¿Cómo intentaron solucionar estos inconvenientes?
  9. ¿Cuál es el propósito principal de la pasteurización en el contexto del cultivo de champiñones?
  10. ¿Cuáles son los procesos clave que supervisas durante el crecimiento de los champiñones?
  11. ¿Qué factores son los más importantes a tomar en cuenta para un cultivo exitoso de los champiñones? (temperatura, humedad, iluminación, etc.)
  12. ¿Podrías explicar a detalle como se realiza el registro de procesos de las naves para una producción óptima de champiñones? ¿Cómo se realiza en el proceso de pasteurización?
  13. ¿Cómo evalúan la efectividad de la pasteurización? ¿Qué indicadores utilizan para medir el éxito del proceso?
  14. ¿Cómo se comunica la información sobre el estado y el progreso del proceso de pasteurización con otros departamentos o equipos?
  15. ¿Cuáles son los desafíos más comunes que enfrentan en la supervisión de las naves de champiñones? ¿Qué incovenientes son frecuentes al momento de recibir reportes?
  16. ¿Cuáles son los desafíos más comunes que enfrentan durante el proceso de pasteurización de champiñones?
  17. ¿En qué medida se utiliza la tecnología y automatización en el proceso de cultivo? ¿Cuáles son los beneficios más importantes del uso de estas herramientas?
  18. ¿Qué funcionalidades consideras que debe tener una aplicación web para ayudar con el registro de información del proceso de pasteurización y de los procesos que supervisas?
  19. ¿Cuál de estas características crees que es más importante en la aplicación web, velocidad, facilidad de uso o una interfaz amplia? 
  20. ¿Cuáles problemas crees que podrían surgir del uso de dicha aplicación?
   
- Preguntas complementarias:
  1. ¿Cómo garantizan la calidad y la seguridad alimentaria de los champiñones cultivados en la fábrica?
  2. ¿Qué tipo de capacitación y formación reciben los técnicos encargados de la supervisión? ¿Cuáles son las habilidades clave necesarias para este trabajo?

_Preguntas dirigidas a los administradores de las fábricas de champiñones._
___
- Preguntas principales:
  1. ¿Podrías proporcionarnos tu nombre completo y tu edad?
  2. ¿Cuanto tiempo de experiencia posees en la industria de producción de champiñones y que rol desempeñas en la fábrica?
  3. ¿Qué actividades desempeñas dentro de la fábrica?
  4. ¿Cómo es el proceso de cultivo de champiñones en las naves?
  5. ¿Cuáles son los procesos que supervisas personalmente en la fábrica?
  6. ¿Con que frecuencia recibes un reporte relacionado con los procesos y el estado actual de la fábrica? ¿Para qué utilizas esta información?
  7. ¿Han habido casos de confusiones, imprecisiones o fallos en la comunicación al momento de reportar de los procesos de la fábrica? ¿Cómo intentaron solucionar estos inconvenientes?
  8. ¿Cuáles son los principales problemas reportados por los trabajadores que están bajo tu administración?
  9. ¿Cómo se registra la información proveniente de los procesos realizados durante el cultivo y la pasteurización?
  10. Dentro de la fábrica, ¿Cuentan con algún tipo de análisis estadístico u otra manera de visualizar la producción dentro de la fábrica y su trayectoria a través del tiempo?
  11. ¿En qué medida se utiliza la tecnología y automatización en el proceso de cultivo? 
  12. ¿Qué tecnologías se han considerado implementar para automatizar el registro de procesos dentro de la fábrica?
  13. ¿Qué funcionalidades consideras que debe tener una aplicación web para ayudar con el registro de información proveniente de la fábrica?
  14. ¿Cuál de estas características crees que es más importante en la aplicación web, velocidad, facilidad de uso o una interfaz amplia? 
  15. ¿Cuáles problemas crees que podrían surgir del uso de dicha aplicación?
    
- Preguntas complementarias:
  1. ¿Qué te inspira a trabajar en la administración de las naves de los champiñones?
  2. ¿Cómo se lleva un registro del inventario de champiñones producido?
  
####     2.2. Registro de entrevistas.
Lorem ipsum dolor sit amet
####     2.3. Análisis de entrevistas.
Lorem ipsum dolor sit amet
### 3. **Needfinding.**
####     3.1. User Personas.
Lorem ipsum dolor sit amet
####     3.2. User Task Matrix.
Lorem ipsum dolor sit amet
####     3.3. User Journey Mapping.
Lorem ipsum dolor sit amet
####     3.4. Empathy Mapping.
Lorem ipsum dolor sit amet
####     3.5. As-is Scenario Mapping.
Lorem ipsum dolor sit amet


## Capítulo III: Requirements Specification
### 1. **To-Be Scenario Mapping.**
Lorem ipsum dolor sit amet
### 2. **User Stories.**
Lorem ipsum dolor sit amet
### 3. **Impact Mapping.**
Lorem ipsum dolor sit amet
### 4. **Product Backlog.**
Lorem ipsum dolor sit amet


## Capítulo IV: Product Design
### 1. **Style Guidelines.**
####     1.1. General Style Guidelines.
El diseño web es considerado como una sección importante para el proyecto, pues se deben considerar varios requisitos para tener un diseño agradable a nuestros clientes finales. De la misma forma, debe estar basado en la marca y lo que se busca transmitir como startup.
Es por ello que para la elaboración de la guía de estilo decidimos basarnos en los siguientes elementos:
**Misión:** Revolucionar la documentación de los procesos fundamentales de las fábricas enfocadas en la producción de champiñones del Perú.
**Visión:** GreenHouse se direcciona a ser la plataforma más destacada dentro del mercado respecto al registro de procesos para los próximos tres años. Integradis busca ser reconocido como un modelo de negocio sostenible y comprometido en brindar un servicio de calidad capaz de satisfacer las necesidades de los usuarios
**Público Objetivo:** Técnicos encargados de la supervisión de los cultivos y los administradores de las fábricas champiñoneras del Perú. 
**Personalidad de la marca:** Greenhouse ofrece la capacidad de gestionar y visualizar información de manera remota a las empresas champiñoneras del Perú. Es por esto que se busca una personalidad sincera y transparente para los clientes que confían el registro de sus procesos en la aplicación.
 
**Valores fundamentales:** 
Confianza, lealtad, seguridad y Calidad, Productividad, e Independencia. 
Debido a que nuestro público objetivo son principalmente empresas industriales, debemos mantener un tono formal y de respeto en el tono de comunicación y en el lenguaje aplicado. De esta forma nuestros clientes se sientan a gusto con nuestro servicio.
Las palabras bandera que representan nuestra marca son: Organizado, Productivo, Seguro y Confiable.

**Paleta de colores:**
![PaletaDeColores](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103398708/8a0f79e3-fcc5-4a89-a374-899402acbf16)
**Tamaño y tipo de letra:**
![FontSize](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103398708/889a807f-4898-40ff-8cad-bc598c13b600)

####     1.2. Web Style Guidelines.
Lorem ipsum dolor sit amet
### 2. **Information Architecture.**
####     2.1. Organization Systems.
Lorem ipsum dolor sit amet
####     2.2. Labeling Systems.
Lorem ipsum dolor sit amet
####     2.3. SEO Tags and Meta Tags.
Lorem ipsum dolor sit amet
####     2.4. Searching Systems.
Lorem ipsum dolor sit amet
####     2.5. Navigation Systems.
Lorem ipsum dolor sit amet
### 3. **Landing Page UI Design.**
####     3.1. Landing Page Wireframe.
Lorem ipsum dolor sit amet
####     3.2. Landing Page Mock-up.
Lorem ipsum dolor sit amet
### 4. **Web Applications UX/UI Design.**
####     4.1. Web Applications Wireframes.
Lorem ipsum dolor sit amet
####     4.2. Web Applications Wireflow Diagrams.
Lorem ipsum dolor sit amet
####     4.3. Web Applications Mock-ups.
Lorem ipsum dolor sit amet
####     4.4. Web Applications User Flow Diagrams.
Lorem ipsum dolor sit amet
### 5. **Web Applications Prototyping.**
Lorem ipsum dolor sit amet
### 6. **Domain-Driven Software Architecture.**
El Domain Driven Design (DDD) tiene como objetivo llegar a un entendimiento compartido del dominio que abarca el espacio del problema. Gracias a la perspectiva brindada por este enfoque, es posible mejorar colaboración entre los desarrolladores y los expertos del dominio.
Domain Driven Design no se trata solamente de usar un lenguaje ubicuo, sino que abarca un conjunto de patrones, procedimientos y diagramas de la arquitectura del sistema; artefactos que tienen como propósito acercar el software al dominio y reforzar el enfoque compartido de DDD.
####     6.1. Software Architecture Context Diagram.
El diagrama de contexto muestra una vista de alto nivel de las relaciones entre el sistema de software Greenhouse, los usuarios y, si es el caso, de otros sistemas externos.
![Greenhouse_context_diagram](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/114628079/c8473a3e-070d-4c49-b453-ba7f924ef5ef)
####     6.2. Software Architecture Container Diagrams.
El diagrama de contenedores muestra una vista de alto nivel de las relaciones entre las aplicaciones y fuentes de datos que son parte de la ejecución del sistema de software Greenhouse.
![Greenhouse_container_diagram](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/114628079/2e4d2f78-7a25-4401-8eb7-abadd3119ac6)
####     6.3. Software Architecture Components Diagrams.
El diagrama de componentes muestra una vista de las relaciones de los componentes principales del sistema de software. Estos componentes detallan la implementación de los respectivos módulos en el programa.
![Greenhouse_component_diagram](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/114628079/ddb673c6-81f3-42d7-a6f9-0e2a22084822)

### 7. **Software Object-Oriented Design.**
####     7.1. Class Diagrams.
Lorem ipsum dolor sit amet
####     7.2. Class Dictionary.
Lorem ipsum dolor sit amet
### 8. **Database Design.**
Para el presente proyecto se ha seleccionado el motor de base de datos MySQL porque es una plataforma escalable con una interfaz sencilla y fácil de usar debido a la familiaridad del grupo con el motor de Microsoft SQL Server. Este motor permite expandir los recursos utilizados en la base de datos del proyecto según las necesidades y requerimientos del negocio. 
####     8.1. Database Diagram.
![GreenhousePhysicalDataModel](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/114628079/a2c4c664-9dcc-43b1-ae47-a1c5045267af)



## Capítulo V: Product Implementation, Validation & Deployment
### 1. Software Configuration Management.
####     1.1. Software Development Environment Configuration.
Lorem ipsum dolor sit amet
####     1.2. Source Code Management.
Lorem ipsum dolor sit amet
####     1.3. Source Code Style Guide & Conventions.
Lorem ipsum dolor sit amet
####     1.4. Software Deployment Configuration.
Lorem ipsum dolor sit amet
### 2. Landing Page, Services & Applications Implementation.
####     2.1. Sprint 1
#####         **2.1.1. Sprint Planning 1.**
Lorem ipsum dolor sit amet
#####         **2.1.2. Sprint Backlog 1.**
Lorem ipsum dolor sit amet
#####         **2.1.3. Development Evidence for Sprint Review.**
Lorem ipsum dolor sit amet
#####         **2.1.4. Testing Suite Evidence for Sprint Review.**
Lorem ipsum dolor sit amet
#####         **2.1.5. Execution Evidence for Sprint Review.**
Lorem ipsum dolor sit amet
#####         **2.1.6. Services Documentation Evidence for Sprint Review.**
Lorem ipsum dolor sit amet
#####         **2.1.7. Software Deployment Evidence for Sprint Review.**
Lorem ipsum dolor sit amet
#####         **2.1.8. Team Collaboration Insights during Sprint.**
Lorem ipsum dolor sit amet



## Conclusiones
Lorem ipsum dolor sit amet


## Bibliografía
Lorem ipsum dolor sit amet


## Anexos
Lorem ipsum dolor sit amet
