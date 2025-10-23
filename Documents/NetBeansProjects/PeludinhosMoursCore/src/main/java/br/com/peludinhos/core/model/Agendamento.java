package br.com.peludinhos.core.model;
import java.time.LocalDateTime;
public class Agendamento { public enum Status{MARCADO,EM_ANDAMENTO,CONCLUIDO,CANCELADO}
private Long id; private Long clienteId; private Long petId; private Long servicoId; private LocalDateTime inicio; private LocalDateTime fim; private Status status;
public Long getId(){return id;} public void setId(Long id){this.id=id;}
public Long getClienteId(){return clienteId;} public void setClienteId(Long v){this.clienteId=v;}
public Long getPetId(){return petId;} public void setPetId(Long v){this.petId=v;}
public Long getServicoId(){return servicoId;} public void setServicoId(Long v){this.servicoId=v;}
public LocalDateTime getInicio(){return inicio;} public void setInicio(LocalDateTime v){this.inicio=v;}
public LocalDateTime getFim(){return fim;} public void setFim(LocalDateTime v){this.fim=v;}
public Status getStatus(){return status;} public void setStatus(Status v){this.status=v;} }