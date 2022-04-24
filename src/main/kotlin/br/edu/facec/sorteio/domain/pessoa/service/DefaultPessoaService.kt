package br.edu.facec.sorteio.domain.pessoa.service

import br.edu.facec.sorteio.domain.pessoa.entity.Pessoa
import br.edu.facec.sorteio.domain.pessoa.repository.PessoaRepository
import java.time.LocalDate
import java.util.*

class DefaultPessoaService(
    private val pessoaRepository: PessoaRepository
) : PessoaService {

    override fun salvar(pessoa: Pessoa): UUID {
        if (!pessoa.hasNascimentoMenorQue(LocalDate.now())) {
            throw IllegalArgumentException("A pessoa deve ter data de nascimento menor do que o data atual")
        }
        pessoaRepository.salvar(pessoa)
        return pessoa.id
    }

    override fun buscarPorId(id: UUID): Pessoa? {
        return pessoaRepository.buscarPorId(id)
    }

    override fun listar(): List<Pessoa> {
        return pessoaRepository.listar()
    }

    override fun deletarPorId(id: UUID) {
        if (!pessoaRepository.existePorId(id)){
            throw IllegalStateException("A pessoa que você deseja remover não existe.")
        }
        deletarPorId(id)
    }

}