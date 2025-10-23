package br.com.peludinhos.core.repository;
import br.com.peludinhos.core.model.Servico; import java.util.*;
public interface ServicoRepository { Servico salvar(Servico s); Optional<Servico> buscarPorId(Long id); List<Servico> listar(); }