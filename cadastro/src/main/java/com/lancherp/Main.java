package com.lancherp;
import com.lancherp.entities.Usuario;
import com.lancherp.repository.UsuarioRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        UsuarioRepository repositorio = new UsuarioRepository();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int n = 1;


        while (n == 1) {
            System.out.println("""
                    1. Cadastrar um Usuario
                    2. Editar um Usuario
                    3. Ler dados de um Usuario
                    4. Excluir um Usuario""");

            int opc = sc.nextInt();
            sc.nextLine();


            if (opc == 1){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Sobrenome: ");
                String sobrenome = sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                System.out.print("Data de nascimento: ");
                LocalDate nasc = LocalDate.parse(sc.nextLine(),fmt);
                Usuario cadastro = new Usuario(nome,sobrenome,cpf,nasc);

                repositorio.cadastrar(cadastro);

                System.out.println("Usuario cadastrado com sucesso!");
                System.out.println();

            }

            if (opc == 2){
                System.out.println("Digite o Cpf do usuario que deseja alterar");
                String cpf = sc.nextLine();
                Usuario usuarioEncontrado = repositorio.editarUsuario(cpf);

                if (usuarioEncontrado != null) {
                    System.out.println("Usuario encontrado: " + usuarioEncontrado);


                }




            }



            if (opc == 3){
                System.out.println("""
                        1.Ler dados de um Usuario
                        2.Ler dados de todos os usuarios
                        """);
                int u = sc.nextInt();
                sc.nextLine();
                if (u == 1) {
                    System.out.println("Digite o Cpf do Usuario: ");
                    String cpf = sc.nextLine();

                    System.out.println(repositorio.buscarCpf(cpf));

                }else if (u == 2){
                    repositorio.listarTodos();
                }

            }

            if (opc == 4){
                System.out.println("Digite o cpf do Usuario que deseja excluir: ");
                String cpf = sc.nextLine();
                repositorio.ExcluirUsuario(cpf);

            }

        }


        sc.close();
    }
}