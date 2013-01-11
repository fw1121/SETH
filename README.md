# SETH - SNP Extraction Tool for Human Variations

SETH is a text mining software for extracting mentions of single nucleotide polymorphism written 
in the latest nomenclature of the Human Genome Variation Society for the description of sequence variants. 
It uses Scala parser combinators to specify a recently published EBNF for this nomenclature [1].

### Current Components:
/src/main/scala/seth/ner/SETHNER - Named Entity Recognition

### Under Development:
Normalization to dbSNP entries

### Using SETH's mutation NER component in your code:
```scala
    import seth.ner.SETHNER
    val extractor = new SETHNER

    //example sentence taken from: http://www.ncbi.nlm.nih.gov/pubmed/18823551
    val text = "Mutations in the DBD (p.G56R, p.N65_C67del, p.R76Q, p.R76W, p.G88V, p.R97H, p.R104Q, and p.R104W) and LBD (p.A256E, p.L263P, p.P276fs, p.V302I, p.R309G, p.R311Q, p.R334G, p.L336P, p.Q350X, p.L353V, p.R385P, and p.M407K) demonstrated a variable reduction in NR2E3-mediated increase in transcriptional activity when mutant NR2E3 construct was cotransfected with both NRL and CRX."

    val mutations = extractor.extractMutations(text)
    for (mutation <- mutations) 
      println(
        mutation.text, 
        mutation.start,
        mutation.end,
        mutation.typ, 
        mutation.ref, 
        mutation.loc, 
        mutation.wild, 
        mutation.mutated
      )
```
[1] J. F. J. Laros, A. Blavier, J. T. den Dunnen, and P. E. M. Taschner. 
A formalized description of the standard human variant nomenclature in Extended Backus-Naur Form. 
BMC bioinformatics, vol. 12 Suppl 4, p. S5. 2011.