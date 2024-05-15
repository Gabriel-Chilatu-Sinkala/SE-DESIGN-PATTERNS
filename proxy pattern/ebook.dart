// Simplified interface for e-books
abstract class EBook {
  String get title;
  String get author;
  Future<void> displayContent();
}
