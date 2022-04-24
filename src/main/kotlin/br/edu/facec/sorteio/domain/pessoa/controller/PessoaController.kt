package br.edu.facec.sorteio.domain.pessoa.controller

import br.edu.facec.sorteio.domain.pessoa.entity.Pessoa
import java.util.*

interface PessoaController {
    fun salvar(pessoa: Pessoa): UUID
    fun buscarPorId(id: UUID): Pessoa
    fun listar(pagina: Int, tamanhoPagina: Int): List<Pessoa>
    fun deletarPorId(id: UUID)
}