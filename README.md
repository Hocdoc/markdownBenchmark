Markdown Benchmarks
===================

A benchmark suit for these JVM Markdown parser:

* [Laika](https://planet42.github.io/Laika): Scala, using parser combinators, understand also [reStructuredText](http://docutils.sourceforge.net/rst.html)
* [Actuarius](https://github.com/chenkelmann/actuarius): Scala, using parser combinators
* [Pegdown](https://github.com/sirthias/pegdown): Scala, PEG-Parser ([parboiled](https://github.com/sirthias/parboiled/wiki))
* [Markdown4J](http://code.google.com/p/markdown4j/): Java, hand-written parser
* [Txtmark](https://github.com/rjeschke/txtmark): Java, hand-written parser

The benchmark runs these parsers 500 times on some real-world Markdown files:

* `markdownDocs/mdSpecification/Basics.md`: [Markdown: Basics](http://daringfireball.net/projects/markdown/basics)
* `markdownDocs/mdSpecification/Syntax.md`: [Markdown: Syntax](http://daringfireball.net/projects/markdown/syntax)
* `markdownDocs/play/README.md`: [Play Framework: README](https://github.com/playframework/Play20/blob/master/README.md)
* `markdownDocs/play/Highlights.md`: [Play Framework: What's new in Play 2.1?](http://www.playframework.com/documentation/2.1.1/Highlights)
* `markdownDocs/play/Migration.md`: [Play Framework: Migration Guide](http://www.playframework.com/documentation/2.1.1/Migration)

Markdown extensions of the parsers are switched off.

## Usage

    sbt run

## My results

Fedora Linux, Intel(R) Core(TM) i7-3610QM CPU @ 2.30GHz, Java version "1.7.0\_04", 64 Bit

## Benchmark for file markdownDocs/mdSpecification/Basics.md

### 1. of 5 runs

    Laika        1091 ms
    Actuarius    1241 ms
    Pegdown      2170 ms
    Markdown4J    143 ms
    Txtmark       132 ms

    Laika       |==========          |  50%
    Actuarius   |===========         |  57%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   7%
    Txtmark     |=                   |   6%

### 2. of 5 runs

    Laika         928 ms
    Actuarius    1186 ms
    Pegdown      2144 ms
    Markdown4J    143 ms
    Txtmark       134 ms

    Laika       |=========           |  43%
    Actuarius   |===========         |  55%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   7%
    Txtmark     |=                   |   6%

### 3. of 5 runs

    Laika         884 ms
    Actuarius    1145 ms
    Pegdown      2126 ms
    Markdown4J    140 ms
    Txtmark       134 ms

    Laika       |========            |  42%
    Actuarius   |===========         |  54%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   7%
    Txtmark     |=                   |   6%

### 4. of 5 runs

    Laika         813 ms
    Actuarius    1074 ms
    Pegdown      2134 ms
    Markdown4J    137 ms
    Txtmark       141 ms

    Laika       |========            |  38%
    Actuarius   |==========          |  50%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   6%
    Txtmark     |=                   |   7%

### 5. of 5 runs

    Laika         794 ms
    Actuarius    1069 ms
    Pegdown      2135 ms
    Markdown4J    135 ms
    Txtmark       127 ms

    Laika       |=======             |  37%
    Actuarius   |==========          |  50%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   6%
    Txtmark     |=                   |   6%

-------------------------------------------

## Benchmark for file markdownDocs/mdSpecification/Syntax.md

### 1. of 5 runs

    Laika        3794 ms
    Actuarius   10518 ms
    Pegdown     10681 ms
    Markdown4J    697 ms
    Txtmark       549 ms

    Laika       |=======             |  36%
    Actuarius   |====================|  98%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   7%
    Txtmark     |=                   |   5%

### 2. of 5 runs

    Laika        3208 ms
    Actuarius   10239 ms
    Pegdown     10516 ms
    Markdown4J    564 ms
    Txtmark       535 ms

    Laika       |======              |  31%
    Actuarius   |=================== |  97%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   5%
    Txtmark     |=                   |   5%

### 3. of 5 runs

    Laika        3189 ms
    Actuarius    9849 ms
    Pegdown     10515 ms
    Markdown4J    577 ms
    Txtmark       529 ms

    Laika       |======              |  30%
    Actuarius   |=================== |  94%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   5%
    Txtmark     |=                   |   5%

### 4. of 5 runs

    Laika        3161 ms
    Actuarius    9857 ms
    Pegdown     10667 ms
    Markdown4J    559 ms
    Txtmark       537 ms

    Laika       |======              |  30%
    Actuarius   |==================  |  92%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   5%
    Txtmark     |=                   |   5%

### 5. of 5 runs

    Laika        3078 ms
    Actuarius    9775 ms
    Pegdown     10424 ms
    Markdown4J    566 ms
    Txtmark       546 ms

    Laika       |======              |  30%
    Actuarius   |=================== |  94%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   5%
    Txtmark     |=                   |   5%

-------------------------------------------

## Benchmark for file markdownDocs/play/README.md

### 1. of 5 runs

    Laika         392 ms
    Actuarius     576 ms
    Pegdown      1000 ms
    Markdown4J    118 ms
    Txtmark        85 ms

    Laika       |========            |  39%
    Actuarius   |============        |  58%
    Pegdown     |====================| 100%
    Markdown4J  |==                  |  12%
    Txtmark     |==                  |   9%

### 2. of 5 runs

    Laika         388 ms
    Actuarius     464 ms
    Pegdown      1006 ms
    Markdown4J     57 ms
    Txtmark        61 ms

    Laika       |========            |  39%
    Actuarius   |=========           |  46%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   6%
    Txtmark     |=                   |   6%

### 3. of 5 runs

    Laika         374 ms
    Actuarius     462 ms
    Pegdown      1010 ms
    Markdown4J     57 ms
    Txtmark        61 ms

    Laika       |=======             |  37%
    Actuarius   |=========           |  46%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   6%
    Txtmark     |=                   |   6%

### 4. of 5 runs

    Laika         370 ms
    Actuarius     434 ms
    Pegdown      1013 ms
    Markdown4J     57 ms
    Txtmark        61 ms

    Laika       |=======             |  37%
    Actuarius   |=========           |  43%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   6%
    Txtmark     |=                   |   6%

### 5. of 5 runs

    Laika         370 ms
    Actuarius     433 ms
    Pegdown      1022 ms
    Markdown4J     57 ms
    Txtmark        65 ms

    Laika       |=======             |  36%
    Actuarius   |========            |  42%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   6%
    Txtmark     |=                   |   6%

-------------------------------------------

## Benchmark for file markdownDocs/play/Highlights.md

### 1. of 5 runs

    Laika        1269 ms
    Actuarius    1449 ms
    Pegdown      3988 ms
    Markdown4J    240 ms
    Txtmark       222 ms

    Laika       |======              |  32%
    Actuarius   |=======             |  36%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   6%
    Txtmark     |=                   |   6%

### 2. of 5 runs

    Laika        1235 ms
    Actuarius    1336 ms
    Pegdown      3989 ms
    Markdown4J    190 ms
    Txtmark       210 ms

    Laika       |======              |  31%
    Actuarius   |=======             |  33%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   5%
    Txtmark     |=                   |   5%

### 3. of 5 runs

    Laika        1218 ms
    Actuarius    1342 ms
    Pegdown      4298 ms
    Markdown4J    192 ms
    Txtmark       201 ms

    Laika       |======              |  28%
    Actuarius   |======              |  31%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   4%
    Txtmark     |=                   |   5%

### 4. of 5 runs

    Laika        1228 ms
    Actuarius    1363 ms
    Pegdown      4001 ms
    Markdown4J    194 ms
    Txtmark       211 ms

    Laika       |======              |  31%
    Actuarius   |=======             |  34%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   5%
    Txtmark     |=                   |   5%

### 5. of 5 runs

    Laika        1174 ms
    Actuarius    1329 ms
    Pegdown      4059 ms
    Markdown4J    193 ms
    Txtmark       204 ms

    Laika       |======              |  29%
    Actuarius   |=======             |  33%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   5%
    Txtmark     |=                   |   5%

-------------------------------------------

## Benchmark for file markdownDocs/play/Migration.md

### 1. of 5 runs

    Laika        1590 ms
    Actuarius    1391 ms
    Pegdown      4110 ms
    Markdown4J    159 ms
    Txtmark       210 ms

    Laika       |========            |  39%
    Actuarius   |=======             |  34%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   4%
    Txtmark     |=                   |   5%

### 2. of 5 runs

    Laika        1597 ms
    Actuarius    1390 ms
    Pegdown      4105 ms
    Markdown4J    165 ms
    Txtmark       207 ms

    Laika       |========            |  39%
    Actuarius   |=======             |  34%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   4%
    Txtmark     |=                   |   5%

### 3. of 5 runs

    Laika        1606 ms
    Actuarius    1385 ms
    Pegdown      4122 ms
    Markdown4J    157 ms
    Txtmark       204 ms

    Laika       |========            |  39%
    Actuarius   |=======             |  34%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   4%
    Txtmark     |=                   |   5%

### 4. of 5 runs

    Laika        1593 ms
    Actuarius    1405 ms
    Pegdown      4122 ms
    Markdown4J    154 ms
    Txtmark       202 ms

    Laika       |========            |  39%
    Actuarius   |=======             |  34%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   4%
    Txtmark     |=                   |   5%

### 5. of 5 runs

    Laika        1598 ms
    Actuarius    1409 ms
    Pegdown      4206 ms
    Markdown4J    160 ms
    Txtmark       206 ms

    Laika       |========            |  38%
    Actuarius   |=======             |  33%
    Pegdown     |====================| 100%
    Markdown4J  |=                   |   4%
    Txtmark     |=                   |   5%


