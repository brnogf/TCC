Historia de fazer login no sistema

Narrative:
In order to executar as acoes necessarias para minha atividade
As a usuário do sistema
I want to fazer login no sistema para ter acesso as funcionalidades disponiveis

Scenario:  Usuário faz login com sucesso
Given que o usuario acessa a tela de login
When usuario informa credenciais validas ('user','pass') e clica em entrar
Then o sistema oferece aviso 'sucesso' para o usuario

Scenario:  Usuário tenta fazer login, mas ocorre erro
Given que o usuario acessa a tela de login
When usuario informa credenciais validas ('nouser','nopass') e clica em entrar
Then o sistema oferece aviso 'erro' para o usuario