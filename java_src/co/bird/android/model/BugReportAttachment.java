package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/BugReportAttachment;", "Landroid/os/Parcelable;", "fileId", "", "fileName", "uploadUrl", "expirationDate", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getExpirationDate", "()Lorg/joda/time/DateTime;", "getFileId", "()Ljava/lang/String;", "getFileName", "getUploadUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BugReportAttachment implements Parcelable {
    public static final Parcelable.Creator<BugReportAttachment> CREATOR = new Creator();
    @JsonProperty("expiration_date")
    @InterfaceC41208ft5("expiration_date")
    private final DateTime expirationDate;
    @JsonProperty("file_id")
    @InterfaceC41208ft5("file_id")
    private final String fileId;
    @JsonProperty("file_name")
    @InterfaceC41208ft5("file_name")
    private final String fileName;
    @JsonProperty("upload_url")
    @InterfaceC41208ft5("upload_url")
    private final String uploadUrl;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<BugReportAttachment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BugReportAttachment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BugReportAttachment(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BugReportAttachment[] newArray(int i) {
            return new BugReportAttachment[i];
        }
    }

    public BugReportAttachment() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BugReportAttachment copy$default(BugReportAttachment bugReportAttachment, String str, String str2, String str3, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bugReportAttachment.fileId;
        }
        if ((i & 2) != 0) {
            str2 = bugReportAttachment.fileName;
        }
        if ((i & 4) != 0) {
            str3 = bugReportAttachment.uploadUrl;
        }
        if ((i & 8) != 0) {
            dateTime = bugReportAttachment.expirationDate;
        }
        return bugReportAttachment.copy(str, str2, str3, dateTime);
    }

    public final String component1() {
        return this.fileId;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.uploadUrl;
    }

    public final DateTime component4() {
        return this.expirationDate;
    }

    public final BugReportAttachment copy(String fileId, String str, String str2, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        return new BugReportAttachment(fileId, str, str2, dateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BugReportAttachment) {
            BugReportAttachment bugReportAttachment = (BugReportAttachment) obj;
            return Intrinsics.areEqual(this.fileId, bugReportAttachment.fileId) && Intrinsics.areEqual(this.fileName, bugReportAttachment.fileName) && Intrinsics.areEqual(this.uploadUrl, bugReportAttachment.uploadUrl) && Intrinsics.areEqual(this.expirationDate, bugReportAttachment.expirationDate);
        }
        return false;
    }

    public final DateTime getExpirationDate() {
        return this.expirationDate;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        int hashCode = this.fileId.hashCode() * 31;
        String str = this.fileName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uploadUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.expirationDate;
        return hashCode3 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.fileId;
        String str2 = this.fileName;
        String str3 = this.uploadUrl;
        DateTime dateTime = this.expirationDate;
        return "BugReportAttachment(fileId=" + str + ", fileName=" + str2 + ", uploadUrl=" + str3 + ", expirationDate=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.fileId);
        out.writeString(this.fileName);
        out.writeString(this.uploadUrl);
        out.writeSerializable(this.expirationDate);
    }

    public BugReportAttachment(String fileId, String str, String str2, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        this.fileId = fileId;
        this.fileName = str;
        this.uploadUrl = str2;
        this.expirationDate = dateTime;
    }

    public /* synthetic */ BugReportAttachment(String str, String str2, String str3, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : dateTime);
    }
}
