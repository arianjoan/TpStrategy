# TpStrategy
Trabajo practico N1 - Patron Strategy (Torneo de Frescas)

# ¿Qué es Maven?

Maven es una herramienta open-source, que se creó en 2001 con el objetivo de simplificar los procesos de build (compilar y generar ejecutables a partir del código fuente), permitiéndonos compilar cualquier tipo de proyecto de la misma manera, librándonos de todas las dificultades que hay por detrás.

Pero lo cierto es que Maven es mucho más que una herramienta que hace builds del código.

Podríamos decir, que Maven es una herramienta capaz de gestionar un proyecto software completo, desde la etapa en la que se comprueba que el código es correcto, hasta que se despliega la aplicación, pasando por la ejecución de pruebas y generación de informes y documentación.

Para ello, en Maven se definen tres ciclos de build del software con una serie de etapas diferenciadas. Por ejemplo el ciclo por defecto tiene las etapas de:

·Validación (validate): Validar que el proyecto es correcto.

·Compilación (compile).

·Test (test): Probar el código fuente usando un framework de pruebas unitarias.

·Empaquetar (package): Empaquetar el código compilado y transformarlo en algún formato tipo .jar o .war.

·Pruebas de integración (integration-test): Procesar y desplegar el código en algún entorno donde se puedan ejecutar las pruebas de integración.

·Verificar que el código empaquetado es válido y cumple los criterios de calidad (verify).

·Instalar el código empaquetado en el repositorio local de Maven, para usarlo como dependencia de otros proyectos (install).

·Desplegar el código a un entorno (deploy).

Para poder llevar a cabo alguna de estas fases en nuestro código, tan solo tendremos que ejecutar mvn y el nombre de la fase (la palabra entre paréntesis). Además van en cadena, es decir, si empaquetamos el código (package), Maven ejecutará desde la fase de validación (validate) a empaquetación (package).

Por otra parte, con Maven la gestión de dependencias entre módulos y distintas versiones de librerías se hace muy sencilla. En este caso, solo tenemos que indicar los módulos que componen el proyecto, o qué librerías utiliza el software que estamos desarrollando en un fichero de configuración de Maven del proyecto llamado POM.

Además, en el caso de las librerías, no tienes ni tan siquiera que descargarlas a mano. Maven posee un repositorio remoto (Maven central) donde se encuentran la mayoría de librerías que se utilizan en los desarrollos de software, y que la propia herramienta se descarga cuando sea necesario.

# ¿Que es POM?

Un modelo de objeto de proyecto o POM es la unidad fundamental de trabajo en Maven. Es un archivo XML que contiene información sobre el proyecto y los detalles de configuración utilizados por Maven para construir el proyecto. Al ejecutar una tarea o un objetivo, Maven busca el POM en el directorio actual. Lee el POM, obtiene la información de configuración necesaria y luego ejecuta el objetivo.

Algunas de las configuraciones que se pueden especificar en el POM son las dependencias del proyecto, los complementos u objetivos que se pueden ejecutar, los perfiles de compilación, etc. También se puede especificar otra información, como la versión del proyecto, descripción, desarrolladores, listas de correo y similares.

# ¿Qué es un archetype y un artefact ID?

En esencia, un archetype es un patrón o modelo sobre el que se pueden desarrollar todas aquellas tareas que son de un mismo tipo. Puede decirse que son plantillas, parametrizadas o configuradas para utilizar determinadas tecnologías que los desarrolladores utilizan como base para escribir y organizar el código de la aplicación.

ArtifactId es la identificación que recibe una dependencia dentro del Maven Central, es decir, es el nombre con el que nosotros podemos integrar dicha dependencia dentro de nuestro proyecto.

# Goals en MAVEN (Clean, Package, Install, Compile)

Un Goal no es mas que un comando que recibe maven como parámetro para que haga algo, algunos ejemplos son:

Clean: Limpia los artefactos creados por versiones anteriores al momento de compilar.
Package: Toma el código compilado y lo empaqueta en su formato distribuible, como un .jar.
Install: Instala el paquete en el repositorio local, para usarlo como una dependencia en otros proyectos a nivel local.
Compile: Compila el codigo fuente del proyecto.

# Scopes en MAVEN (Compile, Provider, runtime, test, system).

El scope sirve para indicar el alcance de nuestra dependencia y su transitividad. 

Compile: es la que tenemos por defecto sino especificamos scope. Indica que la dependencia es necesaria para compilar. La dependencia además se propaga en los proyectos dependientes.
Provide: Es como la anterior, pero esperas que el contenedor ya tenga esa libreria. 
Runtime: La dependencia es necesaria en tiempo de ejecución pero no es necesaria para compilar.
Test: La dependencia es solo para testing que es una de las fases de compilación con maven.
System: Es como provide pero tienes que incluir la dependencia explicitamente. Maven no buscará este artefacto en tu repositorio local. Habrá que especificar la ruta de la dependencia mediante la etiqueta <systemPath>












