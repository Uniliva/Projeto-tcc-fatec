package example

import scala.collection.immutable.HashMap


trait Lambda {


  //criando uma set
  val setEmpty: Set[String] = Set.empty[String] //set vazio
  val set1 = Set("tuca","riva","lo")

  //acessando os dados
  println(set1)

  //adicionando elemento no hashMap
   val set3 = set1 + "relendes" + "beto"

  //adicionando outro hashMap , so vai adicinar os diferente, descosiderando os repetidos
  val set4 = set1 ++ set3

  //removendo elemento
  val set5 = set4 - "relendes"

  //retornando os valores diferentes entre os dois sets
  val set6 = set1 &~ set3









}
