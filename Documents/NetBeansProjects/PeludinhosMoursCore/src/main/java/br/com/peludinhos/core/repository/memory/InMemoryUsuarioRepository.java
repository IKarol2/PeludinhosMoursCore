package br.com.peludinhos.core.repository.memory;
import br.com.peludinhos.core.model.Usuario; import br.com.peludinhos.core.repository.UsuarioRepository;
import java.util.*; import java.util.concurrent.atomic.AtomicLong;
public class InMemoryUsuarioRepository implements UsuarioRepository {
 private final List<Usuario> db = new ArrayList<>(); private final AtomicLong seq = new AtomicLong(1);
 public Usuario salvar(Usuario u){ if(u.getId()==null) u.setId(seq.getAndIncrement()); db.add(u); return u; }
 public Optional<Usuario> buscarPorLogin(String login){ return db.stream().filter(x->x.getLogin()!=null && x.getLogin().equalsIgnoreCase(login)).findFirst(); }
 public List<Usuario> listar(){ return new ArrayList<>(db); } }