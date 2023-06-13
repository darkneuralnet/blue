package zendesk.core;

import java.util.List;
/* loaded from: classes8.dex */
class Attachment {
    private String contentType;
    private String contentUrl;
    private String fileName;

    /* renamed from: id */
    private Long f121910id;
    private String mappedContentUrl;
    private Long size;
    private List<Attachment> thumbnails;
    private String url;

    public String getContentType() {
        return this.contentType;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getId() {
        return this.f121910id;
    }

    public Long getSize() {
        return this.size;
    }

    public List<Attachment> getThumbnails() {
        return C43505jm0.m29954c(this.thumbnails);
    }

    public String getUrl() {
        return this.url;
    }
}
