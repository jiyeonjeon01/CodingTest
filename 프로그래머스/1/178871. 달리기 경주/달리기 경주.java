import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> playerPositions = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerPositions.put(players[i], i);
        }

        for (String calling : callings) {
            int currentPosition = playerPositions.get(calling);
            
            if (currentPosition > 0) {
               
                String previousPlayer = players[currentPosition - 1];
                
                players[currentPosition - 1] = calling;
                players[currentPosition] = previousPlayer;

                playerPositions.put(calling, currentPosition - 1);
                playerPositions.put(previousPlayer, currentPosition);
            }
        }

        return players;
    }
}