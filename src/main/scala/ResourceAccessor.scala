package com.textteaser.summarizer

import java.io.File
 
object ResourceAccessor {
  def corpusEN = getClass.getResourceAsStream("corpusEN.bin")
}
