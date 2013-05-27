package benchmark

import com.tristanhunt.knockoff.DefaultDiscounter._
import com.tristanhunt.knockoff._

class KnockoffBenchmark extends Benchmark("Knockoff") {
  
  override def parse(markdownSource: String): String =
    toText(knockoff(markdownSource))
  
}