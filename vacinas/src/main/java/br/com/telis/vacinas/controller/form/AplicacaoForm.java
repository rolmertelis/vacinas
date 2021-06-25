package br.com.telis.vacinas.controller.form;
import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.model.Vacina;
import br.com.telis.vacinas.service.UsuarioService;
import br.com.telis.vacinas.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.netty.NettyWebServer;


public class AplicacaoForm {
    private Integer id;
    private Integer usuario;
    private String dataaplicacao;
    private String obs;
    private Integer vacina;




    public AplicacaoForm() {
    }

    public AplicacaoForm(Integer id, Integer usuario, String dataaplicacao, String obs, Integer vacina) {
        this.id = id;
        this.usuario = usuario;
        this.dataaplicacao = dataaplicacao;
        this.obs = obs;
        this.vacina = vacina;
    }

    public Aplicacao criarAplicacaoModel(AplicacaoForm aplicacaoForm, Usuario usuario, Vacina vacina){

        Aplicacao aplicacao = new Aplicacao();
            //inserir o usuário
            aplicacao.setUsuario(usuario);
            aplicacao.setDataaplicacao(aplicacaoForm.getDataaplicacao());
            aplicacao.setObs(aplicacaoForm.getObs());
            //Inserir a vacina
            aplicacao.setVacina(vacina);
            return aplicacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public String getDataaplicacao() {
        return dataaplicacao;
    }

    public void setDataaplicacao(String dataaplicacao) {
        this.dataaplicacao = dataaplicacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getVacina() {
        return vacina;
    }

    public void setVacina(Integer vacina) {
        this.vacina = vacina;
    }
}
