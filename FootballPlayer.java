package huongdoituong;
import java.util.ArrayList;

class FootballPlayer {
    private String name;
    private int age;
    private String add;
    private double height;
    private double weight;
    private long salary;

    public FootballPlayer() {}

    public FootballPlayer(String name, int age, String add, double height, double weight, long salary) {
        this.name = name;
        this.age = age;
        this.add = add;
        this.height = height;
        this.weight = weight;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + add + ", Height: " + height + ", Weight: " + weight + ", Salary: " + salary);
    }

    public static ArrayList<FootballPlayer> sortSalary(ArrayList<FootballPlayer> v) {
        int n = v.size();
        // v là tham số chứa danh sách cần sắp xếp
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (v.get(j).getSalary() > v.get(j+1).getSalary()) {
                    // So sánh lương của hai cầu thủ liền kề
                    FootballPlayer temp = v.get(j);
                    // Lưu cầu thủ ở vị trí j vào biến tạm temp
                    v.set(j, v.get(j+1));
                    //Đặt cầu thủ ở vị trí j+1 vào vị trí j
                    v.set(j+1, temp);
                    //Đặt cầu thủ từ biến tạm temp vào vị trí j+1
                }
            }
        }
        return v;
    }
}
