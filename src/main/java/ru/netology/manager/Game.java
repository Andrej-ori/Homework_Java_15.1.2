package ru.netology.manager;

import ru.netology.data.Player;
import ru.netology.exception.NotRegisteredException;


import java.util.HashMap;
import java.util.Map;


public class Game {
    protected Map<String, Player> players = new HashMap();

     void register(String name, Player player) {
        players.put(name, player);
    }

     int round(String playerName1, String playerName2) {

        Player player1 = players.get(playerName1);
        Player player2 = players.get(playerName2);

        if (player1 == null) {
            throw new NotRegisteredException(playerName1);
        }
        if (player2 == null) {
            throw new NotRegisteredException(playerName2);
        }

        if (player1.getStrength() == player2.getStrength()) {
            return 0;
        }
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        } else {
            return 2;
        }
    }
}
