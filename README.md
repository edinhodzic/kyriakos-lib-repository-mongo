# About

A repository implementation based on the [`kyriakos-lib-repository`](https://github.com/edinhodzic/kyriakos-lib-repository) abstraction library and [MongoDB](https://www.mongodb.com/).

# What's under the hood?

Implementation:

- [Scala](http://www.scala-lang.org/)
- [Casbah](https://mongodb.github.io/casbah/)
- [`kyriakos-lib-repository`](https://github.com/edinhodzic/kyriakos-lib-repository)

Testing:

- [Specs2](https://etorreborre.github.io/specs2/)

## Usage

Given a domain object:

```scala
case class Person(firstname: String, lastname: String) extends Identifiable
```

The repository implementation is:

```scala
class PersonCrudRepository(converter: Converter[Person, DBObject])
  extends AbstractMongoCrudRepository[Person](converter)
```

The converter referred to in the above code snippet, is one which converts a `User` object into Mongo's `DBObject` and the implementation in the above case is:

```scala
class PersonConverter extends Converter[Person, DBObject] {

  override def serialise(person: Person): DBObject =
    MongoDBObject.newBuilder
      .+=("firstname" -> person.firstname)
      .+=("lastname" -> person.lastname)
      .result()


  override def deserialise(dbObject: DBObject): Person = {
    Person(
      dbObject.get("firstname").asInstanceOf[String],
      dbObject.get("lastname").asInstanceOf[String])
  }

}
```

## Known issues/things to fix

- [ ] attempting tp update non-existent resource results in an uninformative `unknown update failure for 567ac3aed4c6097b4bb23dbc` for example, need to make that more informative
