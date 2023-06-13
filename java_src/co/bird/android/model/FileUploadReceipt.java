package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "", "assetId", "", "fileUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getFileUrl", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FileUploadReceipt {
    private final String assetId;
    private final String fileUrl;

    public FileUploadReceipt(String assetId, String fileUrl) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        this.assetId = assetId;
        this.fileUrl = fileUrl;
    }

    public static /* synthetic */ FileUploadReceipt copy$default(FileUploadReceipt fileUploadReceipt, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileUploadReceipt.assetId;
        }
        if ((i & 2) != 0) {
            str2 = fileUploadReceipt.fileUrl;
        }
        return fileUploadReceipt.copy(str, str2);
    }

    public final String component1() {
        return this.assetId;
    }

    public final String component2() {
        return this.fileUrl;
    }

    public final FileUploadReceipt copy(String assetId, String fileUrl) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        return new FileUploadReceipt(assetId, fileUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileUploadReceipt) {
            FileUploadReceipt fileUploadReceipt = (FileUploadReceipt) obj;
            return Intrinsics.areEqual(this.assetId, fileUploadReceipt.assetId) && Intrinsics.areEqual(this.fileUrl, fileUploadReceipt.fileUrl);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public int hashCode() {
        return (this.assetId.hashCode() * 31) + this.fileUrl.hashCode();
    }

    public String toString() {
        String str = this.assetId;
        String str2 = this.fileUrl;
        return "FileUploadReceipt(assetId=" + str + ", fileUrl=" + str2 + ")";
    }
}
