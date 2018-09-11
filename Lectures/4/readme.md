### Sets 

Describing a set: 

- Enumeration: 
	- list all the elements 

- Describe set based on one or more properties of the members 
	- B = { x | x is an odd integer and x > 10 }

Power Set: 
	- the set of all the subsets of a set A 
	- it's denoted as P(A) 

Binary Relation: 
A binary relation from A to B is simply a subset of A x B 


Equivelence Relations: 

if R is a binary relation on A (i.e. R is a subset of A x A ), R is an equivalence realtion if: 
	- A) R is reflexive for all a in A, (a,a) e R 
	- B) R is symmeteric for all a,b in A, if (a,b) e R then (b,a) eR 
	- C) R is transitive for all a,b,c in A, if (a,b) e R and (b,c) e R then (a,c) e R 

Examples: 
which poroperties hold/break? 
	- aRb if a < b 
		- breaks for A
		- breaks for B
		- holds for C
	- aRb if a <= b 
		- reflexive because a = a holds for A
		- breaks for B 
		- holds for C
	- aRb if a=b 
	- aRb if | a-b | < 5 
	- aRb if |a| = |b| 
	- aRb if a = |b| 
		- breaks for A 
		- breaks for B 
		- holds for C 
	- aRb if a and b are relatively prime 


### Proofs 
1. Direct Proof: 
	- if p then q
2. proof by contradiction: 
	- to prove p => q, prove -q => -p 
3. Proof by mathematical induction: 
	- basis step and inductive step
	- P(n0) is true basis step 
	- For any k>= n0; if p(k) is true, then p(k+1) is true 


