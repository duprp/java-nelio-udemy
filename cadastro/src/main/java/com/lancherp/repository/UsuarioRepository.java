package com.lancherp.repository;

import com.lancherp.entities.Usuario;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class UsuarioRepository {
   private List<Usuario> usuarios = new ArrayList<>();
   Scanner sc =new Scanner(System.in);

   public void cadastrar(Usuario usuario){
       this.usuarios.add(usuario);
   }

   public List<Usuario> listarTodos(){
       if (usuarios.isEmpty()) {
           System.out.println("\nNenhum usuário cadastrado.");
       } else {
           System.out.println("\n========== LISTA DE USUÁRIOS ==========");
           for (Usuario u : usuarios) {
               System.out.println(u);
           }
       }return null;
   }

   public Usuario buscarCpf (String cpf){
       for(Usuario u : usuarios){
           if(u.getCpf().equals(cpf)){
               return u;
           }
       }
       return null;
   }

   public Usuario editarUsuario (String cpf){
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


       for(Usuario u: usuarios){
           if (u.getCpf().equals(cpf)){
               System.out.println("Usuario encontrado: " + u.getNome());

               System.out.println("Novo nome: ");
               String novoNome = sc.nextLine();

               System.out.println("Novo sobrenome: ");
               String novoSobrenome = sc.nextLine();

               System.out.println("Nova Data de nascimento: ");
               LocalDate novaData = LocalDate.parse(sc.nextLine(),fmt);
               u.setNome(novoNome);
               u.setSobrenome(novoSobrenome);
               u.setDatanasc(novaData);

               System.out.println("Usuario atualizado com sucesso:\n" +
                       "Novo nome:" + u.getNome() + "\n" +
                       "Novo sobrenome: " +u.getSobrenome()+"\n"+
                       "Nova data de nascimento: " + u.getDatanasc());

           }
       }
       return null;
   }


    public Usuario ExcluirUsuario (String cpf){
        for(Usuario u : usuarios){
            if(u.getCpf().equals(cpf)){
                int n = 0;
                System.out.println(u);
                System.out.println("digite 1 para confirmar: ");
                n = sc.nextInt();
                if (n == 1){
                    usuarios.remove(u);
                    System.out.print("Usuario excluido. \n");
                    return u;

                }
            }
        }
        return null;
    }



}
