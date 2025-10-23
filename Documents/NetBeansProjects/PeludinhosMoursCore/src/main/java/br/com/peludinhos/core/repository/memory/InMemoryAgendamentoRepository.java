package br.com.peludinhos.core.repository.memory;
import br.com.peludinhos.core.model.Agendamento; import br.com.peludinhos.core.repository.AgendamentoRepository;
import java.time.LocalDate; import java.util.*; import java.util.concurrent.atomic.AtomicLong; import java.util.stream.Collectors;
public class InMemoryAgendamentoRepository implements AgendamentoRepository {
 private final Map<Long, Agendamento> db = new HashMap<>(); private final AtomicLong seq = new AtomicLong(1);
 public Agendamento salvar(Agendamento a){ if(a.getId()==null) a.setId(seq.getAndIncrement()); db.put(a.getId(), a); return a; }
 public List<Agendamento> listarPorPet(Long petId, LocalDate dia){
  return db.values().stream().filter(x->Objects.equals(x.getPetId(),petId)).filter(x->x.getInicio()!=null && x.getInicio().toLocalDate().equals(dia)).collect(Collectors.toList()); }
 public List<Agendamento> listarTodos(){ return new ArrayList<>(db.values()); } }