package br.edu.facec.sorteio.pessoa.repository

import br.edu.facec.sorteio.pessoa.entity.Pessoa
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import com.mongodb.client.model.Filters
import java.util.*

class MongoPessoaRepository(private val mongoClient: MongoClient): PessoaRepository {

    private val pessoaCollection: MongoCollection<Pessoa> = mongoClient.getDatabase("sis-sorteio")
                                                                        .getCollection("pessoa", Pessoa::class.java)

    override fun save(pessoa: Pessoa) {
        pessoaCollection.insertOne(pessoa)
    }

    override fun existsById(id: UUID): Boolean {
        return pessoaCollection.countDocuments(Filters.eq("_id", id)) > 0
    }

    override fun findById(id: UUID): Pessoa? {
        return pessoaCollection.find(Filters.eq("_id", id)).first()
    }

    override fun findAll(): List<Pessoa> {
        return pessoaCollection.find().toList()
    }

    override fun deleteById(id: UUID) {
        pessoaCollection.deleteOne(Filters.eq("_id", id))
    }

    override fun update(id: UUID, pessoa: Pessoa) {
        pessoaCollection.replaceOne(Filters.eq("_id", id), pessoa)
    }
}