package br.inatel.c07;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// EXERCÍCIO: complete cada método no espaço indicado (onde está o TODO).
// Use sempre PreparedStatement com parâmetros (?) e feche os recursos no finally.
public class PlantaDAO extends ConnectionDAO {

    // Questão 1: inserir uma planta.
    // Deve inserir na tabela planta e devolver true se der certo, false se houver erro.
    public boolean inserirPlanta(Planta planta) {
        // TODO
        return false;
    }

    // Questão 2: listar todas as plantas, ordenadas pelo id.
    // Deve devolver uma lista de objetos Planta (use rs.next() para percorrer).
    public List<Planta> listarPlantas() {
        List<Planta> plantas = new ArrayList<>();
        // TODO
        return plantas;
    }

    // Questão 3: buscar as plantas de uma espécie.
    // Deve devolver a lista das plantas cuja espécie seja igual ao parâmetro.
    public List<Planta> buscarPorEspecie(String especie) {
        List<Planta> plantas = new ArrayList<>();
        // TODO
        return plantas;
    }

    // Questão 4: atualizar o preço de uma planta pelo id.
    // Deve devolver true se alguma linha foi alterada (executeUpdate() > 0), senão false.
    public boolean atualizarPreco(int id, double novoPreco) {
        // TODO
        return false;
    }

    // Questão 5: remover uma planta pelo id.
    // Deve devolver true se alguma linha foi removida, senão false.
    public boolean removerPlanta(int id) {
        // TODO
        return false;
    }

    // Questão 6 (Desafio): valor total do estoque.
    // Deve devolver a soma de preco * estoque de todas as plantas.
    // Dica: SELECT COALESCE(SUM(preco * estoque), 0) AS total FROM planta
    public double valorTotalEstoque() {
        // TODO
        return 0.0;
    }

    // Já pronto: libera os recursos na ordem inversa da abertura.
    // Chame este método dentro do finally de cada questão.
    private void fecharRecursos() {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (st != null) st.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao fechar recursos: " + e.getMessage());
        }
        rs = null;
        pst = null;
        st = null;
    }
}
