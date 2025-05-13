public int walkDogs(int hour){
    int totalDogs = numAvailableDogs(hour);
    if(totalDogs - maxDogs >= 0){
        updateDogs(hour, maxDogs);
        return maxDogs;
    }
    updateDogs(hour, totalDogs);
    return totalDogs;
}
