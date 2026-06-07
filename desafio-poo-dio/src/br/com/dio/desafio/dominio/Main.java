import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // --- 1. CRIANDO OS CURSOS (CONTEÚDOS) ---
        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Java Fundamentos e Sintaxe");
        cursoJavaBasico.setDescricao("Variáveis, operadores, estruturas condicionais e repetitivas no Java");
        cursoJavaBasico.setCargaHoraria(10);

        Curso cursoPoo = new Curso();
        cursoPoo.setTitulo("Programação Orientada a Objetos com Java");
        cursoPoo.setDescricao("Dominando Abstração, Encapsulamento, Herança e Polimorfismo na prática");
        cursoPoo.setCargaHoraria(12);

        Curso cursoCollections = new Curso();
        cursoCollections.setTitulo("Trabalhando com Collections em Java");
        cursoCollections.setDescricao("Dominando List, Set, Map e Streams API");
        cursoCollections.setCargaHoraria(8);

        // --- 2. CRIANDO A MENTORIA ---
        Mentoria mentoriaCarreira = new Mentoria();
        mentoriaCarreira.setTitulo("Construindo um Portfólio de Sucesso no GitHub");
        mentoriaCarreira.setDescricao("Dicas de organização de repositórios e README para se destacar no mercado");
        mentoriaCarreira.setData(LocalDate.now());

        // --- 3. CONFIGURANDO O BOOTCAMP ---
        Bootcamp bootcampBackend = new Bootcamp();
        bootcampBackend.setNome("Bootcamp Java Cloud Backend");
        bootcampBackend.setDescricao("Formação completa focada no ecossistema Java para o mercado de tecnologia");

        // Adicionando os conteúdos ao Bootcamp
        bootcampBackend.getConteudos().add(cursoJavaBasico);
        bootcampBackend.getConteudos().add(cursoPoo);
        bootcampBackend.getConteudos().add(cursoCollections);
        bootcampBackend.getConteudos().add(mentoriaCarreira);

        // --- 4. SIMULANDO O DEV AUGUSTO ---
        // Ele vai se inscrever, focar bastante e concluir quase todo o Bootcamp
        Dev devAugusto = new Dev();
        devAugusto.setNome("Augusto");
        devAugusto.inscreverBootcamp(bootcampBackend);

        System.out.println("=== DEV: " + devAugusto.getNome() + " ===");
        System.out.println("Conteúdos Iniciais Inscritos:\n" + devAugusto.getConteudosInscritos());

        // Progredindo em 3 conteúdos
        devAugusto.progredir();
        devAugusto.progredir();
        devAugusto.progredir();

        System.out.println("\n--- Após Progresso ---");
        System.out.println("Ainda Inscritos: " + devAugusto.getConteudosInscritos());
        System.out.println("Concluídos: " + devAugusto.getConteudosConcluidos());
        System.out.println("Total de XP Acumulado: " + devAugusto.calcularTotalXp());

        System.out.println("\n--------------------------------------------------\n");

        // --- 5. SIMULANDO O DEV PEDRO (OUTRO PERFIL DE TESTE) ---
        // Pedro acabou de entrar e concluiu apenas o primeiro curso básico
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcampBackend);

        System.out.println("=== DEV: " + devPedro.getNome() + " ===");
        System.out.println("Conteúdos Iniciais Inscritos:\n" + devPedro.getConteudosInscritos());

        // Progredindo em apenas 1 conteúdo
        devPedro.progredir();

        System.out.println("\n--- Após Progresso ---");
        System.out.println("Ainda Inscritos: " + devPedro.getConteudosInscritos());
        System.out.println("Concluídos: " + devPedro.getConteudosConcluidos());
        System.out.println("Total de XP Acumulado: " + devPedro.calcularTotalXp());
    }
}