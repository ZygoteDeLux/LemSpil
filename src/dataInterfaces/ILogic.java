package dataInterfaces;

import business.Prop;
import business.Room;
import java.util.ArrayList;

public interface ILogic {

    public void injectData(IData data);

    public void setCurrentPlayerRoom(Room room);

    public String getPlayerName();

    public Room getCurrentPlayerRoom();

    public void moveCentrum();

    public void moveNorth();

    public void moveSouth();

    public void moveWest();

    public void moveEast();

    public void moveTaxi();

    public void moveFishMarket();

    public void moveHouse();

    public void moveBar();

    public void handIn();

    public void setText(String text);

    public Boolean getIsBarEmpty();

    public void setIsBarEmpty(Boolean isBarEmpty);

    public String getText();

    public void addText(String string);

    public void talk();

    public void map();

    public void doAction();

    public void pickUp();

    public String getRoomPropName();

    public void showBag();

    public int getCurrency();

    public void setIsSucessFull(Boolean isSucessFull);

    public Boolean getIsSucessFull();

    public void help();

    public void clearText();

    public void checkTime();

    public void lose();

    public void scoreBoard();

    public int getBeefcount();

    public void setCurrentPlayerName(String PlayerName);
    
    public long getElapsedTime();
    
    public long getStartTime();
    
    public long getPlayerDrunk();

}
