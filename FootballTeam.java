package huongdoituong;

import java.util.ArrayList;

class FootballTeam {
    private String name;
    private long valuesTeam;
    private ArrayList<FootballPlayer> pl;

    public FootballTeam() {}

    public FootballTeam(String name, long valuesTeam, ArrayList<FootballPlayer> pl) {
        this.name = name;
        this.valuesTeam = valuesTeam;
        this.pl = pl;
    }

    public String getName() {
        return name;
    }

    public long getValuesTeam() {
        return valuesTeam;
    }

    public void display() {
        System.out.println("Team Name: " + name + ", Team Value: " + valuesTeam);
        for (FootballPlayer player : pl) {
            player.display();
        }
    }

    public double avgAgePlayer() {
        int totalAge = 0;
        for (FootballPlayer player : pl) {
            totalAge += player.getAge();
            //Cộng tuổi của cầu thủ hiện tại vào tổng tuổi totalAge
        }
        return (double) totalAge / pl.size();
        // chia tổng tuổi totalAge cho số lượng cầu thủ (được lấy từ pl.size()
    }

    public static ArrayList<FootballTeam> findMaxValuesTeam(ArrayList<FootballTeam> vt) {
        long maxValues = vt.get(0).getValuesTeam();
        //Khởi tạo biến maxValues với giá trị là giá trị của đội bóng đầu tiên trong danh sách vt.
        //vt là danh sách ban đầu chứa tất cả các đội bóng
        for (FootballTeam team : vt) {
            if (team.getValuesTeam() > maxValues) {
                //So sánh giá trị của đội bóng hiện tại với maxValues
                maxValues = team.getValuesTeam();
                // cập nhật maxValues
            }
        }
        ArrayList<FootballTeam> maxValuesTeams = new ArrayList<>();
        //Khởi tạo một ArrayList mới để lưu các đội bóng có giá trị lớn nhất.
        for (FootballTeam team : vt) {
            if (team.getValuesTeam() == maxValues) {
                // Kiểm tra xem giá trị của đội bóng hiện tại có bằng maxValues không
                maxValuesTeams.add(team);
                //Nếu có, thì thêm đội bóng này vào danh sách maxValuesTeams
            }
        }
        return maxValuesTeams;
    }
}
