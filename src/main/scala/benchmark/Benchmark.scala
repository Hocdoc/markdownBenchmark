package benchmark

abstract class Benchmark(parserName: String) {

  val NTIMES = 500
  
  /**  Runs the parser NTIMES on the text. */
  def run(markdownSource: String): BenchmarkResult = {
    print("    " + parserName + "\t")
    val start = System.currentTimeMillis
    
    for(i <- 1 to NTIMES) 
      parse(markdownSource)
    
    val time = (System.currentTimeMillis - start).toInt
    printf("%5d ms\n", time)
    BenchmarkResult(parserName, time)
  }
  
  def parse(markdownTxt: String): String
  
}

case class BenchmarkResult(parserName: String, time: Int)