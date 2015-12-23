# About

Repository implementation based on [MongoDB](https://www.mongodb.com/).

# What's under the hood?

Implementation:

- [Scala](http://www.scala-lang.org/)
- [Casbah](https://mongodb.github.io/casbah/)
- `otrl-lib-repository`

Testing:

- [Specs2](https://etorreborre.github.io/specs2/)

## Usage

Given a domain object:

```scala
case class User(data: String) extends Identifiable
```

The repository implementation is:

```scala
class UserCrudRepository(converter: Converter[User, DBObject])
  extends AbstractMongoCrudRepository[User](converter)
```

## Known issues/things to fix

- [ ] attempting tp update non-existent resource results in an uninformative `unknown update failure for 567ac3aed4c6097b4bb23dbc` for example, need to make that more informative
