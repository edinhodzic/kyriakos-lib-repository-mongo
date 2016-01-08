package io.otrl.library.repository.mongo

import com.mongodb.DBObject
import com.mongodb.casbah.MongoClient
import io.otrl.library.crud.Converter
import io.otrl.library.repository.domain.Resource

class MongoCrudRepositoryImpl(converter: Converter[Resource, DBObject], mongoClient: MongoClient, databaseName: String)
  extends AbstractMongoCrudRepository(converter, mongoClient, databaseName)
