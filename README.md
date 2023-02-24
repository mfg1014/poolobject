poolobject
==========

[![Java CI](https://github.com/mfg1014/poolobject/actions/workflows/ci.yml/badge.svg)](https://github.com/mfg1014/poolobject/actions/workflows/ci.yml) [![codecov](https://codecov.io/gh/mfg1014/poolobject/branch/master/graph/badge.svg)](https://app.codecov.io/gh/mfg1014/poolobject)

Java code example of creational design pattern pool object

Workshop to use good practices in software developmemnt: testing and measurement.

Authors:

- Carlos Lopez Nozal
- Jesus Alonso Abad
- Miguel Fuente García
- Diego González San Emeterio


Repositorio Github: https://github.com/mfg1014/poolobject

Objetivos de la práctica:
• Comprender los objetivos de medición y la evaluación de productos, procesos y recursos software.
• Comprender, aplicar y analizar técnicas de medición sobre el código realizado, relacionando los conceptos con los test unitarios realizados.

Enunciado:
Para la práctica se nos pide a partir de un producto software en este caso el patrón de diseño Pool Object, crear un conjunto de pruebas con el objetivo de evaluar su cobertura mediante la herramienta codecov.


Preguntas:

◦ ¿Se ha realizado trabajo en equipo?
- Sí, como se pueden ver en los commits de github, hemos participado ambos, ya sea en mayor o menor medida.

◦ ¿Tiene calidad el conjunto de pruebas disponibles?
- El conjunto de pruebas disponibles ofrece un 84.09% de cobertura. Desglosando el resultado obtenido:

	-El fichero main: https://app.codecov.io/gh/mfg1014/poolobject/tree/master/src/main/ubu/gii/dass/c01
	Contiene las clases: Client.java, Reusable.java, ReusablePool.java, y las excepciones DuplicatedInstance y NotFreeInstance. En este fichero se obtiene un 100% de cobertura en todas sus clases.

	-El fichero test https://app.codecov.io/gh/mfg1014/poolobject/tree/master/src/test/ubu/gii/dass/test/c01
	Este fichero tiene un 73.58% de cobertura. Esto se debe a que en ambos test, su ejecución no comete errores, por lo que el test no recoge ninguna excepción, debido a que estas nunca se producen.

◦ ¿Cuál es el esfuerzo invertido en realizar la actividad?
- Para realizar la actividad, no nos ha costado mucho esfuerzo, en menos de 1 día hemos realizado la práctica. Se puede ver en la gráfica de tiempo del codecov; el problema ha sido la integración del proyecto a github, donde la primera clase de prácticas (2 horas) estuvimos configurándolo debido a problemas de integración del repositorio con Ecplise, y la segunda clase de prácticas no podíamos hacer los commits a Github.

◦ ¿Cúal es el número de fallos encontrados en código?

- En el código se han encontrado 2 fallos:
	-Client.java: los atributos de esta clase deben ser tanto public como static.
	-ReusablePool.java: el constructor de la clase debe ser public.
	Sin haber realizado estos cambios, no podríamos haber ejecutado los tests.

