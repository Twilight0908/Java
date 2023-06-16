package bookManagement.model;

public class Document {
    private int documentId;
    private String publisherName;
    private int releaseNumber;

    public Document() {
    }

    public Document(int documentId, String publisherName, int releaseNumber) {
        this.documentId = documentId;
        this.publisherName = publisherName;
        this.releaseNumber = releaseNumber;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Ma Tai Lieu: " + documentId +
                " Ten Nha Xuat Ban: " + publisherName +
                " So Ban Phat Hanh: " + releaseNumber;
    }
}
