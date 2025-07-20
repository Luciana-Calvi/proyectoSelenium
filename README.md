# 🏆 Portafolio QA - Luciana Calvi

      Bienvenido a mi portafolio de pruebas automatizadas con Selenium Java. Este repositorio contiene pruebas 
      E2E desarrolladas para validar el flujo de compra de mascotas en el sitio web: 
      https://petstore.octoperf.com/actions/Catalog.action 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## 📚 Contenido

- [🎯 Objetivo del Proyecto](#-objetivo-del-proyecto)
- [📥 Clonación del Repositorio](#-clonación-del-repositorio)
- [🚀 Pruebas Realizadas](#-pruebas-realizadas)
- [🛠️ Tecnologías Utilizadas](#-tecnologías-utilizadas)
- [📂 Estructura del Proyecto](#-estructura-del-proyecto)
- [▶️ Cómo Ejecutar las Pruebas](#️-cómo-ejecutar-las-pruebas)
- [📸 Capturas de Pantalla / Videos](#-capturas-de-pantalla--videos)



## 🎯 Objetivo del Proyecto
  
      El objetivo de este repositorio es demostrar mis habilidades en pruebas automatizadas E2E utilizando Selenium Java, validando el flujo completo de compra de 
      mascotas. 
      Este proyecto forma parte de mi portafolio como QA Manual con conocimientos en automatización.

## 📥 Clonación del Repositorio

      Para obtener una copia local del proyecto, ejecuta el siguiente comando en tu terminal:
      git clone https://github.com/Luciana-Calvi/proyectoSelenium.git
      
## 🚀 Pruebas Realizadas

      📌 TestLogin.java - Incluye un caso positivo (credenciales válidas) y uno negativo (credenciales inválidas, verificación del mensaje de error y captura de pantalla).

      📌 TestRegistro.java - Incluye casos positivos, negativos y con campos vacíos. También guarda evidencia en caso de error.
      
## 🛠️ Tecnologías Utilizadas

      🏗️ Selenium (para las pruebas automatizadas)

      💻 Java (lenguaje principal para los tests)
      
      🌐 JUnit 5 (framework)
      
      🔗 Git y GitHub (control de versiones y repositorio remoto)
      
      🧩 Versiones de herramientas utilizadas:
            - JDK: 21
            - npm: 10.8.2
            - Selenium: 4.20.0
            -JUnit : 5.10.2
            -mvn: 3.9.6 

## 📂 Estructura del Proyecto

                  C:.
            ª   .gitattributes
            ª   .gitignore
            ª   estructura.txt
            ª   HELP.md
            ª   mvnw
            ª   mvnw.cmd
            ª   pom.xml
            ª   README.md
            ª   
            +---.mvn
            ª   +---wrapper
            ª           maven-wrapper.properties
            ª           
            +---.vscode
            +---evidencias
            ª       caso de prueba negativa_20250717_191817.png
            ª       
            +---src
            ª   +---main
            ª   ª   +---java
            ª   ª   ª   +---com
            ª   ª   ª       +---lucianacalvi
            ª   ª   ª           +---testselenium
            ª   ª   +---resources
            ª   ª           application.properties
            ª   ª           
            ª   +---test
            ª       +---java
            ª           +---com
            ª               +---lucianacalvi
            ª                   +---testselenium
            ª                       +---Base
            ª                       ª       Evidencias.java
            ª                       ª       SetUp.java
            ª                       ª       
            ª                       +---Elementos
            ª                       ª       Login.java
            ª                       ª       Registro.java
            ª                       ª       
            ª                       +---Test
            ª                               TestLogin.java
            ª                               TestRegistro.java
            ª                               
            +---target
                +---classes
                ª       application.properties
                ª       
                +---generated-sources
                ª   +---annotations
                +---generated-test-sources
                ª   +---test-annotations
                +---maven-status
                ª   +---maven-compiler-plugin
                ª       +---compile
                ª       ª   +---default-compile
                ª       ª           inputFiles.lst
                ª       ª           
                ª       +---testCompile
                ª           +---default-testCompile
                ª                   createdFiles.lst
                ª                   inputFiles.lst
                ª                   
                +---surefire-reports
                ª       com.lucianacalvi.testselenium.TestLogin.txt
                ª       com.lucianacalvi.testselenium.TestRegistro.txt
                ª       TEST-com.lucianacalvi.testselenium.TestLogin.xml
                ª       TEST-com.lucianacalvi.testselenium.TestRegistro.xml
                ª       
                +---test-classes
                    +---Base
                    ª       Evidencias.class
                    ª       SetUp.class
                    ª       
                    +---com
                    ª   +---lucianacalvi
                    ª       +---testselenium
                    ª               TestLogin.class
                    ª               TestRegistro.class
                    ª               
                    +---Elementos
                            Login.class
                            Registro.class

## ▶️ Cómo Ejecutar las Pruebas

      📌 Requisitos Previos

            Antes de ejecutar las pruebas, asegúrate de tener instalado:
            -JDK
            -Maven
            -Selenium
            -Chromedriver
            -Git y un entorno configurado

      🚀 Ejecutar las pruebas

            mvn -Dtest=NombreDelTest test

## 📸 Videos

-[Test Login](https://drive.google.com/file/d/1GmAAGzIsk3Xwl2tVN-WnI-ecYck1OEqe/view?usp=sharing)

-[Test Registro](https://drive.google.com/file/d/1sq7cIRlZnNZ1DpJ1Ot8-aEYJ8x54ZjMu/view?usp=sharing)

