package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marina Savitzki
 */
public class Agendamento {
    
    private String compromisso;
    private Date data;
    private String observacao;
    private Date dataSistema;

    public Agendamento(String compromisso, String data, Date dataSistema) {
        this.compromisso = compromisso;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dataSistema = dataSistema;
    }

    public Agendamento(String compromisso, String data, Date dataSistema, String observacao) {
        this(compromisso, data, dataSistema);
        this.observacao = observacao;
    }
    
    public String getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(String compromisso) {
        this.compromisso = compromisso;
    }
    

    public Date getData() {
        return data;
    }

    public String getDataSistema() {
        return new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(dataSistema);
    }

    public void setDataSistema(Date dataSistema) {
        this.dataSistema = dataSistema;
    }
    
//    data formatada
    public String getDataFormated(){
        return new SimpleDateFormat("dd/MM/yyy").format(data);
    }
    
//    hora formatada
    public String getHoraFormated(){
        return new SimpleDateFormat("HH:mm").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
}
