package benchmark

import org.pegdown.PegDownProcessor

class PegdownBenchmark extends Benchmark("Pegdown ") {
  
  val pegdown = new PegDownProcessor

  override def parse(markdownSource: String): String =
    pegdown.markdownToHtml(markdownSource)
  
}