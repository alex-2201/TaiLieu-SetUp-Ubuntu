## BÀI TẬP LÝ THUYẾT MÔN HỌC: LINUX VÀ PMMNM
## CHƯƠNG 3: QUẢN LÝ TIẾN TRÌNH
### _Họ và tên: Nguyễn Văn Sơn_
### _Mã lớp: ĐTLT.CNTT01-K3_
### _Mã sinh viên: 201910429_
---

**Câu hỏi 1**: Liệt kê các trạng thái của tiến trình và giải thích.
__Trả lời:__
- R – running or runnable (on run queue): đang chạy hoặc có thể chạy.
- D – uninterruptible sleep: tiến trình không thể kill hoặc ngắt bởi signal.
- S – interruptible sleep: chờ một sự kiện để hoàn thành.
- Z – defunct/zombie: tiến trình đã chấm dứt nhưng chưa được giải phóng tài
nguyên sử dụng bởi tiến trình cha.
- T – stopped: tiến trình đã dừng.

**Câu hỏi 2**: Lệnh ps và top giống và khác nhau như thế nào?

__Trả lời:__ Lệnh ps và top đều cho biết thông tin các tiến trình nhưng lệnh ps chỉ cho biết thông tin ở thời điểm thực thi lệnh và thoát còn lệnh top sẽ cho biết thông tin online đến khi người dùng thoát khỏi chương trình.

**Câu hỏi 3**: Tác dụng của cơ chế chuyển hướng các kênh chuẩn là gì?

__Trả lời:__
Để lấy dữ liệu đầu vào từ các nguồn khác nhau và đưa dữ liệu đầu ra ra các
nguồn khác với nguồn chuẩn.

**Câu hỏi 4**: Giải thích ý nghĩa thực hiện của từng thành phần câu lệnh sử dụng cơ chế đường ống sau. Từ đó đưa ra ý nghĩa tổng thể của cả câu lệnh.
`ps aux | grep conky | grep -v grep | awk '{print $2}' | xargs kill`

__Trả lời:__

- ps aux: hiển thị tất cả các tiến trình đang chạy trong máy
- grep conky: lấy các dòng có chứa conky
- grep -v grep: bỏ các dòng có chứa grepawk ‘{print $2}’: in giá trị ở cột thứ 2
- xagrs: nhận tham số và truyền tham số cho lệnh tiếp theo
- kill: kill tiến trình

Ý nghĩa của cả câu lệnh: tìm tiến trình tên conky và kill tiến trình đó