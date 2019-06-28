package com.skillip

object FroDemo {
  def main(args: Array[String]): Unit = {
    for(i <- (0 to 10).reverse
    if i % 3 == 0) println(i)

    for (i <- 0.until(10).reverse if i % 2 == 0) println(i)

    // 不成文的规定：当 for 推导式仅包含单一表达式时使用圆括号（早期要用分号）
    // 当包含多个表达式时使用大括号

    val dogBreeds = List("Doberman", "Yorkshire Terrier")

    for {
      breed <- dogBreeds
      upBreed = breed.toUpperCase
    } println(upBreed)



  }
}
