# Projeto Fullstack de Cadastro e Login Banco Alpha

Bem-vindo ao meu projeto fullstack de cadastro e login! Este projeto é composto por um frontend desenvolvido em HTML5, Bootstrap, Axios e JavaScript, e um backend construído com Java, Spring (Spring Web, Spring Security), usando H2 Database para armazenamento.

## Frontend

### Rodando o Frontend Localmente

Para executar o frontend localmente, siga estas etapas:

1. Clone o repositório:

bash
Copy code
git clone https://carloshenriquepere.github.io/Banco-Alpha-Front-End.oi
Abra o diretório do frontend no seu editor de código favorito (por exemplo, VS Code).

Execute o aplicativo em um servidor local ou abra o arquivo index.html no seu navegador.

## Backend

### Rodando o Backend Localmente

O backend está dividido em um repositório separado. Clone o repositório e siga as instruções abaixo:

Clone o repositório do backend:

bash
Copy code
git clone https://github.com/Carloshenriquepere/Banco-Alpha-Back-End
Abra o projeto no IntelliJ ou no seu IDE preferido.

Certifique-se de ter o Maven instalado e execute o comando:

bash
Copy code
mvn spring-boot:run
O backend estará rodando localmente em http://localhost:8080.

Configuração das Credenciais de E-mail
Para receber confirmações de e-mail após o cadastro, é necessário configurar as credenciais de e-mail no backend. Abra o arquivo application.properties e adicione as seguintes informações:

properties
Copy code
# Configurações de E-mail
spring.mail.host=SEU_SERVIDOR_DE_EMAIL
spring.mail.port=SUA_PORTA
spring.mail.username=SEU_EMAIL
spring.mail.password=SUA_SENHA
Certifique-se de substituir SEU_SERVIDOR_DE_EMAIL, SUA_PORTA, SEU_EMAIL e SUA_SENHA com suas próprias configurações de e-mail.

Contato
Se tiver dúvidas ou sugestões, sinta-se à vontade para entrar em contato comigo. Agradeço por explorar este projeto!

vbnet
Copy code

Lembre-se de substituir `https://carloshenriquepere.github.io/Banco-Alpha-Front-End.oi` e `https://github.com/Carloshenriquepere/Banco-Alpha-Back-End` pelas URLs reais dos seus repositórios. Isso deve fornecer uma orientação clara sobre como executar o projeto e configurar as credenciais de e-mail necessárias.
