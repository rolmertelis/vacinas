## vacinas
### Desafio Orange Talents, para ingresso na Zup

#### Procedimentos para rodar a aplicação
    1. Baixe o projeto e abra-o na sua IDE preferida
    2. Baixe o arquivo com o dump do banco de dados e rode no seu mysql
    3. Obtenha as credenciais e detalhes de conexão do seu SGBD (user name, password, etc)
    4. Utilize as informações obtidas no passo 3 para configurar o arquivo application.properties

#### Exemplo do arquivo application.properties:
###### Utilize o modelo abaixo, para definir o seu arquivo de propriedades, para a conexão com o sgbd <<< NÃO COLE E COPIE SEMPLESMENTE >>>
    #Configurações do Banco de Dados
    #spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:[porta]/[nome_do_squema]
    spring.datasource.username=[nome_do_usuario]
    spring.datasource.password=[senha_do_usuario]
    
#### Dicas
    1. O dump do banco de dados já contém a instrução para criação do schemna (banco de dadods).
    2. por causa do que consta to item anteriror, não crie um banco de daods. apenas rode o dump e dexe por conta dele
    3. O dump do banco de dados já contém registros nas tabelas. Estes registros foram criados durante o desenvolvimento e testes
    4. Recomendo a utilizalção do postman para testar, a fim de ter acesso facilirado so retornos

#### Da Responsabilidade pelos dados de exemplo
    1. Os registros de bancos de dados não têm qualquer relação com entidades do mundo real.
    2. Semelhanças ente fatos, pessoas ou eventos da vida real, são mera coincidência
    3. Não há implícita, explícita, intencional ou não intencional, intenção de referenciar negativamente pessoas ou grupos de pessoas

    

