public class aluno{
    int matricula;
    String nome ;
    String rua;
    int numero ;
    String complemento;
    String cep;
    String cpf;
    String identidade;
    boolean status;
    //metodo
    void Aluno(){
       System.out.println("Alunos:" + this.nome);
        System.out.println("Cpf:"+this.cpf);
       System.out.println("Rua:"+this.rua);
        System.out.println("N°"+this.numero);
        System.out.println("Complemento:" + this.complemento);
        System.out.println("Cep:"+ this.cep);
        
        
    }
    void Matricula(){
        System.out.println("A matricula desse alunos é :"+this.matricula);
        
    }
    void  cancelar(){
        if(status == true){
            System.out.println("O alunos esta cadastrado");
        } else{
            System.out.println("O aluno não esta cadastrado");
        }
    }
}
    
    class Dcoder
 {  
     public static void main(String args[])
  {  
      aluno a1 = new aluno();
       Scanner escrever = new Scanner(System.in);
         System.out.println("Inserir nome:");
         a1.nome = escrever.nextLine();
         
         
         System.out.println("Informe o cpf:");
         a1.cpf = escrever.nextLine();
         
         
         
         System.out.println("Informe o rua:");
         a1.rua = escrever.nextLine();
         
         System.out.println("Informe o número:");
         a1.numero = escrever.nextInt();
         
         
         System.out.println("Informe o cep:");
         a1.cep = escrever.nextLine();
         
          // status do cadastro
         a1.status = true;
         
         // imprime os dados do aluno
         a1.Aluno();
         a1.cancelar();
         
         
//----------------------------------------------------------------------------------------------------- 
         
     System.out.println("--------------------------------");
         System.out.println("Segundo aluno");
//----------------------------------------------------------------------------------------------------- 
         
         aluno a2 = new aluno();
         System.out.println("Informe o nome:");
         a2.nome = escrever.nextLine();
         
         System.out.println("Informe o cpf:");
         a1.cpf = escrever.nextLine();
         
         
         
         System.out.println("Informe o rua:");
         a1.rua = escrever.nextLine();
         
         System.out.println("Informe o número:");
         a1.numero = escrever.nextInt();
         
         
         System.out.println("Informe o cep:");
         a1.cep = escrever.nextLine();
         
         System.out.println("Mostrando dados \n");
         
         a2.status = true;
         a2.Aluno();
         a2.cancelar();
         
         
     }
    }
