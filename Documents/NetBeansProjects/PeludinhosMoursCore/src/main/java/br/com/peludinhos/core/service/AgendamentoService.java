package br.com.peludinhos.core.service;
import br.com.peludinhos.core.model.Agendamento; import br.com.peludinhos.core.repository.AgendamentoRepository; import br.com.peludinhos.core.validation.AgendamentoValidator;
import java.time.LocalDateTime; import java.util.List;
public class AgendamentoService {
 private final AgendamentoRepository repo; private final AgendamentoValidator validator = new AgendamentoValidator();
 public AgendamentoService(AgendamentoRepository r){this.repo=r;}
 public Agendamento criar(Agendamento a){
  validator.validar(a);
  var existentes = repo.listarPorPet(a.getPetId(), a.getInicio().toLocalDate());
  boolean conflita = existentes.stream().anyMatch(e -> overlaps(a.getInicio(), a.getFim(), e.getInicio(), e.getFim()));
  if(conflita) throw new IllegalStateException("Já existe agendamento nesse horário para o pet.");
  a.setStatus(Agendamento.Status.MARCADO); return repo.salvar(a); }
 private boolean overlaps(LocalDateTime s1, LocalDateTime e1, LocalDateTime s2, LocalDateTime e2){ return s1.isBefore(e2) && s2.isBefore(e1); } }