package Abstract;

import Entities.Game;

public interface GameService {
		void add(Game game);
		void addMultiple(Game[] games);
		void delete(Game game);
		void deleteMultiple(Game[] games);
		void update(Game game);
		void updateMultiple(Game[] games);
}
