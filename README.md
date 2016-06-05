# SGA-PCS-SGBD

Na classe ConnectionFactory a conexão não está sendo efetivada. Averiguar o motivo.
Verificar se a autenticação é feita corretamente.

No momento temos dois servlets funcionais que se dispõem a mapear página inicial e login

Dentre as páginas jsp existentes, login e sucesso são as utilizadas por agora

Para os dois casos de uso a serem implementados + login, as queries são basicamente as mapeadas nos DAO's.

Dependências até o momento:

SERVLET:
javax.servlet-api-3.1.0.jar

POSTGRES:
postgressql-9.1-903.jdbc4.jar

JSTL:
taglibs-standard-impl-1.2.5.jar
taglibs-standard-spec-1.2.5.jar  

Sugestão de continuidade:

1) Verificar problema de conexão com o banco na ConnectionFactory. Como exemplo, a classe JDBCConnection funciona e faz as queries de exemplo nela.

2) Modelar as páginas de Entrada/Saída
Ponto importante: 
Na saída de materiais, caso seja apenas text-input a validação ficará toda no server side.
- Três inputs de texto (material, almoxarifado e quantidade)
- Quando submetido o form, validação é feita no servidor. 
- Se disponível, feedback +,  se não, -.
Processo semelhante para entrada.

3) Gerar queries para popular o banco. 
Sugestão: 
- 5 materiais;
- 3 fornecedores;
- 2 almoxaridos;
- 1 setor por almoxarifado;
- 1 operador do sistema;
- 3 endereços;
Algumas destas queries já foram criadas e estão disponíveis em (?)WebContent/WEB-INF/data/populateStatemets.sql (Não, o local apropriado não é este, mas o Eclipse não me obedece. Se alguém puder fazer a mágica de mover para um pacote de nome data seria melhor).
Por razões de muito prováveis incompatibilidades, o script de criação do banco está no mesmo local citado acima mas no arquivo createStatement.sql 
Atenção para os dados padrão do banco(isso é importante para evitarmos constante alteração no arquivo):
Nome do banco: SGAData
Usuário: postgres
Senha: admin



