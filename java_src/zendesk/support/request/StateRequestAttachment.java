package zendesk.support.request;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.belvedere.MediaResult;
import zendesk.support.Attachment;
import zendesk.support.AttachmentFile;
import zendesk.support.CommentResponse;
import zendesk.support.IdUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class StateRequestAttachment implements Serializable, Comparable<StateRequestAttachment> {
    private static final String DEFAULT_MIME_TYPE = "application/octet-stream";
    private final int height;

    /* renamed from: id */
    private final long f122002id;
    private final transient File localFile;
    private final String localUri;
    private final String mimeType;
    private final String name;
    private final long size;
    private final String thumbnailUrl;
    private final String token;
    private final String url;
    private final int width;

    /* loaded from: classes8.dex */
    public static class Builder {
        private int height;

        /* renamed from: id */
        private long f122003id;
        private File localFile;
        private String localUri;
        private String mimeType;
        private String name;
        private long size;
        private String thumbnailUrl;
        private String token;
        private String url;
        private int width;

        public StateRequestAttachment build() {
            return new StateRequestAttachment(this);
        }

        public Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder setId(long j) {
            this.f122003id = j;
            return this;
        }

        public Builder setLocalFile(File file) {
            this.localFile = file;
            return this;
        }

        public Builder setLocalUri(String str) {
            this.localUri = str;
            return this;
        }

        public Builder setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setSize(long j) {
            this.size = j;
            return this;
        }

        public void setThumbnailUrl(String str) {
            this.thumbnailUrl = str;
        }

        public Builder setToken(String str) {
            this.token = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        private Builder(StateRequestAttachment stateRequestAttachment) {
            this.f122003id = stateRequestAttachment.getId();
            this.localFile = stateRequestAttachment.getLocalFile();
            this.localUri = stateRequestAttachment.getLocalUri();
            this.url = stateRequestAttachment.getUrl();
            this.token = stateRequestAttachment.getToken();
            this.mimeType = stateRequestAttachment.getMimeType();
            this.name = stateRequestAttachment.getName();
            this.size = stateRequestAttachment.getSize();
            this.width = stateRequestAttachment.getWidth();
            this.height = stateRequestAttachment.getHeight();
            this.thumbnailUrl = stateRequestAttachment.getThumbnailUrl();
        }
    }

    public static C48526sE3<Map<Long, StateRequestAttachment>, StateIdMapper> convert(List<CommentResponse> list, Map<Long, MediaResult> map, StateIdMapper stateIdMapper) {
        ArrayList arrayList = new ArrayList();
        for (CommentResponse commentResponse : list) {
            arrayList.addAll(commentResponse.getAttachments());
        }
        return convert(arrayList, stateIdMapper, map);
    }

    private static String getMimeTypeForFile(File file) {
        return C45705nU2.m23611b(C50610vl1.m8198a(file.getName()));
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.f122002id;
    }

    public File getLocalFile() {
        return this.localFile;
    }

    public String getLocalUri() {
        return this.localUri;
    }

    public String getMimeType() {
        return C44504lS5.m27273b(this.mimeType) ? this.mimeType : "application/octet-stream";
    }

    public String getName() {
        return this.name;
    }

    public Uri getParsedLocalUri() {
        return Uri.parse(this.localUri);
    }

    public long getSize() {
        return this.size;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAvailableLocally() {
        return (this.localUri == null || getParsedLocalUri() == null || this.localFile == null) ? false : true;
    }

    public Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        return "RequestAttachment{id=" + this.f122002id + ", localUri='" + this.localUri + CoreConstants.SINGLE_QUOTE_CHAR + ", localFile=" + this.localFile + ", url='" + this.url + CoreConstants.SINGLE_QUOTE_CHAR + ", token='" + this.token + CoreConstants.SINGLE_QUOTE_CHAR + ", mimeType='" + this.mimeType + CoreConstants.SINGLE_QUOTE_CHAR + ", name='" + this.name + CoreConstants.SINGLE_QUOTE_CHAR + ", size='" + this.size + CoreConstants.SINGLE_QUOTE_CHAR + ", width='" + this.width + CoreConstants.SINGLE_QUOTE_CHAR + ", height='" + this.height + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }

    public StateRequestAttachment(long j, String str, File file, String str2, String str3, String str4, String str5, long j2, int i, int i2, String str6) {
        this.f122002id = j;
        this.localUri = str;
        this.localFile = file;
        this.url = str2;
        this.token = str3;
        this.mimeType = str4;
        this.name = str5;
        this.size = j2;
        this.width = i;
        this.height = i2;
        this.thumbnailUrl = str6;
    }

    @Override // java.lang.Comparable
    public int compareTo(StateRequestAttachment stateRequestAttachment) {
        return (int) (this.f122002id - stateRequestAttachment.f122002id);
    }

    public static C48526sE3<Map<Long, StateRequestAttachment>, StateIdMapper> convert(List<Attachment> list, StateIdMapper stateIdMapper, Map<Long, MediaResult> map) {
        long newLongId;
        String str;
        File file;
        HashMap hashMap = new HashMap(list.size());
        for (Attachment attachment : list) {
            if (attachment.getId() != null) {
                if (stateIdMapper.hasLocalId(attachment.getId())) {
                    newLongId = stateIdMapper.getLocalId(attachment.getId()).longValue();
                } else {
                    newLongId = IdUtil.newLongId();
                    stateIdMapper.addIdMapping(attachment.getId(), Long.valueOf(newLongId));
                }
                long j = newLongId;
                if (map.containsKey(attachment.getId())) {
                    MediaResult mediaResult = map.get(attachment.getId());
                    File m785c = mediaResult.m785c();
                    str = mediaResult.m779j().toString();
                    file = m785c;
                } else {
                    str = null;
                    file = null;
                }
                hashMap.put(attachment.getId(), new StateRequestAttachment(j, str, file, attachment.getContentUrl(), "", attachment.getContentType(), attachment.getFileName(), attachment.getSize() != null ? attachment.getSize().longValue() : -1L, (int) (attachment.getWidth() != null ? attachment.getWidth().longValue() : -1L), (int) (attachment.getHeight() != null ? attachment.getHeight().longValue() : -1L), C43505jm0.m29948i(attachment.getThumbnails()) ? attachment.getThumbnails().get(0).getContentUrl() : ""));
            }
        }
        return C48526sE3.m14515a(hashMap, stateIdMapper);
    }

    private StateRequestAttachment(Builder builder) {
        this.localFile = builder.localFile;
        this.localUri = builder.localUri;
        this.mimeType = builder.mimeType;
        this.name = builder.name;
        this.f122002id = builder.f122003id;
        this.url = builder.url;
        this.token = builder.token;
        this.size = builder.size;
        this.width = builder.width;
        this.height = builder.height;
        this.thumbnailUrl = builder.thumbnailUrl;
    }

    public static StateRequestAttachment convert(MediaResult mediaResult) {
        return new StateRequestAttachment(IdUtil.newLongId(), mediaResult.m779j().toString(), mediaResult.m785c(), "", "", mediaResult.m783e(), mediaResult.m782g(), mediaResult.m780i(), (int) mediaResult.m778k(), (int) mediaResult.m784d(), "");
    }

    public static StateRequestAttachment convert(File file) {
        return new StateRequestAttachment(IdUtil.newLongId(), Uri.fromFile(file).toString(), file, "", "", getMimeTypeForFile(file), file.getName(), file.length(), -1, -1, "");
    }

    public static StateRequestAttachment convert(AttachmentFile attachmentFile) {
        return new StateRequestAttachment(IdUtil.newLongId(), Uri.fromFile(attachmentFile.getFile()).toString(), attachmentFile.getFile(), "", "", getMimeTypeForFile(attachmentFile.getFile()), attachmentFile.getFileName(), attachmentFile.getFile().length(), -1, -1, "");
    }

    public static MediaResult convert(StateRequestAttachment stateRequestAttachment) {
        return new MediaResult(stateRequestAttachment.getLocalFile(), stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getName(), stateRequestAttachment.getMimeType(), stateRequestAttachment.getSize(), stateRequestAttachment.getWidth(), stateRequestAttachment.getHeight());
    }
}
