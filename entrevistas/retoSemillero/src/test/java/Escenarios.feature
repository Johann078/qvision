#language:es
   Característica: : Probamos aplicativo souce

   Antecedentes:
    Dado Como usuario web ingreso al aplicativo www.saucedemo.com
    Cuando ingreso las credenciales del usuario <usuario>
    Ejemplo:
     |usuario|
     |Standard_user|
     ||
  Escenario:  Validar el ingreso al aplicativo web con el usuairo Standard_user
    Dado Valido que en la cuenta este los elementos de un standard_user
    Y este el elmento tal
    Y muestre el nombre de Standard_user

  Escenario: Validar el ingreso al aplicativo web con el usuairo problem_user
  Entonces no ingresa al ser un problem user
  Y muestra mensaje de error con el texto "esto es un error esperado de problem user "