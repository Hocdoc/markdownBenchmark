package benchmark

import laika.api.Transform
import laika.parse.markdown.Markdown
import laika.render.HTML
import laika.parse.markdown.html.VerbatimHTML
import laika.api.Render
import laika.api.Parse

class LaikaBenchmark extends Benchmark("Laika   ") {

  val laika = Transform from (Markdown withVerbatimHTML) to HTML rendering VerbatimHTML
  
  override def parse(markdownSource: String): String =
    laika fromString markdownSource toString
  
}