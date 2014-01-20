# language: sv
Egenskap: Som en filmsamlare vill jag kunna lista mitt tomma filmbibliotek så att jag kan förvissa mig om att det är tomt
  Scenario: Lista tomt bibliotek

    Givet att filmbiblioteket är tomt
    När jag listar alla filmer
    Så ska listan se ut så här:
    |Ditt filmbibliotek är tomt.|
