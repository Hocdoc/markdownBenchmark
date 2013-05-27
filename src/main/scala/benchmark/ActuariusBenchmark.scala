package benchmark

import eu.henkelmann.actuarius.ActuariusTransformer

class ActuariusBenchmark extends Benchmark("Actuarius") {
  
  val actuarius = new ActuariusTransformer

  override def parse(markdownSource: String): String =
    actuarius(markdownSource)
  
}