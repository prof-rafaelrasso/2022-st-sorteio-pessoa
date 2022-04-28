package br.edu.facec.sorteio.pessoa.entity

import java.time.LocalDate
import java.util.UUID

class Pessoa private constructor(
    val id: UUID,
    private val nome: String,
    private val telefone: String,
    private val email: String
) {
    private var cpf: String? = null
    private var nascimento: LocalDate? = null
    private var endereco: String? = null

    fun hasId(id: UUID): Boolean {
        return this.id == id
    }

    fun hasNascimentoLessThan(data: LocalDate): Boolean {
        return nascimento != null && nascimento!!.isBefore(data)
    }

    companion object {
        operator fun invoke(id: UUID, nome: String, telefone: String, email: String): Pessoa {
            if (nome.isBlank()) {
                throw IllegalArgumentException("Nome da pessoa deve ser informado.")
            }
            if (telefone.isBlank()) {
                throw IllegalArgumentException("Telefone da pessoa deve ser informado.")
            }
            if (email.isBlank()) {
                throw IllegalArgumentException("E-mail da pessoa deve ser informado.")
            }
            return Pessoa(id, nome, telefone, email)
        }
    }
}