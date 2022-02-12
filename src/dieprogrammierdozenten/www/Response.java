package dieprogrammierdozenten.www;

public class Response {
    private ResponseStatus status;
    private String domain;
    private String path;
    private String source;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", domain='" + domain + '\'' +
                ", path='" + path + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
