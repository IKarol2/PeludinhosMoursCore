package br.com.peludinhos.core.app;
import br.com.peludinhos.core.model.*; import br.com.peludinhos.core.model.Pet.Porte;
import br.com.peludinhos.core.pricing.PrecoPorPorteStrategy;
import br.com.peludinhos.core.repository.memory.*; import br.com.peludinhos.core.service.*;
import java.math.BigDecimal; import java.time.LocalDateTime;
public class Main {
 public static void main(String[] args){
  var usuarioRepo=new InMemoryUsuarioRepository(); var clienteRepo=new InMemoryClienteRepository();
  var petRepo=new InMemoryPetRepository(); var servRepo=new InMemoryServicoRepository(); var agRepo=new InMemoryAgendamentoRepository();
  var usuarioSvc=new UsuarioService(usuarioRepo); var precoSvc=new PrecoService(new PrecoPorPorteStrategy()); var agSvc=new AgendamentoService(agRepo);
  usuarioSvc.cadastrar("Maria","maria","123","ADMIN");
  try{ usuarioSvc.cadastrar("Outra","maria","abc","USER"); System.out.println("ERRO: deveria bloquear login duplicado."); }
  catch(IllegalArgumentException ok){ System.out.println("Login duplicado bloqueado: OK"); }
  System.out.println("Total de usuários: "+usuarioSvc.listar().size());
  var cli=new Cliente(); cli.setNome("João"); cli.setEmail("joao@ex.com"); clienteRepo.salvar(cli);
  var pet=new Pet(); pet.setNome("Toby"); pet.setEspecie("Cão"); pet.setPorte(Porte.MEDIO); pet.setClienteId(cli.getId()); petRepo.salvar(pet);
  var banho=new Servico(); banho.setNome("Banho"); banho.setPrecoBase(new BigDecimal("50.00")); servRepo.salvar(banho);
  var preco=precoSvc.calcular(pet,banho); System.out.println("Preço calculado p/ porte MEDIO: "+preco+" (esperado 60.00)");
  var a1=new Agendamento(); a1.setClienteId(cli.getId()); a1.setPetId(pet.getId()); a1.setServicoId(banho.getId());
  a1.setInicio(LocalDateTime.now().plusDays(1).withHour(10).withMinute(0)); a1.setFim(a1.getInicio().plusMinutes(60)); agSvc.criar(a1);
  System.out.println("Agendamento criado: "+a1.getId());
  var a2=new Agendamento(); a2.setClienteId(cli.getId()); a2.setPetId(pet.getId()); a2.setServicoId(banho.getId());
  a2.setInicio(a1.getInicio().plusMinutes(30)); a2.setFim(a2.getInicio().plusMinutes(45));
  try{ agSvc.criar(a2); System.out.println("ERRO: não deveria permitir conflito."); }
  catch(IllegalStateException ok){ System.out.println("Conflito detectado: OK"); }
  System.out.println("Fluxo de testes finalizado com sucesso."); } }