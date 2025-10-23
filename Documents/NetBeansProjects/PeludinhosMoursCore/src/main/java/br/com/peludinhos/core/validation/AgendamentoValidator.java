package br.com.peludinhos.core.validation;
import br.com.peludinhos.core.model.Agendamento;
public class AgendamentoValidator {
 public void validar(Agendamento a){
  if(a.getInicio()==null || a.getFim()==null) throw new IllegalArgumentException("Início e fim são obrigatórios.");
  if(!a.getFim().isAfter(a.getInicio())) throw new IllegalArgumentException("Fim deve ser após o início.");
  if(a.getPetId()==null || a.getClienteId()==null || a.getServicoId()==null) throw new IllegalArgumentException("Cliente, Pet e Serviço são obrigatórios."); } }