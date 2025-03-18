package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import View.Login;
import Model.Usuario;
import View.MenuPrincipal;

/**
 *
 * @author Mateus Andrade
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
        
    }
    
    public void entrarNoSistema(){
        Usuario usuario = helper.obterModelo();
        
        // Pesquisa Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuario ou senha invalidos!");
        }

        
    }
    
    public void fizTarefa(){
        this.view.exibeMensagem("Executei o Fiz Tarefa");
    }
    
    
}
