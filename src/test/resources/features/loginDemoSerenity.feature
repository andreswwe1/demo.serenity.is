Feature: inicio de sesion Demo Serentity

   Scenario Outline: Validacion de Credenciales a la pagina Demo serenity
    Given que ingrese a la url de la pagina Demo Serenity
    When ingreso las credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
     And presiona el boton iniciar sesion
     Then se visualizara el mensaje "<mensaje>"

     Examples:
       | Usuario | Clave    | mensaje                                                                               |
       | admin   | serenity | Dashboard                                                                             |
       | admin1  | serenity | Invalid username or password!                                                         |
       | admin14 | serenity | Dashboard                                                                             |
       | admin   | serenity | Invalid username or password!                                                         |
       |         |          | Please validate empty or invalid inputs (marked with red) before submitting the form. |
       | admin   |          | Please validate empty or invalid inputs (marked with red) before submitting the form. |
       |         | serenity | Please validate empty or invalid inputs (marked with red) before submitting the form. |
       | admin   | serenity | Please validate empty or invalid inputs (marked with red) before submitting the form. |