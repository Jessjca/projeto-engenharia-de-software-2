# Documento de Desenvolvimento de Software - Sistema de Agenda para Marcações de Compromissos

## Sprint 1 - Definição do Modelo de Processo e Especificação de Requisitos

### Modelo de Processo
O desenvolvimento seguirá o modelo incremental com três sprints principais:

1. **Planejamento e definição dos requisitos**
2. **Projeto arquitetural e detalhamento dos requisitos**
3. **Implementação e testes automatizados**

#### Atividades e Responsáveis
- **Levantamento de requisitos** - Equipe de análise (Jessica e Matheus)
- **Modelagem do sistema** - Arquitetos de software (Jessica e Matheus)
- **Desenvolvimento** - Equipe de programadores (Jessica e Matheus)
- **Testes e validação** - Equipe de QA (Jessica e Matheus)

#### Cronograma
| Sprint  | Atividade | Duração |
|---------|----------|---------|
| Sprint 1 | Definição do modelo de processo e especificação de requisitos | 1 semana |
| Sprint 2 | Detalhamento de requisitos e projeto arquitetural | 1 semana |
| Sprint 3 | Implementação parcial e testes automatizados | 1 semana |

### Documento de Especificação de Requisitos

#### Requisitos Funcionais
1. O sistema deve permitir que usuários cadastrem compromissos com data, hora e descrição.
2. O sistema deve permitir que os usuários editem e excluam compromissos.
3. O sistema deve exibir uma lista de compromissos agendados.
4. O sistema deve permitir o cadastro de usuários com login e senha.
5. O sistema deve permitir diferentes níveis de acesso (usuário comum e administrador).

#### Requisitos Não-Funcionais
1. O sistema deve garantir a segurança dos dados armazenados.
2. O tempo de resposta para a exibição da lista de compromissos deve ser inferior a 2 segundos.

---

## Sprint 2 - Detalhamento dos Requisitos e Projeto Arquitetural

### Histórias de Usuário
- **Usuário comum:** Como usuário, quero adicionar novos compromissos para organizar minha agenda.
- **Usuário comum:** Como usuário, quero editar e excluir compromissos para manter minha agenda atualizada.
- **Administrador:** Como administrador, quero gerenciar os usuários para manter a segurança do sistema.
- **Usuário comum:** Como usuário, quero receber notificações para me lembrar de compromissos importantes.

### Cenários de Teste
**Cenário 1 - Cadastro de Compromisso**
- Dado que um usuário está autenticado
- Quando ele preenche os dados do compromisso e confirma
- Então o compromisso é salvo e exibido na agenda

**Cenário 2 - Notificação de Compromisso**
- Dado que um compromisso está agendado para dentro de 30 minutos
- Quando o sistema detecta a proximidade do compromisso
- Então uma notificação é enviada ao usuário

### Projeto Arquitetural
#### Diagrama de Classes (UML)
- **Classes principais:** Pessoa, Usuário, Agendamento

#### Diagrama de Componentes
- **Frontend:** Interface Java
- **Backend:** Java
- **Banco de Dados:** PostgreSQL

#### Diagrama de Sequência
- **Fluxo de cadastro de compromisso**
    - Usuário -> Interface Web -> Backend -> Banco de Dados -> Confirmação para o usuário

---

## Sprint 3 - Implementação Parcial e Testes Automatizados

### Implementação em Java
- **Tecnologias:** Java, PostgreSQL
- **Funcionalidades implementadas nesta fase:**
    - Cadastro de usuários
    - Cadastro de compromissos
    - Edição e exclusão de compromissos

### Testes Automatizados
- **JUnit para testes unitários:**
    - Teste de criação de compromissos
    - Teste de edição e exclusão de compromissos
    - Teste de envio de notificações

