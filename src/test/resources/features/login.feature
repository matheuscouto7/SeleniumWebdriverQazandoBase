# language: pt

  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra no site

    /*quando se repete varias vezes a mesma coisa consigo criar um contexo para não ficar mais repetindo ele toda vez*/

    Contexto: Acessar tela de login
      Dado que estou na tela de login

    @login-sucesso
    Cenário: Login com sucesso
#      Quando preencho login "eduardo.finotti@qazando.com" e senha "123456"
      E clico em Login
      Então vejo mensagem de login com sucesso


      @login-invalido
      Esquema do Cenario: Validar <name>
        Quando preencho login "<user>" e senha "<password>"
        E clico em Login
        Então vejo mensagem "<message>" de campo não preenchido

        Exemplos:
        | user                | password     | message            | name            |
        | qualquercoisa       | 123456       | E-mail inválido.   | E-mail inválido |
        |                     | 123456       | E-mail inválido.   | E-mail Vazio    |
        | eduardo@qazando.com | 000          | Senha inválida.    | Senha invalida  |
        | eduardo@qazando.com |              | Senha inválida.    | Senha vazia     |
