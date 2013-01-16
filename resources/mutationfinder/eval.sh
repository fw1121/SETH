#Apply original MutationFinder on the training and test-corpus
python origDist/mutation_finder.py -r origDist/regex.txt corpus/devo_set.txt -o predictions/
python origDist/mutation_finder.py -r origDist/regex.txt corpus/test_set.txt -o predictions/


#Evaluate original Mutationfinder
python origDist/performance.py predictions/devo_set.txt.mf  corpus/devo_gold_std.txt

python origDist/performance.py predictions/test_set.txt.mf  corpus/test_gold_std.txt