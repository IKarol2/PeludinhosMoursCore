package br.com.peludinhos.core.repository.memory;
import br.com.peludinhos.core.model.Servico; import br.com.peludinhos.core.repository.ServicoRepository;
import java.util.*; import java.util.concurrent.atomic.AtomicLong;
public class InMemoryServicoRepository implements ServicoRepository {
 private final Map<Long, Servico> db = new HashMap<>(); private final AtomicLong seq = new AtomicLong(1);
 public Servico salvar(Servico s){ if(s.getId()==null) s.setId(seq.getAndIncrement()); db.put(s.getId(), s); return s; }
 public Optional<Servico> buscarPorId(Long id){ return Optional.ofNullable(db.get(id)); }
 public List<Servico> listar(){ return new ArrayList<>(db.values()); } }