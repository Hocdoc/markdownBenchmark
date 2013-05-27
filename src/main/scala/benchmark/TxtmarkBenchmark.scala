package benchmark

import com.github.rjeschke.txtmark.Processor

class TxtmarkBenchmark extends Benchmark("Txtmark ") {
    
  override def parse(markdownSource: String): String =
    Processor.process(markdownSource)
  
}