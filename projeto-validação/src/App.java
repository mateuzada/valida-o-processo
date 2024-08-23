public class App {
    public static void main(String[] args) throws Exception {   
    }
    static void selecaoCandidatos(){
         String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
         int candidatosSelecionados = 0;
         int candidatosAtual = 0;
         double salarioBase = 2000.0;
         while(candidatosSelecionados < 5) {
          String candidato = candidatos[candidatosAtual];
          double salarioPretendido = 
         }

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
        System.out.println("Ligar para o candidato");
        } else if (salarioBase==salarioPretendido)
        System.out.println("Ligar para o candidato com contra proposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}
