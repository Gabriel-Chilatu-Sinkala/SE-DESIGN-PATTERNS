import 'ebook_proxy.dart';
import 'dart:io';

void main() async {
  var ebook =
      EBookProxy("Design Patterns", "Gang of Four", "Preview: Introduction...");

  bool shouldExit = false;

  while (!shouldExit) {
    print("\n--- E-Book Menu ---");
    print("Title: ${ebook.title}");
    print("Author: ${ebook.author}");
    print("\nOptions:");
    print("1. Display Preview");
    print("2. Display Full Content");
    print("3. Exit");

    print("\nEnter your choice:");
    var choice = stdin.readLineSync();

    switch (choice) {
      case '1':
        print(ebook.book_preview);
        await Future.delayed(Duration(seconds: 3));
        break;
      case '2':
        await ebook.displayContent();
        await Future.delayed(Duration(seconds: 3));
        break;
      case '3':
        shouldExit = true;
        await Future.delayed(Duration(seconds: 3));
        break;
      default:
        print("Invalid option");
    }
  }

  print("Exiting program...");
}
