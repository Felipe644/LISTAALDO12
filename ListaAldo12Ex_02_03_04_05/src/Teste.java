import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner escreva=new Scanner(System.in);
        System.out.println("B)");
        Cachorro c=new Cachorro();
        c.late();
        Gato g=new Gato();
        g.mia();
        System.out.println("--------------------------------------");
        System.out.println("C)");
        Rica r=new Rica();
        r.fazerCompra();
        Pobre p=new Pobre();
        p.trabalha();
        Miseravel m=new Miseravel();
        m.mediga();
        System.out.println("--------------------------------------");
        System.out.println("D)");
        IngressoNormal i=new IngressoNormal();
        Vip v=new Vip();
        System.out.println("Didite [1] para Ingresso Normal e [2] para Ingresso VIP");
        System.out.print("OPÇÂO: ");
        int opc=escreva.nextInt();
        CamaroteInferior ci=new CamaroteInferior();
        CamaroteSuperior cs=new CamaroteSuperior();
        switch (opc){
            case 1:
                System.out.println("INGRESSO NORMAL \nVALOR: R$50.00");
                i.setValorIngresso(50.00f);
                i.ValorIngressoNormal();
                break;
            case 2:
                System.out.println("Digite [1] para CAMAROTE SUPERIOR ou [2] par CAMAROTE INFERIOR");
                System.out.print("OPÇÂO: ");
                int opc2=escreva.nextInt();
                switch (opc2){
                    case 1:
                        System.out.println("CAMATOTE SIPERIOR");
                        cs.setValorIngresso(50.00f);
                        cs.setValorAdicional(40.00f);
                        cs.valorIngressoVip();
                        break;
                    case 2:
                        System.out.println("CAMAROTE INFERIOR");
                        ci.setValorIngresso(50.00f);
                        ci.setValorAdicional(20.00f);
                        ci.valorIngressoVip();
                        break;

                }
        }
        System.out.println("--------------------------------------");
        System.out.println("E)");
        Novo no=new Novo();
        Velho ve=new Velho();
        System.out.println("Digite [1] para Novo IMOVEL ou [2] para Imovel Velho");
        System.out.print("OPÇÃO: ");
        int op=escreva.nextInt();
        switch (op){
            case 1:
                System.out.println("IMOVEL NOVO");
                no.setPreco(1000.00f);
                no.setAdicional(500.00f);
                no.toString();
                break;
            case 2:
                System.out.println("IMOVEL VELHO");
                ve.setPreco(1000.00f);
                ve.setDesconto(500.00f);
                no.toString();

        }










    }
}
