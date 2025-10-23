package br.com.peludinhos.core.repository;
import br.com.peludinhos.core.model.Usuario; import java.util.*;
public interface UsuarioRepository { Usuario salvar(Usuario u); Optional<Usuario> buscarPorLogin(String login); List<Usuario> listar(); }