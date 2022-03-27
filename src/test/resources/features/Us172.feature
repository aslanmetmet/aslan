Feature: Us_172


  Scenario: TC_001_US_172
    Given kullanici "/homes/approval" endointine degeri "<approval>" ve home "61d22c3189708a2d2aeeda1c" ile birlikte "<userTip>" olarak baglan
    Then kullanici baglantinin states code "<code>" olararak dogrular.


    Scenario Outline:

      |apprroval | code|userTip|
      |0         | 202 |admin   |
      |1         |202  |admin|
      |2         |202  |admin|
      |1          |401  |kullanici|
      |2          |403  | yanlis|