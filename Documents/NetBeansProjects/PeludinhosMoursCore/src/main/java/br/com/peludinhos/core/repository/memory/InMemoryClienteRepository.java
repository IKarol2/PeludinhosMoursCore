package br.com.peludinhos.core.repository.memory;
import br.com.peludinhos.core.model.Cliente; import br.com.peludinhos.core.repository.ClienteRepository;
import java.util.*; import java.util.concurrent.atomic.AtomicLong;
public class InMemoryClienteRepository implements ClienteRepository {
 private final Map<Long, Cliente> db = new HashMap<>(); private final AtomicLong seq = new AtomicLong(1);
 public Cliente salvar(Cliente c){ if(c.getId()==null) c.setId(seq.getAndIncrement()); db.put(c.getId(), c); return c; }
 public Optional<Cliente> buscarPorId(Long id){ return Optional.ofNullable(db.get(id)); }
 public List<Cliente> listar(){ return new ArrayList<>(db.values()); }
 public void remover(Long id){ db.remove(id); } }