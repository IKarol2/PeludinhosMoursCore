package br.com.peludinhos.core.repository.memory;
import br.com.peludinhos.core.model.Pet; import br.com.peludinhos.core.repository.PetRepository;
import java.util.*; import java.util.concurrent.atomic.AtomicLong;
public class InMemoryPetRepository implements PetRepository {
 private final Map<Long, Pet> db = new HashMap<>(); private final AtomicLong seq = new AtomicLong(1);
 public Pet salvar(Pet p){ if(p.getId()==null) p.setId(seq.getAndIncrement()); db.put(p.getId(), p); return p; }
 public Optional<Pet> buscarPorId(Long id){ return Optional.ofNullable(db.get(id)); }
 public List<Pet> listar(){ return new ArrayList<>(db.values()); } }