# TCC-Fatec
##### Trabalho de conclusão de curso - Redes de computadores - Fatec Osasco.
------------
Este é o repositorio de codigos do  TCC de Redes de Computadores, foi desenvolvido por [Uniliva](https://www.linkedin.com/in/uniliva/ " Uniliva") e Wagner Evangelista.

## Tema
U-MONITOR: Um estudo de caso da construção de um sistema de monitoramento de temperatura e energia.

## Descrição
Este trabalho propõe uma solução que analisa a temperatura dos alimentos e fornecimento de energia dos refrigeradores ondes são armazenados através de um pequeno sensor, feito utilizando um microcontrolador Arduíno, um módulo GPRS, um sensor de temperatura e um de corrente elétrica, que coleta os dados das condições térmicas do alimento e elétrica do equipamento, e envia para uma API que depois pode ser acessado por um portal de monitoramento.

## Estrutura do projeto neste repositório

|-**Projeto-tcc-fatec-osasco**
|--> **[arduino](https://github.com/Uniliva/tcc-fatec-arduino "arduino") ** - *Código do programa que roda no dispositivo*

|--> **back-end ** - *Fontes da API*

|----> **[spring-deprecated](https://github.com/Uniliva/tcc-fatec-back-end "spring-deprecated")** - *1º versão – desenvolvida com Spring Boot*

|----> **[scala-current](https://github.com/Uniliva/tcc-fatec-back-end-scala "scala-current")**  - *1º versão – desenvolvida com Scala*

|--> **documentos ** - *Documentos do projeto.*

|--> **front-end ** - *Portal de monitoramento.*

|----> **[angularjs-deprecated](https://github.com/Uniliva/tcc-fatec-front-end "angularjs-deprecated") ** - *1º versão - desenvolvida com Angular JS.*

|----> **[angular2-current](https://github.com/Uniliva/tcc-fatec-front-end-angular2 "angular2-current")**   - *1º versão - desenvolvida com Angular 2*

## Download
Após fazer o Download do projete execute o comando abaixo para baixar os submódulos.
```bash
git submodule init
git submodule update
```
Entre em cada submódulo e veja o README.md para saber como buildar, e executar a API e o portal (front-end), estão dento de cadas projeto.

------------
