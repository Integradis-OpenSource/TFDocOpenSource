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
|Commetant Rubiños, Jessica Elizabeth|U20211C009|
|Espinoza Rodriguez, Nicolas Antonio|U202110278|
|Galavis Du Bois, Alan Enrique|U202110223|
|Seminario Garbin, Carlo Luca|U20211A475|
|Soto Kong Requena, Andres Eduardo|U202116113|

**Ciclo 2023-02**

## Registro de versiones del informe

| Versión |Fecha|Autor|Descripción de modificación |
|:-------:|:----------:|:---------------------------------------------:|:--------------------:|
|1.0|15/08/2023|Commetant, Espinoza, Galavis, Seminario, Soto|Creación del documento de trabajo en formato markdown|

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
La startup que se presenta recibe como nombre “Integradis”. Esta se enfoca en ofrecer proyectos de software que ayuden a la optimización de procesos en entornos empresariales. Se cuenta con un equipo técnico capacitado en crear aplicaciones que aporten calidad de vida necesaria a las empresas productoras que cuentan con sistemas antiguos y propensos a fallos.

Como misión de la startup se plantea “crear productos basados en la realidad que permitan una mejoría en el desarrollo de los procesos productivos”. Para ello, la startup enfoca sus esfuerzos en la identificación de problemas frecuentes de los trabajadores y en la búsqueda de sus soluciones mediante el uso del software.

Por otro lado, la visión de la startup consiste en “ser la ayuda número uno de las empresas para la simplificación de procesos productivos en el Perú”. Se busca la confianza de las empresas para que las soluciones de la startup puedan formar parte de los distintos rubros de la industria de producción. A su vez, el equipo busca ser reconocido nacionalmente como un modelo de negocio sostenible y comprometido con brindar un servicio de calidad que satisfaga las necesidades de los usuarios.
####     1.2. Perfiles de los integrantes del equipo


| Perfiles de los integrantes del equipo |        |
| :--------| :--------: |
| Mi nombre es **Nicolás Antonio Espinoza Rodriguez**. Tengo 19 años y estoy estudiando la carrera de ingeniería de software en la UPC desde el año 2021. Soy una persona creativa e imaginativa, lo que me ayuda a aportar soluciones para resolver los problemas en común. También, me considero empático y colaborativo, lo que facilita el trabajo en equipo con mis compañeros. Finalmente, me considero una persona ordenada y con ambición, lo que ayuda a trazar metas posibles y significativas para la solución que queremos presentar como equipo. Soy competente en los lenguajes de programación C++, Python y Javascript. Además, tengo conocimiento de tecnologías ágiles y software de control de versiones.|<img src="https://hackmd.io/_uploads/H1dUSaqhn.png" alt="Nicolas Espinoza" width="250px" />
| Mi nombre es **Alan Enrique Galavis Du Bois**, tengo 20 años y actualmente curso el sexto ciclo de la carrera de ingeniería de software en la UPC (Universidad Peruana de Ciencias Aplicadas). Considero que soy organizado, perseverante y creativo, cualidades que me serán de gran utilidad al momento de trabajar en equipo. Me apasiona encontrar soluciones innovadoras a problemas relacionados con la computación. Al haber crecido en la era digital, estoy familiarizado con el uso de tecnologías de la información y la comunicación.|![](https://hackmd.io/_uploads/S1znb692n.png)|
Mi nombre es **Carlo Luca Seminario Garbín** tengo 19 años de edad y actualmente curso el sexto ciclo de la carrera de ingeniería de software en la Universidad Peruana de Ciencias Aplicadas (UPC). Considero que soy una persona que es capaz de trabajar bajo presión, además de ser responsable y perseverante. En cuanto a cualidades para la realización del trabajo considero que soy bueno identificando problemáticas y proponiendo soluciones, a lo que le puedo sumar los conocimientos previos de los ciclos anteriores en cursos de programación y conocimientos adquiridos mediante mi aprendizaje autónomo.|![](https://hackmd.io/_uploads/SJvfXTq22.png)|
Mi nombre es **Andrés Eduardo Soto Kong Requena**, soy estudiante de ingeniería de software de la UPC (Universidad Peruana de Ciencias Aplicadas). Me gusta generar soluciones para problemas digitales, es por ello que elegí dicha carrera. Además, me considero bueno para trabajar en situaciones bajo estrés. De la misma forma, considero que las situaciones de mi vida personal me han preparado para afrontar una gran variedad de situaciones en las áreas, tanto laboral como social. Finalmente, soy una persona responsable, lo cual me ha ayudado en una gran cantidad de ocasiones en el momento de la entrega de trabajos.|![](https://hackmd.io/_uploads/r1eHSaq32.png)|


### 2. **Solution Profile.**
####     2.1. Antecedentes y Problemática
Lorem ipsum dolor sit amet
####     2.2. Lean UX Process
#####         **2.2.1.Lean UX Problem Statements.**
Lorem ipsum dolor sit amet
#####         **2.2.2.Lean UX Assumptions.**
Lorem ipsum dolor sit amet
#####         **2.2.3.Lean UX Hypothesis Statements.**
Lorem ipsum dolor sit amet
#####         **2.2.4.Lean UX Canvas.**
Lorem ipsum dolor sit amet
### 3. **Segmentos objetivo.**
Para el presente trabajo se han considerado dos segmentos objetivos.
- Técnicos supervisores de la fábrica de champiñones, encargados de las coordinaciones generales de procesos productivos



## Capítulo II: Requirements Elicitation & Analysis

### 1. **Competidores.**
####     1.1. Análisis competitivo.
Lorem ipsum dolor sit amet
####     1.2. Estrategias y tácticas frente a competidores.
Lorem ipsum dolor sit amet
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
Lorem ipsum dolor sit amet
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
