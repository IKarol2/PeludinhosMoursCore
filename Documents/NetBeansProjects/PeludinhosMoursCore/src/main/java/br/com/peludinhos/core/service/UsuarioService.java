package br.com.peludinhos.core.service;
import br.com.peludinhos.core.model.Usuario; import br.com.peludinhos.core.repository.UsuarioRepository; import java.util.List;
public class UsuarioService {
 private final UsuarioRepository repo; public UsuarioService(UsuarioRepository r){this.repo=r;}
 public Usuario cadastrar(String nome,String login,String senha,String tipo){
  repo.buscarPorLogin(login).ifPresent(u->{ throw new IllegalArgumentException("Login já existe."); });
  Usuario u = new Usuario(nome,login,senha,tipo); return repo.salvar(u); }
 public List<Usuario> listar(){ return repo.listar(); } }