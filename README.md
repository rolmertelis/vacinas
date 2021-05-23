## vacinas
### Desafio orange para ingresso na Zup

1. Procedimentos para rodar a aplicação
    1. Baixe o projeto e abra-o na sua IDE preferida
    2. Baixe o arquivo com o dump do banco de dados e rode no seu mysql
    3. Obtenha as credenciais e detalhes de conexão do seu SGBD 
    4. Utilize as informações obtidas no passo 3 para configurar o arquivo application.properties

Exemplo do arquivo application.properties:
    
    #Configurações do Banco de Dados
    #spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:[porta]/[nome_do_squema]
    spring.datasource.username=[nome_do_usuario]
    spring.datasource.password=[senha_do_usuario]
    
Dicas:
1 - O dump do banco de dados já contém registros nas tabelas. Estes registros foram criados durante o desenvolvimento e testes
2 - Recomendo a utilizalção do postman para testar, a fim de ter acesso facilirado so retornos

    

