


            Feature:  Comprar Produtos
              Como um cliente cadastrado no ecommerce automationexercise
              Eu quero fazer a compra de ao menos três produtos
              Para que eu possa estar bem vestida

              Background:  Dado que o "usuário" possua cadastro no ecommerce automationexercise

              Scenario: Realizar a compra de três produtos no ecommerce automationexercise

                Given que eu esteja na página de produtos
                When adiciono três produtos ao carrinho sendo um deles com duas unidades
                But  removo uma quantidade desse produto que contém duas
                Then deve ser possível realizar a compra de três produtos com  sucesso.

