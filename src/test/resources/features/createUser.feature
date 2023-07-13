
            Feature:  Comprar Produtos
             Como um cliente cadastrado no automationexercise
             Eu quero fazer a compra de ao menos três produtos
             Para que eu possa estar bem vestida

              Background:  Dado que o  "usuário" não possua uma conta cadastrada no  automationexercise
              Scenario: Realizar Cadastro
                Given que eu esteja na página de login
                When preencho as informações necessárias para cadastrar um novo usuário em "Cadastro de novo usuário!"
                Then deve ser possível  realizar o cadastro do usuário na plataforma com sucesso