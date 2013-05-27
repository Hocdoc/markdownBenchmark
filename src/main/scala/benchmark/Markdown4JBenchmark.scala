package benchmark

import org.markdown4j.Markdown4jProcessor

class Markdown4JBenchmark extends Benchmark("Markdown4J") {
  
  val processor = new Markdown4jProcessor

  override def parse(markdownSource: String): String =
    processor.process(markdownSource)
  
}