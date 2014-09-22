# language: sv
Egenskap: Lista filmbibliotek
  För att få en överblick av mitt filminnehav
  Som filmsamlare
  Vill jag kunna lista alla filmer i mitt filmbibliotek

  Scenario: Lista filmer
    Givet att filmbiblioteket innehåller filmerna "Jaws,Alien,Star Wars"
    När jag listar alla filmer
    Så ska listan se ut så här:
      | Jaws                        |
      | Alien                       |
      | Star Wars                   |
      | Antal filmer i samlingen: 3 |
