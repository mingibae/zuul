package w13;

public class Player {
	private Room currentRoom;
	private Room recentRoom;
	
	/**
	 * 구성자
	 * @param startRoom 이 선수가 처음 게임을 시작할 방
	 */
	public Player(Room startRoom) {
		currentRoom = startRoom;
		recentRoom = startRoom;
	}
	/**
	 * 주어진 방향으로 옮겨간다.
	 * 그 뱡향으로 출구가 없으면 현재 위치에 머문다.
	 * @param direction 옮겨갈 방향.
	 * @return 성공했으면 0, 실패했으면 -1.
	 */
	public int moveTo(String direction) {
		Room nextRoom = null;

		nextRoom = currentRoom.getExit(direction);
		
		if (nextRoom == null) {
			return -1;
		} else {
			recentRoom = currentRoom;
			currentRoom = nextRoom;
			return 0;
		}
	}
	
	/**
	 * 이전 방으로 돌아간다.
	 */
	public void back() {
		if (recentRoom == null) {
			System.out.println("한 단계 전으로만 돌아갈 수 있습니다.");
		}
		else {
			currentRoom = recentRoom;
		}
	}
	
	/**
	 * 선수가 현재 있는 방을 반환한다.
	 * @return
	 */
	public Room getCurrentRoom() {
		return currentRoom;
	}
}
