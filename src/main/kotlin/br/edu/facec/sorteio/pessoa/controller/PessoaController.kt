package br.edu.facec.sorteio.pessoa.controller

import br.edu.facec.sorteio.pessoa.entity.Pessoa
import br.edu.facec.sorteio.pessoa.service.PessoaService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import jakarta.inject.Inject
import java.util.*

@Controller("/pessoas")
class PessoaController(@Inject private val pessoaService: PessoaService) {

    fun save(pessoa: Pessoa): UUID {
        TODO("Not Implemented Yet")
    }

    @Get("/{id}")
    fun findById(@PathVariable("id") id: UUID): Pessoa? {
        return pessoaService.findById(id)
    }

    @Get
    fun findAll(): List<Pessoa> {
        return pessoaService.findAll()
    }

    fun deleteById(id: UUID) {
        TODO("Not Implemented Yet")
    }
}