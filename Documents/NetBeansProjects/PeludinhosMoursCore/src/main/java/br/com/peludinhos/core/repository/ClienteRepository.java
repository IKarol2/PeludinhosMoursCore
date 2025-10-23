package br.com.peludinhos.core.repository;
import br.com.peludinhos.core.model.Cliente; import java.util.*;
public interface ClienteRepository { Cliente salvar(Cliente c); Optional<Cliente> buscarPorId(Long id); List<Cliente> listar(); void remover(Long id); }