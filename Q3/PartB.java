public ArrayList<Match> buildMatches(){
  ArrayList<Match> m = new ArrayList<Match>();
  int size = competitorList.size();
  if(size % 2 == 0){
    for(int i = 0; i < size/2; i++){
      Match e = new Match(competitorList.get(i), competitorList.get(size - i -1 ));
      m.add(e);
    }
    return m;
  }
  for(int i = 1; i < (size/2)+1; i++){
    Match o = new Match(competitorList.get(i), competitorList.get(size - i));
    m.add(o);
  }
  return m;
}
