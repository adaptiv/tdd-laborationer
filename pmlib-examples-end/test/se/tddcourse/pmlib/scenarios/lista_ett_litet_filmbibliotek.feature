# language: sv
Egenskap: Som en filmsamlare vill jag kunna lägga till filmtitlar så att jag kan sätta upp en ny samling
  Scenario: Tomt filmbibliotek
    Givet att filmbiblioteket är tomt
    När jag lägger till filmerna "Jaws,Star Wars,Alien"
    När jag listar alla filmer
    Så ska listan se ut så här:
    |Jaws|
    |Star Wars|
    |Alien|
    |Antal filmer i samlingen 3.|
