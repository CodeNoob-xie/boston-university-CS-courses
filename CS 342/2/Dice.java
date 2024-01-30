public class Dice{
  Die[]dice;
  private int diceCount;
  private int diceSize;
  
  public Dice(int diceCOunt, int dicSize){
    this.diceCount = diceCount;
    this.diceSize = diceSize; 
    for(int i=0;i<diceCOunt;i++){
     dice[i] = new Die(diceSize)
