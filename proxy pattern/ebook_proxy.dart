import 'ebook.dart';
import 'real_ebook.dart';
import 'dart:io';

class EBookProxy implements EBook {
  String book_title;
  String book_author;
  String book_preview;
  RealEBook? _realEBook;

  EBookProxy(this.book_title, this.book_author, this.book_preview);

  @override
  String get title => book_title;

  @override
  String get author => book_author;

  @override
  Future<void> displayContent() async {
    // Authorization simulation
    print("Enter your student ID:");
    var studentId = stdin.readLineSync();
    if (studentId!.isNotEmpty) {
      if (_realEBook == null) {
        print("Accessing real e-book for the first time...");
        // Placeholder for loading the full content in a real system
        _realEBook = RealEBook(book_title, book_author, "Full text...");
      }
      await _realEBook!.displayContent();
    } else {
      print("Preview only: Student ID required for full content.");
      print(book_preview);
    }
  }
}
