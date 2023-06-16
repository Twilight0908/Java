package bookManagement.model;

public class Book extends Document {
    private String authorName;
    private int pageNumber;

    public Book(int documentId, String publisherName, int releaseNumber, String authorName, int pageNumber) {
        super(documentId, publisherName, releaseNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Ten Tac Gia: " + authorName +
                " So Trang: " + pageNumber;
    }
}
