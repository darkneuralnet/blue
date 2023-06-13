package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/QCInspectionType;", "", "id", "", "display", "issueTypeId", RequestHeadersFactory.MODEL, "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDisplay", "getId", "getIssueTypeId", "getModel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QCInspectionType {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66616id;
    @JsonProperty("issue_type_id")
    @InterfaceC41208ft5("issue_type_id")
    private final String issueTypeId;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;

    public QCInspectionType() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ QCInspectionType copy$default(QCInspectionType qCInspectionType, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qCInspectionType.f66616id;
        }
        if ((i & 2) != 0) {
            str2 = qCInspectionType.display;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = qCInspectionType.issueTypeId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = qCInspectionType.model;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = qCInspectionType.description;
        }
        return qCInspectionType.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.f66616id;
    }

    public final String component2() {
        return this.display;
    }

    public final String component3() {
        return this.issueTypeId;
    }

    public final String component4() {
        return this.model;
    }

    public final String component5() {
        return this.description;
    }

    public final QCInspectionType copy(String id, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new QCInspectionType(id, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QCInspectionType) {
            QCInspectionType qCInspectionType = (QCInspectionType) obj;
            return Intrinsics.areEqual(this.f66616id, qCInspectionType.f66616id) && Intrinsics.areEqual(this.display, qCInspectionType.display) && Intrinsics.areEqual(this.issueTypeId, qCInspectionType.issueTypeId) && Intrinsics.areEqual(this.model, qCInspectionType.model) && Intrinsics.areEqual(this.description, qCInspectionType.description);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66616id;
    }

    public final String getIssueTypeId() {
        return this.issueTypeId;
    }

    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        int hashCode = this.f66616id.hashCode() * 31;
        String str = this.display;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.issueTypeId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66616id;
        String str2 = this.display;
        String str3 = this.issueTypeId;
        String str4 = this.model;
        String str5 = this.description;
        return "QCInspectionType(id=" + str + ", display=" + str2 + ", issueTypeId=" + str3 + ", model=" + str4 + ", description=" + str5 + ")";
    }

    public QCInspectionType(String id, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66616id = id;
        this.display = str;
        this.issueTypeId = str2;
        this.model = str3;
        this.description = str4;
    }

    public /* synthetic */ QCInspectionType(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
