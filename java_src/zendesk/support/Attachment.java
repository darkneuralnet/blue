package zendesk.support;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes8.dex */
public class Attachment implements Serializable {
    private String contentType;
    private String contentUrl;
    private String fileName;
    private Long height;

    /* renamed from: id */
    private Long f121942id;
    private String mappedContentUrl;
    private Long size;
    private List<Attachment> thumbnails;
    private String url;
    private Long width;

    public String getContentType() {
        return this.contentType;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getHeight() {
        return this.height;
    }

    public Long getId() {
        return this.f121942id;
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

    public Long getWidth() {
        return this.width;
    }
}
