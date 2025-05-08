import java.util.Date;

public class UsuarioSistema extends PessoaFisica {
    private String login;
    private String senha;

    public UsuarioSistema(String nome, Endereco endereco, String telefone, String email, String cpf, Date dataNascimento,
                          String login, String senha) {
        super(nome, endereco, telefone, email, cpf, dataNascimento);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
