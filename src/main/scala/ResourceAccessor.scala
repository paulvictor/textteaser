package com.textteaser.summarizer

import java.io.File
 
object ResourceAccessor {
  val corpusEN = getClass.getResourceAsStream("corpusEN.bin")
}
