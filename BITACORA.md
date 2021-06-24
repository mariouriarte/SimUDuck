# SimUDuck

- 1. La primera solución parece resolver la solicitud del cliente, hacer un simulador de patos.

- 2. Ya que el desarrollo contaba con una clase Duck, la herencia de los métodos parecía resolver todos los problemas.

- 3. Cuando al desarrollador se le indica que "muchos" tipos de patos podrán ser simulados, el sistema se rompe, ya que no estaba preparado para esto. por ejemplo patos de goma que no pueden volar.

- 4. Luego de mucho meditarlo, nos damos cuenta de que la herencia puede ser un problema. Lo que debemos hacer es abstraer el comportamiento del objeto y encapsular, para luego componerlo en la clase.

- 5. Para lograr que otros tipos de patos puedan ser simulados, segregamos las interfaces permitiendo agrupar los comportamientos, con esto evitamos duplicar código. Tambien se aplica el principio de inversión de dependencias las clases como FlyNoWay dependen de FlyBehavior y está a su vez deja de depender de las subclases

- 6. Los métodos performQuack() y performFly() son el encapsulamiento de los comportamientos de los patos, es decir no importa que contengan estos métodos, deben dar una respuesta.

El ejercicio nos da tres tips importantes de Principio de Diseño:
- 1. Identifique los aspectos de su aplicación que varían y sepárelos de los que permanecen igual.
- 2. Programe en una interfaz, no en una implementación.
- 3. Favorezca la composición sobre la herencia.

