Programas necessários para a execução do projeto:

- SpringToolsSuite (StandAlone Version ou Incorporada ao Eclipse)
- MySql
- Postman

Passo a Passo de como executar o projeto:

- Dentro da IDE do Spring ou Eclipse vá até "File";
- Clique em "Open projects from file system";
- Clique em Directory e selecione a pasta em que se encontra o projeto na máquina;
- Clique em "Finish" e aguarde a finalização das configurações;
- O Projeto estará a esquerda na aba "Package Explorer";
- Expanda a pasta principal e depois expanda a pasta "src/main/resources" e clique em "application.properties";
- Nas linhas 3 e 4 modifique o usuario e senha para combinar com o seu MySql e o banco ser criado localmente ao rodar o projeto;
- Salve o arquivo com CTRL+S;
- Localize a pasta "src/main/java" e clique para expandir, dentro do pacote "br.com.duxus" se encontra o arquivo principal;
- Clique com o botão direito e vá ate "Run as", selecione "SpringBoot App" e aguarde a compilação;
- Abra o Postman e acesse a collection através deste link https://app.getpostman.com/join-team?invite_code=d73ec1f923947b78b25b660fdfbae246&ws=f7e1d11d-243f-4012-8309-397c1c101753
- Localize o workspace "Desafio Duxus" e expanda a pasta "Integrante";
- Dentro das pastas "Cadastro, Consulta, Edição e Exclusão" se encontram as requisições "Post, Get, Put e Delete"
- O corpo da requisição (body) e os endpoints juntamente com os parâmetros já estão salvos, mas caso algo ocorra, aqui estão:

*Para executar, abra a requisição desejada, vá até a guia "Body", selecione "raw" e aonde está escrito "Text", troque para "JSON"  para executar, clique em "Send"

-------------------------------------------------------------------------------------------------------------------------------------
Para Cadastro de Integrante: http://localhost:8080/integrantes
Exemplo de Body para Cadastro de Integrante: 
{
    "franquia": "Apex Legends",
    "nome": "Lifeline",
    "funcao": "Médica"
}

Para Consulta FindAll de Integrante: http://localhost:8080/integrantes

Para Consulta FindById de Integrante: http://localhost:8080/integrantes/1

Para Consulta FindByNome de Integrante: http://localhost:8080/integrantes/nome/daniel

Para Edição de Integrante: http://localhost:8080/integrantes
Exemplo de Body para Edição de Integrante:
{
    "id": 1,
    "franquia": "Apex Legends",
    "nome": "LifeLine",
    "funcao": "Médica"
}

Para Exclusão de Integrante: http://localhost:8080/integrantes/1
-------------------------------------------------------------------------------------------------------------------------------------

Para Cadastro de Time: http://localhost:8080/times
Exemplo de Body para Cadastro de Integrante: 
{
    "data": "2021-08-19"
}

Para Consulta FindAll de Time: http://localhost:8080/times

Para Consulta FindById de Time: http://localhost:8080/times/1

* Para Consulta FindByData de Time: http://localhost:8080/times/data/19

Para Edição de Time: http://localhost:8080/times
Exemplo de Body para Edição de Time:
{
    "id": 1,
    "data": "2018-12-01"
}

Para Exclusão de Time: http://localhost:8080/times/1
-------------------------------------------------------------------------------------------------------------------------------------

Para Cadastro de Composição Time: http://localhost:8080/compTimes
Exemplo de Body para Cadastro de Composição Time: 
{
    "time": {
        "id": 1
    },
    "integrante": {
        "id": 1
    }
}

Para Consulta FindAll de Composição Time: http://localhost:8080/compTimes

Para Consulta FindById de Composição Time: http://localhost:8080/compTimes/1

Para Edição de Time: http://localhost:8080/compTimes
Exemplo de Body para Edição de Composição Time:
{
    "id": 1,
    "time": {
        "id": 1
    },
    "integrante": {
        "id": 1
    }
}

Para Exclusão de Composição Time: http://localhost:8080/compTimes/2