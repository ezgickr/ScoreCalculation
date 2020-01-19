# ScoreCalculation
Calculates search-volume of keywords which are searched in the amazon.com search bar. An endpoint receives a single keyword as an input 
and returns a score for that keyword.
same exact keyword.

# Approach
Amazon autocomplite API called is called for all substrings for given keyword in parallel way. Substrings such as "x ", "xi",.., "xiaomi".
Results for all calls listed. Lists are checked if they contain the keyword "xiaomi". 
And the algorithm counts the results. Count does not contain prefix results like "xiaomi charger cable", just the keyword itself.
So count can be maximum keyword length.
Calculation : (count/keyword.length())*100.

# Running
Request : http://localhost:8080/estimate?keyword=xiaomi
Response :
{
  "keyword": "xiaomi",
  "score": 83
}
