package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.BugReportAttachment;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/response/BugReportNewResponse;", "Landroid/os/Parcelable;", "reportId", "", "attachments", "", "Lco/bird/android/model/BugReportAttachment;", "(Ljava/lang/String;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "getReportId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BugReportNewResponse implements Parcelable {
    public static final Parcelable.Creator<BugReportNewResponse> CREATOR = new Creator();
    @JsonProperty("attachments")
    @InterfaceC41208ft5("attachments")
    private final List<BugReportAttachment> attachments;
    @JsonProperty("report_id")
    @InterfaceC41208ft5("report_id")
    private final String reportId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<BugReportNewResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BugReportNewResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(BugReportNewResponse.class.getClassLoader()));
            }
            return new BugReportNewResponse(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BugReportNewResponse[] newArray(int i) {
            return new BugReportNewResponse[i];
        }
    }

    public BugReportNewResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BugReportNewResponse copy$default(BugReportNewResponse bugReportNewResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bugReportNewResponse.reportId;
        }
        if ((i & 2) != 0) {
            list = bugReportNewResponse.attachments;
        }
        return bugReportNewResponse.copy(str, list);
    }

    public final String component1() {
        return this.reportId;
    }

    public final List<BugReportAttachment> component2() {
        return this.attachments;
    }

    public final BugReportNewResponse copy(String reportId, List<BugReportAttachment> attachments) {
        Intrinsics.checkNotNullParameter(reportId, "reportId");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        return new BugReportNewResponse(reportId, attachments);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BugReportNewResponse) {
            BugReportNewResponse bugReportNewResponse = (BugReportNewResponse) obj;
            return Intrinsics.areEqual(this.reportId, bugReportNewResponse.reportId) && Intrinsics.areEqual(this.attachments, bugReportNewResponse.attachments);
        }
        return false;
    }

    public final List<BugReportAttachment> getAttachments() {
        return this.attachments;
    }

    public final String getReportId() {
        return this.reportId;
    }

    public int hashCode() {
        return (this.reportId.hashCode() * 31) + this.attachments.hashCode();
    }

    public String toString() {
        String str = this.reportId;
        List<BugReportAttachment> list = this.attachments;
        return "BugReportNewResponse(reportId=" + str + ", attachments=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.reportId);
        List<BugReportAttachment> list = this.attachments;
        out.writeInt(list.size());
        for (BugReportAttachment bugReportAttachment : list) {
            out.writeParcelable(bugReportAttachment, i);
        }
    }

    public BugReportNewResponse(String reportId, List<BugReportAttachment> attachments) {
        Intrinsics.checkNotNullParameter(reportId, "reportId");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        this.reportId = reportId;
        this.attachments = attachments;
    }

    public /* synthetic */ BugReportNewResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
