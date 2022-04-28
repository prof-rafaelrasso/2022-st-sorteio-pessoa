package br.edu.facec.sorteio.pessoa.service

import br.edu.facec.sorteio.pessoa.entity.Pessoa
import br.edu.facec.sorteio.pessoa.repository.PessoaRepository
import java.time.LocalDate
import java.util.*

class DefaultPessoaService(
    private val pessoaRepository: PessoaRepository
) : PessoaService {

    override fun salvar(pessoa: Pessoa): UUID {
        if (!pessoa.hasNascimentoLessThan(LocalDate.now())) {
            throw IllegalArgumentException("A pessoa deve ter data de nascimento menor do que o data atual")
        }
        pessoaRepository.save(pessoa)
        return pessoa.id
    }

    override fun buscarPorId(id: UUID): Pessoa? {
        return pessoaRepository.findById(id)
    }

    override fun listar(): List<Pessoa> {
        return pessoaRepository.findAll()
    }

    override fun deletarPorId(id: UUID) {
        if (!pessoaRepository.existsById(id)){
            throw IllegalStateException("A pessoa que você deseja remover não existe.")
        }
        deletarPorId(id)
    }

}