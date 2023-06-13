package co.bird.android.model;

import co.bird.android.model.constant.AssetManagerType;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jr\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010 \u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0012¨\u00065"}, m28432d2 = {"Lco/bird/android/model/LocalAsset;", "", "id", "", "manager", "Lco/bird/android/model/constant/AssetManagerType;", "file", "Ljava/io/File;", "fileSize", "", "mediaType", "createdBy", "manifestDate", "Lorg/joda/time/DateTime;", "downloadedAt", "downloadUrl", "(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Ljava/io/File;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getCreatedBy", "()Ljava/lang/String;", "getDownloadUrl", "getDownloadedAt", "()Lorg/joda/time/DateTime;", "getFile", "()Ljava/io/File;", "getFileSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getManager", "()Lco/bird/android/model/constant/AssetManagerType;", "getManifestDate", "getMediaType", "mimeType", "getMimeType", "mimeType$delegate", "Lkotlin/Lazy;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Ljava/io/File;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)Lco/bird/android/model/LocalAsset;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LocalAsset {
    private final String createdBy;
    private final String downloadUrl;
    private final DateTime downloadedAt;
    private final File file;
    private final Long fileSize;

    /* renamed from: id */
    private final String f66603id;
    private final AssetManagerType manager;
    private final DateTime manifestDate;
    private final String mediaType;
    private final Lazy mimeType$delegate;

    public LocalAsset(String id, AssetManagerType manager, File file, Long l, String str, String str2, DateTime dateTime, DateTime downloadedAt, String str3) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadedAt, "downloadedAt");
        this.f66603id = id;
        this.manager = manager;
        this.file = file;
        this.fileSize = l;
        this.mediaType = str;
        this.createdBy = str2;
        this.manifestDate = dateTime;
        this.downloadedAt = downloadedAt;
        this.downloadUrl = str3;
        lazy = LazyKt__LazyJVMKt.lazy(new LocalAsset$mimeType$2(this));
        this.mimeType$delegate = lazy;
    }

    public final String component1() {
        return this.f66603id;
    }

    public final AssetManagerType component2() {
        return this.manager;
    }

    public final File component3() {
        return this.file;
    }

    public final Long component4() {
        return this.fileSize;
    }

    public final String component5() {
        return this.mediaType;
    }

    public final String component6() {
        return this.createdBy;
    }

    public final DateTime component7() {
        return this.manifestDate;
    }

    public final DateTime component8() {
        return this.downloadedAt;
    }

    public final String component9() {
        return this.downloadUrl;
    }

    public final LocalAsset copy(String id, AssetManagerType manager, File file, Long l, String str, String str2, DateTime dateTime, DateTime downloadedAt, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadedAt, "downloadedAt");
        return new LocalAsset(id, manager, file, l, str, str2, dateTime, downloadedAt, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalAsset) {
            LocalAsset localAsset = (LocalAsset) obj;
            return Intrinsics.areEqual(this.f66603id, localAsset.f66603id) && this.manager == localAsset.manager && Intrinsics.areEqual(this.file, localAsset.file) && Intrinsics.areEqual(this.fileSize, localAsset.fileSize) && Intrinsics.areEqual(this.mediaType, localAsset.mediaType) && Intrinsics.areEqual(this.createdBy, localAsset.createdBy) && Intrinsics.areEqual(this.manifestDate, localAsset.manifestDate) && Intrinsics.areEqual(this.downloadedAt, localAsset.downloadedAt) && Intrinsics.areEqual(this.downloadUrl, localAsset.downloadUrl);
        }
        return false;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final DateTime getDownloadedAt() {
        return this.downloadedAt;
    }

    public final File getFile() {
        return this.file;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final String getId() {
        return this.f66603id;
    }

    public final AssetManagerType getManager() {
        return this.manager;
    }

    public final DateTime getManifestDate() {
        return this.manifestDate;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getMimeType() {
        return (String) this.mimeType$delegate.getValue();
    }

    public int hashCode() {
        int hashCode = ((((this.f66603id.hashCode() * 31) + this.manager.hashCode()) * 31) + this.file.hashCode()) * 31;
        Long l = this.fileSize;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.mediaType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdBy;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.manifestDate;
        int hashCode5 = (((hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.downloadedAt.hashCode()) * 31;
        String str3 = this.downloadUrl;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66603id;
        AssetManagerType assetManagerType = this.manager;
        File file = this.file;
        Long l = this.fileSize;
        String str2 = this.mediaType;
        String str3 = this.createdBy;
        DateTime dateTime = this.manifestDate;
        DateTime dateTime2 = this.downloadedAt;
        String str4 = this.downloadUrl;
        return "LocalAsset(id=" + str + ", manager=" + assetManagerType + ", file=" + file + ", fileSize=" + l + ", mediaType=" + str2 + ", createdBy=" + str3 + ", manifestDate=" + dateTime + ", downloadedAt=" + dateTime2 + ", downloadUrl=" + str4 + ")";
    }

    public /* synthetic */ LocalAsset(String str, AssetManagerType assetManagerType, File file, Long l, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, assetManagerType, file, l, str2, str3, dateTime, dateTime2, (i & 256) != 0 ? null : str4);
    }
}
