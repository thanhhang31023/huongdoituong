package huongdoituong;

import java.util.ArrayList;

class FootballLeague {
    private String name;
    private long moneyBonus;
    private ArrayList<FootballTeam> ft;

    public FootballLeague() {}

    public FootballLeague(String name, long moneyBonus, ArrayList<FootballTeam> ft) {
        this.name = name;
        this.moneyBonus = moneyBonus;
        this.ft = ft;
    }

    public String getName() {
        return name;
    }

    public long getMoneyBonus() {
        return moneyBonus;
    }

    public void display() {
        System.out.println("League Name: " + name + ", Money Bonus: " + moneyBonus);
        for (FootballTeam team : ft) {
            team.display();
        }
    }

    public static ArrayList<FootballLeague> getMaxLeagueTeam(ArrayList<FootballLeague> vt) {
        int maxTeams = vt.get(0).ft.size();
        // khởi tạo biến maxTeams với số lượng đội trong giải đấu đầu tiên trong danh sách vt
        for (FootballLeague league : vt) {
            if (league.ft.size() > maxTeams) {
                maxTeams = league.ft.size();
            }
        }
        ArrayList<FootballLeague> maxTeamsLeagues = new ArrayList<>();
        for (FootballLeague league : vt) {
            if (league.ft.size() == maxTeams) {
                maxTeamsLeagues.add(league);
            }
        }
        return maxTeamsLeagues;
    }
}