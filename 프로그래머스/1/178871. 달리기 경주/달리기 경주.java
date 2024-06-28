import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수의 현재 순위를 기록하는 맵 생성
        Map<String, Integer> playerPositions = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerPositions.put(players[i], i);
        }

        // 각 호출을 순회하며 처리
        for (String calling : callings) {
            int currentPosition = playerPositions.get(calling);

            // 만약 부른 선수가 1등이 아니라면 추월이 일어납니다.
            if (currentPosition > 0) {
                // 앞에 있는 선수의 이름을 구합니다.
                String previousPlayer = players[currentPosition - 1];
                
                // 두 선수의 위치를 교환합니다.
                players[currentPosition - 1] = calling;
                players[currentPosition] = previousPlayer;

                // 맵의 위치 정보를 업데이트합니다.
                playerPositions.put(calling, currentPosition - 1);
                playerPositions.put(previousPlayer, currentPosition);
            }
        }

        return players;
    }
}