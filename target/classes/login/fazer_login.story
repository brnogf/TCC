História de fazer login no sistema

Narrative:
In order to executar as ações necessárias para minha atividade
As a usuário do sistema
I want to fazer login no sistema para ter acesso às funcionalidades dispon�veis

Scenario:  Usuário faz login com sucesso
Given que o usuário acessa a tela de login
When usuário informa credenciais válidas ('user','pass') e clica em entrar
Then o sistema oferece aviso 'sucesso' para o usuário

Scenario:  Usuário tenta fazer login, mas ocorre erro
Given que o usuário acessa a tela de login
When usuário informa credenciais válidas ('nouser','nopass') e clica em entrar
Then o sistema oferece aviso 'erro' para o usuário