public class Cliente {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setNumero(392);
        conta.setNome("Leonardo");
        conta.setLimite(82500);
        conta.setSaldo(23456);
        System.out.println(conta.getNumero());

    }

}