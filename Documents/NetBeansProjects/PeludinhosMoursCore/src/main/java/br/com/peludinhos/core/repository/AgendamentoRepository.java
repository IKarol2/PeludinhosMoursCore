package br.com.peludinhos.core.repository;
import br.com.peludinhos.core.model.Agendamento; import java.time.LocalDate; import java.util.*;
public interface AgendamentoRepository { Agendamento salvar(Agendamento a); List<Agendamento> listarPorPet(Long petId, LocalDate dia); List<Agendamento> listarTodos(); }