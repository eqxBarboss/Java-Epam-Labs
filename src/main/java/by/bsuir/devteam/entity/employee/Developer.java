package by.bsuir.devteam.entity.employee;

public class Developer extends Employee {

    private String favoriteGame;

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() +
                "Favorite gane: " + favoriteGame;
    }
}
