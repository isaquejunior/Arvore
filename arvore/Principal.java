package arvore;

public class Principal {
    public static void main(String[] args) {
        Mae mae = new Mae("Maria",40);
        Pai pai = new Pai("Joao",50);
        Filho filho = new Filho ("Mateus",31);
        
        
        System.out.println("Nome :" + filho.getNome());
        System.out.println("Idade :" + filho.getIdade());
        System.out.println("Nome do Mãe :" + mae.getNome());
        System.out.println("Nome do Pai :" + pai.getNome());
               
    }
    
}