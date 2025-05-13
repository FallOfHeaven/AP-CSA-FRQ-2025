public int dogWalkShift(int startHour, int endHour){
    int earning = 0;
    for(int i = startHour; i <= endHour; i++){
        int dogsWalked = walkDogs(i);
        earning += dogsWalked*5;
        if((maxDogs == dogsWalked) || (i >= 9 && i <= 17)){
            earning += 3;
        }
    }
    return earning;
}
