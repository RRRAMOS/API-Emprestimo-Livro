//classe criada para instanciar usuario
package com.djg.emprestalivro;

import com.djg.emprestalivro.dominio.Emprestimo;
import com.djg.emprestalivro.dominio.Livro;
import com.djg.emprestalivro.dominio.Usuario;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteUsuario {

        // obs: para criar metodo main, via IntelliJ IDEA, é uma opção usar o atalho  psvm+enter

    public static void main(String[] args) {

        //----------------------------------------------criação de usuario - exemplo instanciamento usuario
        Usuario zezinho = new Usuario("zezinho","10/01/1994", "Rua ArcoÍris do meu coração");
        zezinho.setEndereco("Rua");
        System.out.println("Nome do Zezinho get" + zezinho.getNomeCompleto());

        //criação padrão
        //Usuario user = new Usuario("","");

        zezinho.imprimirDadosUsuario();
        //ou usuario.imprimir.DadosUsuario();

        Livro orientacaoObjeto =new Livro (123, "orientacao a Objeto" , "Nara");

        Emprestimo a = new Emprestimo (zezinho, orientacaoObjeto,"23/04/2021","24/04/2021" );

        a.imprimeDadosEmprestimo();


        Scanner scanner = new Scanner(System.in);
        // ---------------------------------------------- testando a criação do usuário

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua data de nascimento : ");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite seu endereço ");
        String endereco = scanner.nextLine();

        //criação variavel usuario do tipo usuario (com xxxxx valores)
        Usuario usuario = new Usuario(nome, dataNascimento, endereco);

        //exibir-chamar método ja criado
        usuario.imprimirDadosUsuario();

        // ---------------------------------------------- testando a criação do livro
        System.out.println("Digite o código do livro ");
        int codigo = scanner.nextInt();

        System.out.println("Digite nome do livro: ");
        String livro = scanner.nextLine();

        System.out.println("Digite o autor do livro : ");
        String autor = scanner.nextLine();

        //exibir-chamar métodos ja criado
        Livro livro1 = new Livro(codigo, nome, autor);

        livro1.imprimirDadosLivro();

        // ----------------------------------------------  Testando o empréstimo sem a regra de negócio implementada
        System.out.println("em que data o livro foi retirado para empréstimo?:  ");
        String dataEmprestimo = scanner.nextLine();

        System.out.println("Em qual data o livro foi devolvido? : ");
        String dataDevolucao = scanner.nextLine();

        //instanciar
        Emprestimo emprestimo = new Emprestimo(usuario,livro1, dataEmprestimo, dataDevolucao);

        //exibir-chamar métodos ja criado
        emprestimo.imprimeDadosEmprestimo();


        // ----------------------------------------------  Testando o empréstimo com a regra de negócio implementada
        //----------------------------------------------regra: data da devolução precisa ser maior do que a data do emprestimo

        System.out.println("em que data o livro foi retirado para empréstimo?:  ");
        String dataEmprestimoEfetivo = scanner.nextLine();

        System.out.println("Em qual data o livro foi devolvido? : ");
        String dataDevolucaoEfetivo = scanner.nextLine();

        LocalDate localDateEmprestimo = LocalDate.parse(dataEmprestimoEfetivo, DateTimeFormatter.ISO_DATE);
        LocalDate localDateDevolucao = LocalDate.parse(dataDevolucaoEfetivo, DateTimeFormatter.ISO_DATE);

        if (localDateDevolucao.isBefore(localDateEmprestimo)){
            System.out.println("Inválido!");
        }
        else {
            System.out.println("Válido!");

        }
    }
  }
