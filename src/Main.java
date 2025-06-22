import br.com.alura.questoes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // questao 1
        SistemaAgendamento.agendar();

        // questao 2
        PlataformaEstudos.calcularMedia();

        // questao 3
        Item x = new Item("Caderno");
        Item y = new Item("Caneta", 3);
        System.out.println(x.getQuantidade() + y.getQuantidade());

        // questao 4
        PrioridadeTarefa.verificarPrioridade();

        // questao 5
        Notificacoes.calcularNotificacoes();

        // questao 6
        ArrayHorarios.verificarHorarioArray();

        // questao 7
        Livro l = new Livro();
        l.setTitulo("Java para Iniciantes");
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());

        // questao 8
        Usuario u = new Usuario("João", 25);
        System.out.println(u.getIdade());
        System.out.println(u.getNome());

        // questao 9
        ManipulacaoDatas.verificarPrazo();

        // questao 10
        CalculoDiasUteis.calcularDiasUteis();

        // questao 11
        VerificacaoHorario.verificarHorario();

        // questao 12
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new Tarefa("Estudar"));
        tarefas.add(new Tarefa("Almoçar"));
        tarefas.add(new Tarefa("Dormir"));

        Collections.sort(tarefas);
        System.out.println(tarefas);

        // questao 13
        LoopTarefas.verificarTarefasFiltradas();
    }
}