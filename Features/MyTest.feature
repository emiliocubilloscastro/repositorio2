#Author: Emilio Cubillos Castro

Feature: Realizacióin de casos ingresando nombre de usuario y contraseña
Scenario: Verificacion de ingreso d esesion
Given Abrir Chrome
When ingresar Username "user" y Password "user"
Then inicia sesion