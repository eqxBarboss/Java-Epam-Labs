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
    public void printSelf() {
        super.printSelf();

        System.out.println("Favorite game: " + favoriteGame);
    }
}
