package Model.DAO;

import java.util.ArrayList;
import java.util.Date;
import Model.Agendamento;
import Model.Usuario;

/**
 *
 * @author Jessica Costa
 */
public class Banco {
    
   
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "Jessica", "123");
        Usuario usuario2 = new Usuario(2, "Mateus", "321");
        
        Agendamento agendamento1 = new Agendamento(1, "Aniversario de mainha", "14/07/2018 09:30", new Date());
        Agendamento agendamento2 = new Agendamento(1, "Aniversario de painho", "14/07/2018 10:00", new Date());
        Agendamento agendamento3 = new Agendamento(2, "Levar cachorro para passear", "14/07/2018 10:30", new Date());
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
