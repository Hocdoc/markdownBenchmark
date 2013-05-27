package benchmark

import scala.io.Source

object Main extends App {

  val engines = new LaikaBenchmark :: 
    new ActuariusBenchmark :: 
//    new KnockoffBenchmark ::  // Exception?
    new PegdownBenchmark ::
    new Markdown4JBenchmark ::
    new TxtmarkBenchmark ::
    Nil
  
  println("Init...")
  firstRun("markdownDocs/mdSpecification/Basics.md")
  println
  
  printFileBenchmark("markdownDocs/mdSpecification/Basics.md")
  printFileBenchmark("markdownDocs/mdSpecification/Syntax.md")
  printFileBenchmark("markdownDocs/play/README.md")
  printFileBenchmark("markdownDocs/play/Highlights.md")
  printFileBenchmark("markdownDocs/play/Migration.md")
  
  /** Do a first run without printing for more fair results. */
  def firstRun(filename: String): Unit = {
    val markdownSource = Source.fromFile(filename).mkString
    engines.foreach{x =>
      for(i <- 1 to 300) x.parse(markdownSource)
    } 
  }
  
  def printFileBenchmark(filename: String): Unit = {
    val loops = 5
    val markdownSource = Source.fromFile(filename).mkString    
    println(s"## Benchmark for file $filename\n")
    
    for(i <- 1 to loops) {
      println(s"### $i. of $loops runs\n")
      val results = engines.map(_.run(markdownSource))
      println
      printBarChart(results)
      println
    }

    println("-------------------------------------------\n")
  }
  
  private def printBarChart(results: List[BenchmarkResult]): Unit = {
    val maxTime = results.map(_.time).max.toFloat
    results.foreach{x =>
      val ratio = x.time / maxTime
      val barSize = (ratio * 20).round
      val bar = "|" + "=" * barSize + " " * (20 - barSize) + "|"
      printf("    " + x.parserName + "\t" + bar + " %3d%%\n", (ratio * 100).round)
    }
  }

}

