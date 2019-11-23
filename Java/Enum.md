# Java Enum là gì?
Enum là một kiểu dữ liệu đặc biệt cho phép một biến có thể là một tập hợp các hằng số định sẵn. Biến phải bằng một trong các giá trị đã được xác định trước cho nó. Các ví dụ phổ biến bao gồm các hướng của la bàn (giá trị : Bắc, Nam, Đông và Tây) và những ngày trong tuần, ....

Bởi vì các giá trị của Enum là các hằng số, nên tên của các trường kiểu enum là các chữ cái hoa.

Trong ngôn ngữ lập trình Java, bạn xác định một kiểu enum bằng cách sử dụng từ khóa enum. Ví dụ, bạn sẽ xác định một loại enum các ngày trong tuần như sau:

```
public enum Day {
     SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
     THURSDAY, FRIDAY, SATURDAY 
}
```
Bạn nên sử dụng các loại enum bất cứ lúc nào bạn cần phải đại diện cho một tập hợp các hằng số cố định.

## Dưới đây là code minh họa cách sử dụng enum Day:
```
public class EnumTest {
    Day day;
    
    public EnumTest(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
```
Output:
```
Mondays are bad.
Midweek days are so-so.
Fridays are better.
Weekends are best.
Weekends are best.
```
Khai báo enum có nghĩa là định nghĩa một class (được gọi là kiểu enum). Phần thân của Enum có thể bao gồm các phương thức(method) và các trường dữ liệu(field). Trình biên dịch tự động thêm một số phương thức(method) đặc biệt khi nó tạo ra một enum. Ví dụ, chúng có một phương thức static values() trả về một mảng chứa tất cả các giá trị của enum theo thứ tự chúng được khai báo. Phương thức này thường được sử dụng kết hợp với cấu trúc for-each để lặp các giá trị của một kiểu enum như ví dụ dưới đây:
```
for (Planet p : Planet.values()) {
    System.out.printf("Your weight on %s is %f%n",
                      p, p.surfaceWeight(mass));
}
```
Lưu ý: Tất cả các enums ngầm extend java.lang.Enum. Bởi vì ngôn ngữ Java không hỗ trợ đa thừa kế do đó một enum không thể extend bất cứ class nào khác.
## Ví dụ về sử dụng enum
```
public enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double mass;   // in kilograms
    private final double radius; // in meters
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    private double mass() { return mass; }
    private double radius() { return radius; }

    // universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Planet <earth_weight>");
            System.exit(-1);
        }
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight/EARTH.surfaceGravity();
        for (Planet p : Planet.values())
           System.out.printf("Your weight on %s is %f%n",
                             p, p.surfaceWeight(mass));
    }
}
```
```
Chạy Planet.class từ command line với tham số 175, bạn sẽ thấy kết quả:

$ java Planet 175
Your weight on MERCURY is 66.107583
Your weight on VENUS is 158.374842
Your weight on EARTH is 175.000000
Your weight on MARS is 66.279007
Your weight on JUPITER is 442.847567
Your weight on SATURN is 186.552719
Your weight on URANUS is 158.397260
Your weight on NEPTUNE is 199.20741
```