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

Como **misión** de la startup se plantea “crear productos basados en la realidad que permitan una mejoría en el desarrollo de los procesos productivos”. Para ello, la startup enfoca sus esfuerzos en la identificación de problemas frecuentes de los trabajadores y en la búsqueda de sus soluciones mediante el uso del software.

Por otro lado, la **visión** de la startup consiste en “ser la ayuda número uno de las empresas para la simplificación de procesos productivos en el Perú”. Se busca la confianza de las empresas para que las soluciones de la startup puedan formar parte de los distintos rubros de la industria de producción. A su vez, el equipo busca ser reconocido nacionalmente como un modelo de negocio sostenible y comprometido con brindar un servicio de calidad que satisfaga las necesidades de los usuarios.
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

![Greenhouse Impact map](https://github.com/Integradis-OpenSource/TFDocOpenSource/assets/103552798/9d6d3a10-e60a-45d3-bdd9-dbdcc792abb6)


https://uxpressia.com/w/0zjVz/p/K12gT/i/ArHxk

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
