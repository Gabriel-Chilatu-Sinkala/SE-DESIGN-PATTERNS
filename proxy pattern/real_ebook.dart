import 'ebook.dart';

// Real E-Book: Potentially large, takes time to access
class RealEBook implements EBook {
  String _title;
  String _author;
  String _content;

  RealEBook(this._title, this._author, this._content);

  @override
  String get title => _title;

  @override
  String get author => _author;

  @override
  Future<void> displayContent() async {
    print("Simulating accessing full e-book content...");
    await Future.delayed(Duration(seconds: 1)); // Simulated delay
    print("-------------------------");
    print(_content);
    print("-------------------------");
  }
}
