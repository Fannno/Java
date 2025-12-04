
import java.util.*;

class Point {

    int x, y;

    Point() {
    }

    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    Point(Point p2) {
        this(p2.x, p2.y);
    }

    // 自行加入所需函數，如dist(), equals()等
    static double dist(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return this.x == p.x && this.y == p.y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

public class MI3C_HWK5_412631532_03 {

    public static void main(String[] args) {
        // locus2D: 記錄無人機在移動的軌跡，2D
        ArrayList<Point> locus2D = new ArrayList<>();
        Random r = new Random(222);
        // 使用亂數將60個點(x,y)加入locus2D中， x,y的值均被限制在[0,9] 
        int pNo = 60;
        for (int i = 0; i < pNo; i++) {
            locus2D.add(new Point(r.nextInt(10), r.nextInt(10)));
        }
        System.out.println("locus2D[0~9]=" + locus2D.subList(0, 10)); // 只印出前10個
        // 依序計算這些點的直線總距離(共有59段線)
        double totalDist = 0;
        // DIY here
        for (int i = 0; i < locus2D.size() - 1; i++) {
            totalDist += Point.dist(locus2D.get(i), locus2D.get(i + 1));
        }
        System.out.printf("total distance=%.3f\n", totalDist);
        // 找出曾經出現超過2次的點，格式參考[程式輸出]，印出時無需依照特定次序
        // DIY here
        for (int i = 0; i < locus2D.size(); i++) {
            int cnt = 0;
            for (int j = 0; j < locus2D.size(); j++) {
                if (locus2D.get(i).equals(locus2D.get(j))) {
                    cnt++;
                }
            }
            if (cnt > 2) {
                boolean p = false;
                for (int j = 0; j < i; j++) {
                    if (locus2D.get(i).equals(locus2D.get(j))) {
                        p = true;
                        break;
                    }
                }
                if (!p) {
                    System.out.println(locus2D.get(i) + "->" + cnt);
                }
            }
        }

    }
}
/*
locus2D[0~9]=[(1,1), (2,8), (6,9), (0,2), (1,9), (0,0), (4,2), (8,4), (3,1), (0,6)]
total distance=352.038
(0,7)->3
(2,8)->3
(6,1)->3
 */
