package quanLiDoiBong;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách cầu thủ
        ArrayList<FootballPlayer> players = new ArrayList<>(Arrays.asList(
                new FootballPlayer("Nguyen Anh", 25, "Ha Noi", 1.80, 75.0, 77000),
                new FootballPlayer("Minh Tu", 27, "Phu Tho", 1.85, 80.0, 80000),
                new FootballPlayer("Lam", 24, "Hai Phong", 1.75, 70.0, 85000),
                new FootballPlayer("Duong Hoa", 26, "HCM", 1.80, 75.0, 70000),
                new FootballPlayer("Phong", 19, "Thanh Hoa", 1.85, 80.0, 80000),
                new FootballPlayer("Kien", 20, "HN", 1.75, 70.0, 95000),
                new FootballPlayer("Hung", 19, "HCM", 1.80, 75.0, 50000),
                new FootballPlayer("Son", 21, "HCM", 1.85, 80.0, 60000)

        ));

        // Sắp xếp danh sách cầu thủ theo lương tăng dần
        System.out.println("------------------------------------------------");
        System.out.println("Danh sách cầu thủ theo lương tăng dần :" );
        System.out.println();
        ArrayList<FootballPlayer> sortedPlayers = FootballPlayer.sortSalary(players);

        // Hiển thị thông tin của các cầu thủ sau khi đã sắp xếp
        int playerNumber = 1;
        for (FootballPlayer player : sortedPlayers) {
            System.out.print( playerNumber + "-");
            player.display();
            playerNumber++;
        }

        // Tạo danh sách các đội bóng
        ArrayList<FootballPlayer> team1players = new ArrayList<>(players.subList(0, 3));
        ArrayList<FootballPlayer> team2players = new ArrayList<>(players.subList(3, 6));
        ArrayList<FootballPlayer> team3players = new ArrayList<>(players.subList(6, 8));

        ArrayList<FootballTeam> teams = new ArrayList<>(Arrays.asList(
                new FootballTeam("doiHn", 1000000, team1players),
                new FootballTeam("doiCKM", 2000000, team2players),
                new FootballTeam("doiKIMD", 1500000, team3players)
        ));

        // Tìm đội bóng có giá trị lớn nhất
        System.out.println("------------------------------------------------");
        System.out.print("đội bóng có giá trị lớn nhất :");
        System.out.println();
        ArrayList<FootballTeam> maxValuesTeams = FootballTeam.findMaxValuesTeam(teams);

        // Hiển thị thông tin của các đội bóng có giá trị lớn nhất
        for (FootballTeam team : maxValuesTeams) {
            team.display();
        }

        // Tạo danh sách các giải đấu
        ArrayList<FootballTeam> League1teams = new ArrayList<>(teams);
        ArrayList<FootballTeam> League2teams = new ArrayList<>(teams.subList(1, 3));
        ArrayList<FootballTeam> League3teams = new ArrayList<>(teams.subList(0, 2));

        ArrayList<FootballLeague> leagues = new ArrayList<>(Arrays.asList(
                new FootballLeague("GiaiHN", 5000000, League1teams),
                new FootballLeague("GiaiKO", 7000000, League2teams),
                new FootballLeague("GiaiKI", 9000000, League3teams)
        ));

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
