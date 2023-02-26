package tarefamod13;

public class Programa {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Erlan");
        pessoaFisica.setCpf("018476273");
        System.out.println(" Nome " + pessoaFisica.getNome() + " CPF " + pessoaFisica.getCpf());
        System.out.println("");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Verlio");
        pessoaJuridica.setCnpj("0923764000023");
        System.out.println(" Nome " + pessoaJuridica.getNome() + " Cnpj " + pessoaJuridica.getCnpj());

    }
}
