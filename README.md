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
El Lean UX Canvas es una herramienta utilizada en el campo del diseño centrado en el usuario (UX) y la metodología Lean para crear y desarrollar productos de manera más eficiente y efectiva. Su objetivo es proporcionar un marco estructurado para la colaboración entre equipos multidisciplinarios. A continuación se presenta el Lean UX Canvas trabajado por el equipo a través de la herramienta digital **Mural**:

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
####     1.1. Análisis competitivo:
El análisis competitivo es una herramienta esencial debido a su relevancia en la toma de decisiones estratégicas, la identificación de oportunidades y amenazas, y la creación de ventajas competitivas sostenibles en el mercado. Por tales motivos, ayuda a las empresas a mantenerse ágiles y a tomar decisiones informadas en un entorno empresarial de constante cambio. A continuación, se exhibe la incorporación de esta herramienta dentro del desarrollo del proyecto y la examinación de los competidores:

![vista_analisis](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/105735491/6848f634-37c6-4496-81db-36d7d7cffd90) 
**Visualización:** https://docs.google.com/spreadsheets/d/1Hn_evhnXSpAuNpxrVHCGnnAEhjVeSZmi/edit?usp=sharing&ouid=112038083029343506182&rtpof=true&sd=true 

**Descarga:** [Integradis_Analisis_Competitivo.xlsx](https://github.com/Integradis-OpenSource/TFDocOpenSource/files/12501907/Integradis_Analisis_Competitivo.xlsx) 

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

**Entrevista a técnicos supervisores**

|Entevistado 1|Elías Almenara|
|-|-|
|Edad|52|
|Distrito|Chilca|
|<img width="1292" alt="Screenshot 2023-08-26 at 8 15 16 PM" src="https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/5dc0fcff-afad-4a5d-b767-a5c03963c1e0">|Cuenta con 17 años trabajando en plantas de cultivo de champiñones, actualmente es el técnico de producción en Perú Agro. Las funciones que desempeña son las relacionadas al proceso de las naves. Tiene un conocimiento muy claro del proceso y todo lo que este involucra como lo son los tiempos, condiciones de temperatura, CO2, Humedad. Trabaja en el turno de día y realiza un registro cada 4 horas. Se evidencia que no es una persona muy familiarizada con el entorno digital puesto que ciertas preguntas relacionadas al tema le costaban comprenderlas. No considera tedioso el tener que hacer los registros manualmente pero si considera que el proceso se podría agilizar mediante la implementación de una aplicación web. |
|Timing: 0:07-15:15 |URL: [upc-pre-202302-si729-SW51-Integradis- needfinding-sprint-1](https://upcedupe-my.sharepoint.com/:v:/g/personal/u20211a475_upc_edu_pe/EW0WUUHzXK5Nmzo3JosW8YoB8PYQfaqreFVmqAPr8VespQ?e=O84h23&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZyIsInJlZmVycmFsQXBwUGxhdGZvcm0iOiJXZWIiLCJyZWZlcnJhbE1vZGUiOiJ2aWV3In0sInBsYXliYWNrT3B0aW9ucyI6eyJzdGFydFRpbWVJblNlY29uZHMiOjcuMDR9fQ%3D%3D)|

|Entevistado 2|Kevin Urbano|
|-|-|
|Edad|32|
|Distrito|Chilca|
|<img width="1293" alt="Screenshot 2023-08-27 at 12 11 33 AM" src="https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/23a5a75c-c964-4f2b-8ec4-239a862c664b">|Cuenta con 2 años y 3 meses trabajando en plantas de cultivo de champiñones, actualmente es el técnico de pasteurización y búnker en Perú Agro. Las funciones que desempeña son las relacionadas a los proceso previos a las naves, como lo son los bunkers y la pasteurización. Comenta que las cantidades para las mezclas se manejan con un excel del encargado. Trabaja en el turno de día y realiza un registro cada hora u hora y media. Comenta que se tienen registros tanto por WhatsApp como por informes manuales que se envían a oficina. Considera que una aplicación para el registro brindaría mayor organización puesto que todo estaría en la computadora. Comenta la posibilidad de añadir el seguimiento de las mejores naves|
|Timing: 15:16-27:45|URL: [upc-pre-202302-si729-SW51-Integradis- needfinding-sprint-1](https://upcedupe-my.sharepoint.com/:v:/g/personal/u20211a475_upc_edu_pe/EW0WUUHzXK5Nmzo3JosW8YoB8PYQfaqreFVmqAPr8VespQ?e=gW7L3K&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZyIsInJlZmVycmFsQXBwUGxhdGZvcm0iOiJXZWIiLCJyZWZlcnJhbE1vZGUiOiJ2aWV3In0sInBsYXliYWNrT3B0aW9ucyI6eyJzdGFydFRpbWVJblNlY29uZHMiOjkxNi4zN319)|

|Entevistado 3|Danny Martinez|
|-|-|
|Edad|33|
|Distrito|Chilca|
|<img width="1287" alt="Screenshot 2023-08-27 at 12 29 47 AM" src="https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/607c0533-4415-4dd0-997c-38efb3fefb77">|El entrevistado posee un año y seis meses trabajando en la planta de cultivo de champiñones, y, actualmente está encargado de la coordinación general de los procesos productivos, ventas, cosecha. Se encarga de que todos los procesos se cumplan a cabalidad. Menciona que el registro de temperatura es diario y en algunas áreas se manejan por horas. Comenta que se tienen registros tanto por WhatsApp como por informes manuales que se envían a oficina. Considera que una aplicación para el registro brindaría mayor organización puesto que es a tiempo real de manera digital a diferencia de por escrito. Menciona la posibilidad de implementar una base de datos. Considera que el uso de la aplicación tendría como mayor problema capacitar al personal.
|Timing: 27:45-35:46|URL: [upc-pre-202302-si729-SW51-Integradis- needfinding-sprint-1](https://upcedupe-my.sharepoint.com/:v:/g/personal/u20211a475_upc_edu_pe/EW0WUUHzXK5Nmzo3JosW8YoB8PYQfaqreFVmqAPr8VespQ?e=6oRCHi&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZyIsInJlZmVycmFsQXBwUGxhdGZvcm0iOiJXZWIiLCJyZWZlcnJhbE1vZGUiOiJ2aWV3In0sInBsYXliYWNrT3B0aW9ucyI6eyJzdGFydFRpbWVJblNlY29uZHMiOjE2NjYuNH19)|

**Entrevista a administradores**

|Entevistado 1|Frank Alexander Du Bois Luna|
|-|-|
|Edad|42|
|Distrito|Miraflores|
|<img width="1293" alt="Screenshot 2023-08-27 at 1 43 50 AM" src="https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/0f3fab5e-3c0c-4eb6-81d1-cb16452b6916">|Cuenta con 5 años en el rubro, con una trayectoria previa en la industria de la construcción. Actualmente se encarga principalmente de labores administrativas dentro de la fábrica. Posee profundos conocimientos de todas las etapas de producción, y comenta que para realizar champiñones se requiere de un estricto control. Con respecto al sistema de registro, el entrevistado señala que documentar manualmente los procesos puede resultar complicado debido a la potencial acumulación de errores con el tiempo. Uno de los problemas que encuentra es que en caso de equivocación, ninguno de los técnicos asume la responsabilidad de sus actos. Adicionalmente, asegura apoyarse de una hoja de cálculo en Excel para tener una trazabilidad de las producción diaria de cada nave. Desde su perspectiva, la facilidad de uso es un aspecto muy importante que la aplicación debe cumplir. 
|Timing: 35:54-59:29|URL: [upc-pre-202302-si729-SW51-Integradis- needfinding-sprint-1](https://upcedupe-my.sharepoint.com/:v:/g/personal/u20211a475_upc_edu_pe/EW0WUUHzXK5Nmzo3JosW8YoB8PYQfaqreFVmqAPr8VespQ?e=F4cCyp&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZyIsInJlZmVycmFsQXBwUGxhdGZvcm0iOiJXZWIiLCJyZWZlcnJhbE1vZGUiOiJ2aWV3In0sInBsYXliYWNrT3B0aW9ucyI6eyJzdGFydFRpbWVJblNlY29uZHMiOjIxNTQuMDN9fQ%3D%3D)|

|Entevistado 2|Rosalyn Perez Clemente|
|-|-|
|Edad|41|
|Distrito|Chilca|
|<img width="1299" alt="Screenshot 2023-08-27 at 1 32 49 AM" src="https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/9a54b9c5-35a4-44ca-ab5a-d77a6415a6e3">|Trabaja en la planta de cultivo de champiñones desde agosto de 2018 y actualmente ocupa una posición en el área administrativa. Se encarga de la gestión de pagos, trámites y la administración de documentación relacionada con las operaciones internas. Lleva la documentanción de los registros de los procesos y las producciones por naves. Rosalyn recibe informes de registros en un promedio de cinco ocasiones mensuales, lo cual concuerda con la frecuencia de las siembras realizadas en ese periodo específico. Sin embargo, sugiere que existe la posibilidad de enfrentar retrasos en la entrega de la documentación,  un aspecto que podría afectar la capacidad de toma de decisiones oportunas por parte de la empresa. Opina que una aplicación sería de utilidad para agilizar la comunicación, y que el mayor incoveniente de esta misma sería la necesidad de proporcionar capacitación adecuada al personal, con el objetivo de garantizar un uso efectivo de la aplicación.
|Timing: 59:30-1:03:30|URL: [upc-pre-202302-si729-SW51-Integradis- needfinding-sprint-1](https://upcedupe-my.sharepoint.com/:v:/g/personal/u20211a475_upc_edu_pe/EW0WUUHzXK5Nmzo3JosW8YoB8PYQfaqreFVmqAPr8VespQ?e=LqataW&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZyIsInJlZmVycmFsQXBwUGxhdGZvcm0iOiJXZWIiLCJyZWZlcnJhbE1vZGUiOiJ2aWV3In0sInBsYXliYWNrT3B0aW9ucyI6eyJzdGFydFRpbWVJblNlY29uZHMiOjM1NzAuOTF9fQ%3D%3D)|

|Entevistado 3|Julio Victor Du Bois Yabar|
|-|-|
|Edad|77|
|Distrito|San Borja|
|<img width="1295" alt="Screenshot 2023-08-28 at 1 57 27 AM" src="https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/9d6ce2a3-1ff3-4f84-b424-5eebfaeb59b8">|Gerente de la fábrica de champiñones de la marca Campo Alegre. Lleva 5 años en el cargo y se encarga principalmente de la parte financiera, estructural. Recibe a menudo reportes y hace las anotaciones y correciones correspondientes según el caso. Comenta que recibe los reportes por teléfono y tiene una constancia del registro a mano. Cuenta con los conocimientos técnicos referentes al cultivo de champiñones adquiridos a través de los años de experiencia. Menciona que aún no cuentan con la tecnología necesaria en la mayoría de procesos, y que buscan la integración de esta misma. |
|Timing: 1:03:31-1:22:35|URL: [upc-pre-202302-si729-SW51-Integradis- needfinding-sprint-1](https://upcedupe-my.sharepoint.com/:v:/g/personal/u20211a475_upc_edu_pe/EW0WUUHzXK5Nmzo3JosW8YoB8PYQfaqreFVmqAPr8VespQ?e=qop9GL&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZyIsInJlZmVycmFsQXBwUGxhdGZvcm0iOiJXZWIiLCJyZWZlcnJhbE1vZGUiOiJ2aWV3In0sInBsYXliYWNrT3B0aW9ucyI6eyJzdGFydFRpbWVJblNlY29uZHMiOjM4MTEuMzN9fQ%3D%3D)|


####     2.3. Análisis de entrevistas.

##### Análisis del segmento de técnicos supervisores

En primer lugar, el 100% de los entrevistados tiene una edad superior a 30 años, de los cuáles el 66% se encuentra entre los 30 y 40 años de edad. Asímismo, Un 66% de los entrevistados considera un proceso tedioso el tener que realizar los registros, puesto que pueden estar ocupados con otra tarea y tienen que ir a cumplir con esta labor. Además, el 66% de los entrevistados nos habló del grupo de WhatsApp además de los registros que llevan manualmente, en el cuál comunican los registros de forma que los administradores y demás técnicos pueden tener conocimiento de los procesos. A su vez, el 100% cuenta con más de año y medio de experiencia en la planta de champiñones, de los cuáles el 66% cuenta con más de 5 años de experiencia. De igual manera, el 100% de los entrevistados mencionan que los registros se hacen diarios y cada uno ellos maneja diferentes horas según su área. Por otra parte, la totalidad de los entrevistas afirman que han habido errores en el registro de los datos, ya sea que alguien se olvidó de hacerlo (principalmente en el turno noche mencionan) o que al hacer el registro puede haber un fallo al trasladar los datos al papel. Igualmente, el 66% considera que un problema sería la capacitación del personal, a lo cuál podemos añadir que un 33% parecía costarle entender las preguntas y la solución propuesta. Finalmente el 100% de los entrevistados considera que hacer el seguimineto al proceso del champiñón y registrarlo es clave para lograr un producto de calidad y poder aplicar una mejora continúa.

##### Análisis del segmento de administradores

En primer lugar, el 33% de los entrevistados pertenece al sector de adultos mayores mientras que el resto es mayor de ronda los 40 años. A su vez, todos los entrevistados trabajan en la champiñonera desde su apertura hace 5 años. De igual forma, el 100% menciona que el registro se realiza en papel y que esté luego es archivado por si se necesitan en un futuro, además mencionan que tienen un grupo de WhatsApp como un canal no ofocial dónde también se comparten los registros. Asímismo, el 66% de los entrevistados cuenta con los conocimientos técnicos del proceso productivo del champiñón, mientras que el 33% se dedica únicamente a actividades administrativas. Por parte, el 66% comenta que para recibir ciertos registros pueden haber demoras debido a que aún no los tienen en la oficina o que se tiene que buscar entre todos los registros archivados. Además, el 100% menciona que la tecnología se utiliza principalmente en las máquinas de mediciones y que para la comunicación y registro de los datos únicamente se cuenta con los registros manuales en papel y un grupo de WhatsApp. Por otro lado, el 33% de los entrevistas maneja un excel como herramienta tecnológica que utiliza para el control de inventarios y tener una trazabilidad de la producción. También, en su totalidad consideran que implementar una aplicación para registrar las mediociones y optimizar otros proceso agilizaría el trabajo y sería útil para tener una visión más general del proceso productivo y en que aspectos mejorar. Finalmente, todos los entrevistados consideran que el mayor problema sería la capacitación de los trabajadores para utilizar nuevas herramientas tecnológicas.

### 3. **Needfinding.**
####     3.1. User Personas.
![Luis Flores](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/114628079/9ef30eba-ef4f-4d54-a254-9bcc0c1e823b)
![Alvaro Morales](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/114628079/d1eb858b-32a4-4d2b-bc99-4deab0af3534)
####     3.2. User Task Matrix.

Se presentan los el User Task Matrix que contiene las tareas realizadas por los segmentos objetivos de los técnicos supervisores y los administradores. 

* Luis Flores (Técnico Supervisor):

| Tarea | Frequencia | Importancia |
| -------- | -------- | -------- |
| Monitorear los procesos     | Always  | High     |
|Registrar temperatura del compost|Always|High |
|Registrar temperatura del aire|Always|High|
|Registrar CO2|Always|High|
|Registrar Humedad|Always|High|
|Registrar Setting|Always|High|
|Comunicar los registros|Always|High|
|Control de calidad|Always|High|
|Pesado de insumos|Always|High|
|Mezclado de insumos |Always|Medium|
|Remojar la paja|Always|Medium|
|Regado del compost|Always|Medium|
|Regado de las naves|Always|Medium|
|Traslados entre fases|Always|Medium|
|Utilizar los grupos de WhatsApp|Always|Low|

* Alvaro Morales (Administrador):

| Tarea | Frequencia | Importancia |
| -------- | -------- | -------- |
| Verificar la producción     | Always     | High     |
|Supervisar los registros|Always|High|
|Pagos al personal|Always|High|
|Comunicación con el personal|Always|High|
|Utilizar los grupos de WhatsApp|Always|High|
|Comprar insumos a proveedores|Often|High|
|Seguimiento de fallos|Often|High|
|Modificación de fórmulas |Sometimes|High|
|Buscar registros antiguos|Sometimes|Medium|
|Uso de gráficos estadísticos|Rarely|Medium|
|Manejo de Excel de la producción|Rarely|Medium|

**Explicación de los User Task Matrix:**

Las tareas que tienen mayor frecuencia son aquellas que realizan los técnicos supervisores. Debido a que tienen que estar supervisando constantemente el proceso del champiñón. Tienen que monitorear, realizar los registros, hacer sus tareas todo de forma constante de modo que el champiñón producido cuente con los estándares de calidad. Por otro lado, los administradores tienen tareas que realizan de foma continúa como verificar o supervisar los registros y producción, o estar en constante comunicación con el personal. Mientras que tienen otras tareas que son de menor importancia y que realizan esporádicamente, las cuáles están relacionadas principalmente al proceso de mejora contínua en la producción.

####     3.3. User Journey Mapping.

En la presente sección se ilustra el end-to-end journey de Greenhouse para ambos segmentos tanto el de Técnicos Supervisores como el de Administradores, desde el momento en el que el cliente adquiere conocimiento de la aplicación, pasando por el prorceso de tomar la decisión de usarlo, registrarse, hacer uso de este mismo y finalmente la posibilidad de que deje de hacer uso de este mismo.

Técnico Supervisor:

![Customer Journey Map Técnico Supervisor](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/39bba487-4e82-4c1d-b1cc-77e0d3a6a122)

Enlace para acceder al [UXPressia](https://uxpressia.com/w/0zjVz/p/K12gT/m/0cWAy)

Administrador:

![Customer Journey Map Adminsitrador](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/d68c667c-947e-415e-ac20-3527611cd73b)

Enlace para acceder al [UXPressia](https://uxpressia.com/w/0zjVz/p/K12gT/m/6xYWr)

####     3.4. Empathy Mapping.

Técnico Supervisor:

![Empathy Map Técnico](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/e4c3829e-d60f-4e7b-bf96-39dece6dd4cc)

Enlace para acceder al [UXPressia](https://uxpressia.com/w/0zjVz/p/K12gT/p/obQDr)

Administrador:

![Empathy Map Administrador](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/3e915a48-741d-4088-8145-d7bc43655d04)


Enlace para acceder al [UXPressia](https://uxpressia.com/w/0zjVz/p/K12gT/p/I5oHs)

####     3.5. As-is Scenario Mapping.

Para la realizar el As-is Scenario Mapping el equipo de realizó todo el needfinding para así tener una mayor dominio sobre el negocio y poder determinar la situación actual en una planta champiñonera. De modo que podamos conocer las diferentes phases que corresponden para cada segmento objetivo y así tener un mejor conocimiento del flujo de trabajo.

Técnico Supervisor:

![As-Is Técnico Supervisor](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/5b109c1b-1223-48bf-b39a-4cb3ed34a1c7)


Enlace para acceder al [Miro](https://miro.com/app/board/uXjVMqkRnQw=/?moveToWidget=3458764562441801592&cot=14)

Administrador:

![As-Is Administrador](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/84add9a5-b170-44b4-9cb4-0eb98782987b)


Enlace para acceder al [Miro](https://miro.com/app/board/uXjVMqkRnQw=/?moveToWidget=3458764562441801771&cot=14)


## Capítulo III: Requirements Specification
### 1. **To-Be Scenario Mapping.**

Para la realizar el To-be Scenario Mapping el equipo determinó como se vería el flujo de trabajo luego de que nuestra solución, Greenhouse, haya sido implementada para ambos segmentos objetivos. De modo que podamos comparar y mejorar los aspectos negativos identificados en el As-is Scenario.

Técnico Supervisor:

![To-Be Técnico Supervisor](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/4d18a5af-5deb-4152-8d7c-082035b2d4a7)

Enlace para acceder al [Miro](https://miro.com/app/board/uXjVMqkRnQw=/?moveToWidget=3458764562441801833&cot=14)

Administrador:

![Greenhouse As-Is_To-Be - To-Be Adminstrador](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/9efc203e-9302-49bb-8373-08c93a83041a)

Enlace para acceder al [Miro](https://miro.com/app/board/uXjVMqkRnQw=/?moveToWidget=3458764562441933032&cot=14)

### 2. **User Stories.**
Lorem ipsum dolor sit amet
### 3. **Impact Mapping.**

En la presente sección se presenta el impact map para de Greenhouse elaborado con UXPresia. Identificando los buisiness goals con los criterios SMART, los actores que son los User Persona realizados previamente, los impacts, los derivables y los User Stories con el formato correspondientes.

![Greenhouse Impact map](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/9d6d3a10-e60a-45d3-bdd9-dbdcc792abb6)


Enlace para acceder al [UXPressia](https://uxpressia.com/w/0zjVz/p/K12gT/i/ArHxk)

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
El enfoque de "Greenhouse" para la aplicación web es de elegancia, sencillez y eficiencia para realizar los procesos. Las etapas del proceso y los formularios que deben llenarse están representados en formularios y secciones que abarcan la mayoría de la pantalla. 

##### Tarjetas:

Se hace uso del componente "mat-card" de la colección de Angular Material para representar los avisos y las notificaciones importantes de la aplicación. Los avisos deberán de ser acompañados de una imagen representativa, la cual será asignada por defecto en el caso que el emisor decida no seleccionar una imagen. Las tarjetas incluyen un título, un subtítulo, un párrafo descriptivo y representarán un hipervínculo para la obtención de más información.

##### Imágenes:

En el diseño web se incluirán imágenes descriptivas y con un objetivo puntual. En primer lugar, la imagen de perfil del usuario y de la empresa en la cual está registrado dentro de la aplicación se encontrarán en todo momento en la parte superior izquierda, esto con el objetivo de ayudar al usuario a identicar la sesión en la que se encuentra y ayudarlo a navegar rápidamente a sus datos personales. 
Adicionalmente, se contará con imágenes representativas para cada una de las cuatro secciones que representan el núcleo principal de nuestra aplicación. Dado que las aplicaciones de escritorio se muestran en una alta resolución de pantalla, resulta de suma importancia que el usuario cuente con guías visuales fácilmente identificables para acceder a las secciones con el flujo funcional de la aplicación. Por esta misma razón no se hace uso de imágenes de fondo en la aplicación con excepción del log-in, la startup cree que el estilo del diseño web y móvil debe atenerse a la sobriedad en el entorno empresarial del segmento objetivo.

Finalmente, como se explicó anteriormente, se hace uso de una imagen de fondo para la pantalla de inicio de la aplicación web. Debería transmitirse, desde la primera pantalla de la interfaz de la app, que el usuario se encuentra en el sitio web de Greenhouse. Esta imagen, además, tiene la posibilidad de ser cambiada en el caso de eventos y promociones cuyo objetivo sea promocionar al negocio.

##### Botones:

Se utilizan los botones según lo especificado en el apartado de General Style Guidelines. En la aplicación web, se suelen encontrar en la parte inferior de la sección principal de la pantalla. Estos botones permiten al usuario realizar acciones que añadan, eliminen y modifiquen los registros que se muestran en la vista del usuario en la parte superior. Por otro lado, se deben mostrar botones de confirmación para las acciones que creen nuevos procesos y que involucren al funcionamiento de toda la fábrica. Todos los botones cuentan con un estilo distintivo y un alto contraste con los colores del resto de la aplicación. Se utiliza la teoría del color en los botones de color rojo para representar acciones que eliminen procesos o los den por finalizados.

##### Tablas:
Las tablas cuentan con los colores distintivos de la aplicación, verde y blanco, y cada fila representa una instancia de registro. Las tablas de registros son el elemento principal para mostrar los datos de la aplicación, por lo tanto, se utilizan como componente central y suelen ser el foco de las vistas en las cuales aparecen.
##### Pantallas Emergentes:
Las pantallas emergentes tienen el objetivo de confirmar acciones clave para el funcionamiento del negocio y con gran repercusión en el mismo. Los _pop-ups_ cuentan con colores con un valor de matiz mayor que sus contrapartes pasteles del resto de la aplicación web. Además, su aparición oscurece el resto de la pantalla para generar un efecto de contraste. Este efecto busca transmitir la importancia de la resolución del asunto de la pantalla emergente antes de que el usuario continúe con la navegación en la app.

### 2. **Information Architecture.**
Al ser Greenhouse un software que optimiza un flujo funcional que es en gran medida núcleo del negocio, es importante que en todo momento el usuario esté consciente del proceso que está realizando y el lugar dónde se encuentra dentro de la aplicación. La información de las fases o los procesos que forman un todo se encuentra categorizada y ubicada de forma secuencial. El usuario sigue a una unidad que representa el proceso general, un cultivo, y progresivamente registra las fases que sigue el cultivo hasta su finalización vía diferentes pantallas de la solución web.
Mediante la vista de "Panel de Control", se muestra una interfaz más generalizada de las funcionalidades de la aplicación que se involucran a un nivel superior con el desarrollo de los procesos. De esta manera, se logra una distinción notable entre el registro de procesos y el análisis que se realiza a partir de estos.
####     2.1. Organization Systems.
La organización visual de contenido se realizará de tres formas diferentes en las varias vistas de la aplicación. La **organización de forma jerárquica** presenta al usuario con un orden de importancia para los elementos que se muestran en pantalla. Se utilizó este orden para las pantallas de log-in y los perfiles de los empleados y las empresas que los representan. Los títulos de los datos acaparan mayor parte de la pantalla en comparación a los datos ingresados o que deben ingresarse. Adicionalmente, las opciones de modificación de información para los perfiles se encuentran en un color azul claro que armoniza con el color blanco de la aplicación y no causa una impresión fuerte, por lo que se espera que el usuario vea las opciones de modificación después de leer sus datos personales.

El proceso núcleo de negocio de las fases de cultivo utiliza una **organización secuencial** de la información. El elemento "mat-timeline" de Angular Material guía al usuario a través del cultivo de champiñones, muestra los insumos necesarios para iniciar un cultivo, las actividades en el patio, búnker, túnel y el proceso de crecimiento de incubación, cobertura, inducción y cosecha. El usuario técnico supervisor puede visualizar los cultivos en la fase en la que se encuentran y dar por finalizadas las fases para continuar con la siguiente. El contenido de los procesos está categorizado de forma **cronológica**, es importante para los técnicos supervisores mantener un registro de los cultivos que llevan más tiempo en producción. Estos últimos cultivos tienen requisitos específicos y diferentes a los cultivos que apenas empiezan a ser producidos.

Para el panel de control, es necesario ofrecer al cliente una vista general de la aplicación mediante una **organización matricial**. El panel de control se concentra en una vista general del uso de la aplicación Greenhouse por parte de la empresa. En esta vista, se mostrarán imágenes que lleven al usuario a los cultivos en progreso, información de la empresa, reportes estadísticos y el historial de cultivo. Esta pantalla sigue una categorización de contenido **por tópicos**, dado que las tarjetas y los hipervínculos cuentan con diferentes tópicos debidamente representados visualmente.

Para las pantallas de listado de empleados dentro de la empresa, su categorización será de tipo **alfabético** en base a los nombres completos de los empleados. El propósito de esta categorización es dar a los administradores una vista que sea similar a los registros presenciales con los que ya cuentan en medios físicos.

Por último, la pantalla de inicio de la aplicación sigue una **categorización por audiencia**, se entiende que cada uno de los segmentos objetivos tiene un propósito diferente al momento de acceder a la aplicación por primera vez en el día. Los administradores verán como pantalla principal el panel de control de la aplicación web. En cambio, los técnicos supervisores serán recibidos con la pantalla de registro de procesos de cultivos.
####     2.2. Labeling Systems.
Los encabezados se encuentran presentes en las pantallas que no forman parte del proceso principal de la aplicación. Cada uno resume de forma adecuada al usuario todo el contenido de la vista actual.
Además de imágenes, las secciones del panel de control están asociadas con labels que informan al usuario del contenido que puede visualizar si accede a estas secciones. Es por esta razón, además, que todas las tarjetas presentadas en esta vista cuentan con sus respectivos títulos.
En la barra de navegación se evidencian en todo momento las etiquetas textuales para las vistas principales, panel de control y registro de procesos.
####     2.3. SEO Tags and Meta Tags.

####     2.4. Searching Systems.
Es importante que los usuarios administradores tengan la posibilidad de distinguir y filtrar la información de los registros almacenados en la aplicación web. Uno de los objetivos del sistema es representar de forma adecuada, fácil y rápida la gran cantidad de información que va a ser añadida por las empresas que lo utilizan. Los usuarios podrán buscar los cultivos registrados por su fecha de registro y la fase en la que se encuentran. Asimismo, podrán filtrar en base a fecha, fase y autor del registro de cultivos en el histórico general de los cultivos realizados. Adicionalmente, la funcionalidad de búsqueda estará también presente en la visualización de los empleados de la empresa. 
####     2.5. Navigation Systems.
Los sistemas de navegación principales de la Landing Page son los menús de navegación superior e inferior. El sistema de labeling desplaza a los usuarios a las secciones que desean visualizar dentro de la página. En el caso no se haga uso de estos enlaces, el usuario verá la página de forma descendente.
En la aplicación, los usuarios recorrerán el proceso de cultivo con secciones enumeradas y presentes arriba de los registros de cada una de las fases. Los usuarios podrán saltar de una fase a otra o seguir un camino secuencial. Los botones, de igual manera, representan la apertura, confirmación o finalización de un registro y permiten el seguimiento del proceso en una nueva pantalla.
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
