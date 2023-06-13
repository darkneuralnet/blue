package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/BugReportUpdateFileResponse;", "Landroid/os/Parcelable;", "fileId", "", "(Ljava/lang/String;)V", "getFileId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BugReportUpdateFileResponse implements Parcelable {
    public static final Parcelable.Creator<BugReportUpdateFileResponse> CREATOR = new Creator();
    @JsonProperty("file_id")
    @InterfaceC41208ft5("file_id")
    private final String fileId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<BugReportUpdateFileResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BugReportUpdateFileResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BugReportUpdateFileResponse(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BugReportUpdateFileResponse[] newArray(int i) {
            return new BugReportUpdateFileResponse[i];
        }
    }

    public BugReportUpdateFileResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ BugReportUpdateFileResponse copy$default(BugReportUpdateFileResponse bugReportUpdateFileResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bugReportUpdateFileResponse.fileId;
        }
        return bugReportUpdateFileResponse.copy(str);
    }

    public final String component1() {
        return this.fileId;
    }

    public final BugReportUpdateFileResponse copy(String fileId) {
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        return new BugReportUpdateFileResponse(fileId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BugReportUpdateFileResponse) && Intrinsics.areEqual(this.fileId, ((BugReportUpdateFileResponse) obj).fileId);
    }

    public final String getFileId() {
        return this.fileId;
    }

    public int hashCode() {
        return this.fileId.hashCode();
    }

    public String toString() {
        String str = this.fileId;
        return "BugReportUpdateFileResponse(fileId=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.fileId);
    }

    public BugReportUpdateFileResponse(String fileId) {
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        this.fileId = fileId;
    }

    public /* synthetic */ BugReportUpdateFileResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}