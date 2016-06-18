package io.kyriakos.library.mongo

import com.mongodb.DBObject
import com.mongodb.casbah.MongoClient
import io.kyriakos.library.repository.domain.Resource
import io.kyriakos.library.crud.Converter

class MongoCrudRepositoryImpl(converter: Converter[Resource, DBObject], mongoClient: MongoClient, databaseName: String)
  extends AbstractMongoCrudRepository(converter, mongoClient, databaseName)
