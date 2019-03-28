$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/modyo/testing/features/prueba.feature");
formatter.feature({
  "name": "Prueba de Selenium",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@prueba"
    }
  ]
});
formatter.scenario({
  "name": "Login en LarrainVial",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@prueba"
    }
  ]
});
formatter.step({
  "name": "voy al login privado de larrain vial",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDefinition.voy_al_login_privado_de_larrain_vial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso \"mormazabal@modyo.com\" en el campo email",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.ingreso_en_el_campo_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso \"Cambiame2019\" en el campo clave",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.ingreso_en_el_campo_clave(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hago click en el boton ingresar",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.hago_click_en_el_boton_ingresar()"
});
formatter.result({
  "status": "passed"
});
});