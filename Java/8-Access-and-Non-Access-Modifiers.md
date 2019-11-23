- [Access and Non Access Modifiers in Java](#access-and-non-access-modifiers-in-java)
- [Access Modifiers:](#access-modifiers)
  - [Cách chúng làm việc](#cách-chúng-làm-việc)
- [Non-access modifiers:](#non-access-modifiers)

# Access and Non Access Modifiers in Java

Java cung cấp một tập lớn modifiers. Chúng được sử dụng để điều khiển cơ chế và cung cấp thông tin về chức năng của class cho JVM. Chúng được chia ra làm 2 loại

# Access Modifiers: 
Java's access modifiers là public, private và protected. Java cũng định nghĩa default access (còn được gọi package-private).

## Cách chúng làm việc
* **Public**: Khi một thành viên của class được modified bởi public, thì thành viên đó có thể truy cập ở bất cứ đâu.
* **Private**: Khi một thành viên của class được modified bởi private, thì thành viên đó chỉ co thể truy cập bởi các thành viên khác trong class đó.

Bây giờ bạn có thể hiểu tại sao main() luôn là public. Nó được gọi bởi code ngoài chương trương trình bằng hệ thống Java run-time.Khi không có access modifier được sử dụng thì giá trị mặc định là default hay là public bên trong package chứa class đó (không thể truy cập bởi code ngoài package).

* **Protected**: Chỉ áp dụng khi có liên quan đến kế thừa.

Tìm hiểu thêm về [Access Modifiers](https://www.geeksforgeeks.org/access-modifiers-java/) trong Java.


# Non-access modifiers:
Trong Java, chúng ta có 7 non-access modifiers. Chúng được sử dụng với classes, methods, variable, constructors etc để cung cấp thông tin về hành vi của chúng cho JVM. Chúng là:
* [static](https://www.geeksforgeeks.org/static-keyword-java/)
* [final](https://www.geeksforgeeks.org/final-keyword-java/)
* [abstract]()
* [synchronized](https://www.geeksforgeeks.org/synchronized-in-java/)
* [transient](https://www.geeksforgeeks.org/transient-keyword-java/)
* [volatile](https://www.geeksforgeeks.org/volatile-keyword-in-java/)
* [native]()

