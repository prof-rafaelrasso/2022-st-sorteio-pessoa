# Instruções

## Instale

- JDK 11 ou superior
- Maven

## Compilando o Projeto pela linha de comando.

A primeira opção para compilar o projeto é pelo terminal. Para isso abra o terminal 
do IntelliJ (Alt + F12 ou Menu View -> Tool Windows -> Terminal) e execute o comando abaixo:

    mvn clean install

## Compilando o Projeto com o Maven embutido no Intellij.

Todo Intellij possui um maven embutido nele, você acessa ele pelo menu na lateral direita com o nome e simbolo do maven.

Ao clicar neste menu você verá o projeto e mais tres sub-pacotes, neste sub-pacotes expanda o sub-pacote de
nome "Lifecyle", nele existirá diversas opções de comando maven, mas as que importam para gente no momento são
as opções "clean" e "install". Para executa-las selecione-a e clique no botão de play verde logo acima dela que esta dentro 
do menu maven. Náo é o botão de play verde ao lado do inseto, é o botão de play verde ao lado da letra M de maven.

=> sis-sorteiro-pessoa
    => Lifecycle
        => clean: Deleta a pasta target limpando tudo que foi gerado antes. 
        => install: Executa a compilação e gera o executável do sistema. ("E otras cocitas mas")
    => Plugins
    => Dependencies


