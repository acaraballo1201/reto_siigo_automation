# SIIGO Web Test – Screenplay

Este proyecto es creado para realizar pruebas funcionales a la aplicacion de siigo
 
## Contenido ##
 
- [Prerrequisitos](#prerrequisitos)
- [Configuracion](#configuracion)
- [Ejecucion de pruebas](#ejecucion)
- [Changelog](#changelog)
 
## Prerrequisitos 📋
 
- IDE instalado
- JDK 1.8
- Gradle 7.0 o superior
- GIT
 
## Configuracion ⚙️
 
Ya descargado el proyecto, importarlo en el IDE de preferencia.

Es importante compilar el proyecto para esto, ejecutar alguno de los siguientes comandos.
Ejecutar por consola 
```
gradle clean assemble
gradle compileJava
```
**Nota:** El comando gradle clean assemble ejecuta el compileJava por defecto.

## Ejecucion 🚀

**Ejecución Todos los test**

Para ejecutar todos los test del proyecto y generar el reporte puede usar.

```
gradle clean test aggregate
```

**Ejecución algunos test**

Para ejecutar algunos test se puede usar el comando
```
gradle clean test -Dtest.single=**/runners/operacion/nombrePrueba aggregate
```
Esta es la estructura base. Quedaria como ejemplo:
```
gradle clean test -Dtest.single=**/runners/autenticacion/Autenticacion aggregate
```

### Nota

***El drivers actuales son compatibles con las ultimas versiones de los navegadores Chrome, Firefox y Microsoft Edge en 
caso de que no funcione por temas del driver ingresar a las URL:***
* ***Para Chrome: [ChromeDriver - WebDriver for Chrome](https://chromedriver.chromium.org/)***
* ***Para Firefox: [Supported platforms](https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html) y
[Descargas version](https://github.com/mozilla/geckodriver)***
    
***Buscar el driver correspondiente a la version del navegador instalado en tu computadora; guardarlo en la ruta 
de vuestra maquina poe defecto, en el caso de Windows se recomienda tener los dirver en C://, reemplazar el que esta en la ruta por el nuevo descargado y ejecutar las pruebas.***

***Cualquier duda comunicarse por Teams con [Andres Caraballo Ortiz]()***

**Ejecucion de test con un driver en otra ruta**

Si tiene el driver en alguna ruta en tu computadora o tienes un sistema operativo diferente puedes utilizar esta linea 
y puede agregarla al comando de ejecucion.
```
-Dwebdriver.chrome.driver=Ubicacion del driver
```
Esta es la estructura base. Quedaria como ejemplo:
```
gradle clean test -Dwebdriver.chrome.driver=C://chromedriver.exe aggregate
```

todos los filtros que se pueden usar se pueden ver en:
[docGradle](https://docs.gradle.org/current/javadoc/org/gradle/api/tasks/testing/TestFilter.html)
 
