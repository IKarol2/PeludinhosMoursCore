package br.com.peludinhos.core.repository;
import br.com.peludinhos.core.model.Pet; import java.util.*;
public interface PetRepository { Pet salvar(Pet p); Optional<Pet> buscarPorId(Long id); List<Pet> listar(); }