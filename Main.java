package huongdoituong;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // Tạo danh sách các cầu thủ
        ArrayList<FootballPlayer> players = new ArrayList<>();
        players.add(new FootballPlayer("Player 1", 25, "Address 1", 1.80, 75.0, 77000));
        players.add(new FootballPlayer("Player 2", 27, "Address 2", 1.85, 80.0, 80000));
        players.add(new FootballPlayer("Player 3", 24, "Address 3", 1.75, 70.0, 85000));
        players.add(new FootballPlayer("Player 4", 26, "Address 4", 1.80, 75.0, 70000));
        players.add(new FootballPlayer("Player 5", 19, "Address 5", 1.85, 80.0, 80000));
        players.add(new FootballPlayer("Player 6", 20, "Address 6", 1.75, 70.0, 95000));
        players.add(new FootballPlayer("Player 7", 19, "Address 7", 1.80, 75.0, 50000));
        players.add(new FootballPlayer("Player 8", 21, "Address 8", 1.85, 80.0, 60000));
        players.add(new FootballPlayer("Player 9", 24, "Address 9", 1.75, 70.0, 75000));

        ArrayList<FootballPlayer> team1players = new ArrayList<>();
        team1players.add(new FootballPlayer("Player 1", 25, "Address 1", 1.80, 75.0, 77000));
        team1players.add(new FootballPlayer("Player 2", 27, "Address 2", 1.85, 80.0, 80000));
        team1players.add(new FootballPlayer("Player 3", 24, "Address 3", 1.75, 70.0, 85000));

        ArrayList<FootballPlayer> team2players = new ArrayList<>();
        team2players.add(new FootballPlayer("Player 4", 26, "Address 4", 1.80, 75.0, 70000));
        team2players.add(new FootballPlayer("Player 5", 19, "Address 5", 1.85, 80.0, 80000));
        team2players.add(new FootballPlayer("Player 6", 20, "Address 6", 1.75, 70.0, 95000));

        ArrayList<FootballPlayer> team3players = new ArrayList<>();
        team3players.add(new FootballPlayer("Player 7", 19, "Address 7", 1.80, 75.0, 50000));
        team3players.add(new FootballPlayer("Player 8", 21, "Address 8", 1.85, 80.0, 60000));
        team3players.add(new FootballPlayer("Player 9", 24, "Address 9", 1.75, 70.0, 75000));


        // Sắp xếp danh sách cầu thủ theo lương tăng dần
        System.out.println("------------------------------------------------");
        System.out.println("Danh sách cầu thủ theo lương tăng dần :");
        ArrayList<FootballPlayer> sortedPlayers = FootballPlayer.sortSalary(players);

        // Hiển thị thông tin của các cầu thủ sau khi đã sắp xếp
        int playerNumber = 1;
        for (FootballPlayer player : sortedPlayers) {
            System.out.print( playerNumber + "-");
            player.display();
            playerNumber++;
        }

        // Tạo danh sách các đội bóng
        ArrayList<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam("Team 1", 1000000, team1players));
        teams.add(new FootballTeam("Team 2", 2000000, team2players));
        teams.add(new FootballTeam("Team 3", 1500000, team3players));

        ArrayList<FootballTeam> League1teams = new ArrayList<>();
        League1teams.add(new FootballTeam("Team 1", 1000000, team1players));
        League1teams.add(new FootballTeam("Team 2", 2000000, team2players));
        League1teams.add(new FootballTeam("Team 3", 1500000, team3players));

        ArrayList<FootballTeam> League2teams = new ArrayList<>();
        League2teams.add(new FootballTeam("Team 2", 2000000, team2players));
        League2teams.add(new FootballTeam("Team 3", 1500000, team3players));

        ArrayList<FootballTeam> League3teams = new ArrayList<>();
        League3teams.add(new FootballTeam("Team 1", 1000000, team1players));
        League3teams.add(new FootballTeam("Team 2", 2000000, team2players));



        // Tìm đội bóng có giá trị lớn nhất
        System.out.println("------------------------------------------------");
        System.out.print("đội bóng có giá trị lớn nhất :");
        ArrayList<FootballTeam> maxValuesTeams = FootballTeam.findMaxValuesTeam(teams);

        // Hiển thị thông tin của các đội bóng có giá trị lớn nhất
        for (FootballTeam team : maxValuesTeams) {
            team.display();
                   }

        // Tạo danh sách các giải đấu
        ArrayList<FootballLeague> leagues = new ArrayList<>();
        leagues.add(new FootballLeague("League 1", 5000000, League1teams));
        leagues.add(new FootballLeague("League 2", 7000000, League2teams));
        leagues.add(new FootballLeague("League 3", 9000000, League3teams));


        // Tìm giải đấu có nhiều đội bóng tham gia nhất
        System.out.println("------------------------------------------------");
        System.out.println("giải đấu có nhiều đội bóng tham gia nhất : " + leagues.size() +" đội" );
        ArrayList<FootballLeague> maxLeagues = FootballLeague.getMaxLeagueTeam(leagues);

        // Hiển thị thông tin của các giải đấu có nhiều đội bóng tham gia nhất
        for (FootballLeague league : maxLeagues) {
            league.display();
                    }
           }
}